<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Playlist</title>

<style type=text/css>
#listarepro,audio{background:#666;width:400px;padding:20px;}
.active a{color:#5DB0E6;text-decoration:none;}
li a{color:#eeeedd;background:#333;padding:5px;display:block;}
li a:hover{text-decoration:none;}
</style>

</head>
<body>

    <c:if test="${playlist.size() < 10 }" >
        <h1>La lista de reproduccion debe tener 10 canciones como minimo.</h1>
    </c:if>

    <c:if test="${playlist.size() >= 10}" >
    
    <audio id="audio" preload="auto" tabindex="0" controls="">
        <source src="${playlist.get(0).audioFile}" >
    </audio>
    
    <ul id="listarepro">
    <c:forEach items="${playlist}" var="play" varStatus="loop">
        
        <li class="active">
            <a href="${play.audioFile}">
                ${loop.count} - ${play.songTitle} / ${play.artist}
            </a>
        </li>
    </c:forEach>
    </ul>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script>
    $(document).ready(function () {
    	init();
    	function init () {
    		var current = 0;
    		var audio = $('#audio');
    		var playlist = $('#listarepro');
    		var tracks = playlist.find('li a');
    		var len = tracks.length - 1;
    		audio[0].volume = .10;
    		audio[0].play();
    		playlist.on('click', 'a', function(e){
    			e.preventDefault();
    			link = $(this);
    			current = link.parent().index();
    			run(link, audio[0]);
    		});
    		audio[0].addEventListener('ended',function(e) {
    			current++;
    			if(current == len) {
    				current = 0;
    				link = playlist.find('a')[0];
    			} else {
    				link = playlist.find('a')[current];
    			}
    			run($(link),audio[0]);
    		});
    	}
    	function run(link, player) {
    		player.src = link.attr('href');
    		par = link.parent();
    		par.addClass('active').siblings().removeClass('active');
    		player.load();
    		player.play();
    	}
    });
    </script>
    
    <button type="button" onclick="javascript:history.back()">Regresar a libreria</button>
    </c:if>
</body>
</html>