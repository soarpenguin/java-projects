package soundsystem;
import org.springframework.stereotype.Component;

/**
 * Created by yfzhu on 2017/3/11.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Petter's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
