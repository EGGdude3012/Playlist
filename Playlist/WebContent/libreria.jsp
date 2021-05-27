<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Libreria de Musica</title>

<style type=text/css>
.fixed {position:fixed;top:0;right:0;width:300px;border: 3px solid;}
#banner {overflow-wrap: break-word;}
</style>

</head>
<body>
    <c:forEach items="${songs}" var="song">
        <ul>
            <br>
            <br>
            <div>
                <div class="card" style="width: 18rem;">
                    <img src="${song.picture}" class="card-img-top" width="100" height="100">
                    <div class="card-body">
                        <h5 class="card-title">Reproducir</h5>
                        <p class="card-text">
                            ${song.songTitle}
                            ${song.artist}
                        </p>
                        <button class="botones" name="${song.songTitle} / ${song.artist}" id="${song.id}" onclick="myFunction()">Agregar a lista de reproduccion</button>
                    </div>
                </div>
            </div>
        </ul>
    </c:forEach>
    <form action="createPlaylist" class="fixed" method="get">
        <div>
            <h3><small class="text-muted">Elija un Orden de Reproduccion</small></h3>
            <input type="radio" name="orden" value="Pila">Pila
            <input type="radio" name="orden" value="Cola">Cola
            <input type="radio" name="orden" value="Aleatorio">Aleatorio
        </div>
        <div>
            <h3><small class="text-muted">Selecciones para lista:</small></h3>
            <p id="banner"></p>
            <input type="hidden" id="hiddenEntry" name="secreto" value="">
        </div>
        <input type="submit">
    </form>
    
    <script type="text/javascript">
        var submitPlaylist = [];
        var buttons = document.getElementsByClassName('botones');
        for (let i = 0; i < buttons.length; i++) {
            buttons[i].addEventListener('click', function() {
                submitPlaylist.push(buttons[i].id);
                document.getElementById("banner").innerHTML = document.getElementById("banner").innerHTML + (submitPlaylist.length) + " - " + buttons[i].name + "<br>";
                document.getElementById("hiddenEntry").value = submitPlaylist;
            })
        }
    </script>
</body>
</html>