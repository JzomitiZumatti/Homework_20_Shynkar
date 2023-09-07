public class PopMusic extends MusicStyles{
    public PopMusic(String bandName, String compositionName, int yearOfComposition) {
        super(bandName, compositionName, yearOfComposition);
    }

    @Override
    public void playMusic() {
        System.out.println(this + " This composition is representative of Pop music style.");
    }
}
