package com.playlistprogra;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeServlet")

public class HomeServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        List<MusicLibrary> canciones = Arrays.asList
                (
                        new MusicLibrary(1, "./resources/with_or_without_you.mp3", "https://upload.wikimedia.org/wikipedia/en/c/c1/With_or_Without_You_vinyl_single.jpg", "With or Without You", "U2"),
                        new MusicLibrary(2, "./resources/lets_get_it_on.mp3", "https://upload.wikimedia.org/wikipedia/en/6/69/Let's_Get_It_On.jpg", "Let's Get It On", "Marvin Gaye"),
                        new MusicLibrary(3, "./resources/bohemian_rhapsody.mp3", "https://upload.wikimedia.org/wikipedia/en/9/9f/Bohemian_Rhapsody.png", "Bohemian Rhapsody", "Queen"),
                        new MusicLibrary(4, "./resources/dont_stop_believin.mp3", "https://upload.wikimedia.org/wikipedia/en/6/66/Don't_Stop_Believin'.jpg", "Don't Stop Believin'", "Journey"),
                        new MusicLibrary(5, "./resources/uptown_funk.mp3", "https://upload.wikimedia.org/wikipedia/en/a/a7/Mark_Ronson_-_Uptown_Funk_(feat._Bruno_Mars)_(Official_Single_Cover).png", "Uptown Funk", "Mark Ronson ft. Bruno Mars"),
                        new MusicLibrary(6, "./resources/satisfaction.mp3", "https://upload.wikimedia.org/wikipedia/en/7/7f/Satisfaction-us.jpg", "I Can't Get No Satisfaction", "Rolling Stones"),
                        new MusicLibrary(7, "./resources/imagine.mp3", "https://upload.wikimedia.org/wikipedia/en/6/69/ImagineCover.jpg", "Imagine", "John Lennon"),
                        new MusicLibrary(8, "./resources/respect.mp3", "https://upload.wikimedia.org/wikipedia/en/2/27/Respect_-_The_Very_Best_Of_Aretha_Franklin.jpg", "Respect", "Aretha Franklin"),
                        new MusicLibrary(9, "./resources/johnny_b_goode.mp3", "https://upload.wikimedia.org/wikipedia/en/b/b6/Chuck_berry_-_johnny_b_goode_-_record_label.jpg", "Johnny B. Goode", "Chuck Berry"),
                        new MusicLibrary(10, "./resources/hey_jude.mp3", "https://upload.wikimedia.org/wikipedia/en/d/d8/Heyjude1.png", "Hey Jude", "The Beatles"),
                        new MusicLibrary(11, "./resources/smells_like_teen_spirit.mp3", "https://upload.wikimedia.org/wikipedia/en/3/3c/Smells_Like_Teen_Spirit.jpg", "Smells Like Teen Spirit", "Nirvana"),
                        new MusicLibrary(12, "./resources/my_generation.mp3", "https://upload.wikimedia.org/wikipedia/en/0/01/My-Generation--2.jpg", "My Generation", "The Who"),
                        new MusicLibrary(13, "./resources/london_calling.mp3", "https://upload.wikimedia.org/wikipedia/en/0/00/TheClashLondonCallingalbumcover.jpg", "London Calling", "The Clash"),
                        new MusicLibrary(14, "./resources/purple_haze.mp3", "https://upload.wikimedia.org/wikipedia/en/6/64/PurpleHaze-GermanSingle.jpg", "Purple Haze", "Jimi Hendrix Experience"),
                        new MusicLibrary(15, "./resources/born_to_run.mp3", "https://upload.wikimedia.org/wikipedia/en/7/7a/Born_to_Run_(Front_Cover).jpg", "Born to Run", "Bruce Springsteen"),
                        new MusicLibrary(16, "./resources/stairway_to_heaven.mp3", "https://upload.wikimedia.org/wikipedia/commons/4/4b/Stairway_to_Heaven_by_Led_Zeppelin_US_promotional_single.png", "Stairway to Heaven", "Led Zeppelin"),
                        new MusicLibrary(17, "./resources/no_woman_no_cry.mp3", "https://upload.wikimedia.org/wikipedia/en/c/c1/NoWomanNoCry.jpg", "No Woman No Cry", "Bob Marley"),
                        new MusicLibrary(18, "./resources/heroes.mp3", "https://upload.wikimedia.org/wikipedia/en/7/7b/David_Bowie_-_Heroes.png", "Heroes", "David Bowie"),
                        new MusicLibrary(19, "./resources/hotel_california.mp3", "https://upload.wikimedia.org/wikipedia/en/4/49/Hotelcalifornia.jpg", "Hotel California", "The Eagles"),
                        new MusicLibrary(20, "./resources/when_doves_cry.mp3", "https://upload.wikimedia.org/wikipedia/en/d/d2/Prince_doves.jpg", "When Doves Cry", "Prince"),
                        new MusicLibrary(21, "./resources/anarchy_in_the_uk.mp3", "https://upload.wikimedia.org/wikipedia/en/d/dd/Liveat76club.JPG", "Anarchy in the UK", "Sex Pistols"),
                        new MusicLibrary(22, "./resources/thriller.mp3", "https://upload.wikimedia.org/wikipedia/en/5/55/Michael_Jackson_-_Thriller.png", "Thriller", "Michael Jackson"),
                        new MusicLibrary(23, "./resources/sunshine_of_your_love.mp3", "https://upload.wikimedia.org/wikipedia/en/2/2d/Sunshine_of_your_love_single.jpg", "Sunshine of your Love", "Cream"),
                        new MusicLibrary(24, "./resources/jailhouse_rock.mp3", "https://upload.wikimedia.org/wikipedia/en/6/6a/Elvis_Presley_Jailhouse_Rock_Single_Cover.jpeg", "Jailhouse Rock", "Elvis Presley"),
                        new MusicLibrary(25, "./resources/superstition.mp3", "https://upload.wikimedia.org/wikipedia/en/b/b1/Stevie_wonder-superstition_single.jpg", "Superstition", "Stevie Wonder")
                );
        
        request.setAttribute("songs", canciones);
        RequestDispatcher rd = request.getRequestDispatcher("libreria.jsp");
        rd.forward(request, response);
    }

}
