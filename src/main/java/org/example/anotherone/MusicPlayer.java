package org.example.anotherone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import static org.example.anotherone.GenreOfMusic.CLASSICAL;
import static org.example.anotherone.GenreOfMusic.ROCK;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public String playMusic(GenreOfMusic a){
        if(a == ROCK){
            return "Playing: " + music1.getSong();
        }else if(a == CLASSICAL){
            return "Playing: " + music2.getSong();
        }return null;
    }
}
