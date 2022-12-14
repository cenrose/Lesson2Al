package org.example.anotherone;

import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class ClassicalMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> classicalMusicList = java.util.Arrays.asList(
                "Bohemian Rhapsody", "Experience", "HappyJava"
        );
        return classicalMusicList;
    }
}
