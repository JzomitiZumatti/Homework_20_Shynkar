import java.util.Arrays;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        MusicStyles theCure = new MusicStyles("The Cure", "Catch", 1987);
        MusicStyles michaelJackson = new PopMusic("Michael Jackson", "Thriller",
                1982);
        MusicStyles theRollingStones = new RockMusic("The Rolling Stones", "Paint It, Black",
                1966);
        MusicStyles ludwigVanBeethoven = new ClassicMusic("Ludwig van Beethoven",
                "Symphony No.5", 1808);

        List<MusicStyles> playList = Arrays.asList(theCure, michaelJackson, theRollingStones, ludwigVanBeethoven);
        for (MusicStyles band : playList) {
            band.playMusic();
        }
    }
}
