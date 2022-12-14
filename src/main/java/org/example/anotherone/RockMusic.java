package org.example.anotherone;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class RockMusic implements Music{
    @Override
    public List<String> getSong(){
        List<String> rockMusicList = java.util.Arrays.asList(
                "Wind cries Marie", "Highway to hell", "JavaPain"
        );
        return rockMusicList;
    }
}
