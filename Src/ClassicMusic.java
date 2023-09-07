public class ClassicMusic extends MusicStyles{
    public ClassicMusic(String bandName, String compositionName, int yearOfComposition) {
        super(bandName, compositionName, yearOfComposition);
    }

    @Override
    public void playMusic() {
        System.out.println(this + " This composition is representative of Classic music style.");
    }
}
