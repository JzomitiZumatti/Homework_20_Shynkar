public class RockMusic extends MusicStyles{
    public RockMusic(String bandName, String compositionName, int yearOfComposition) {
        super(bandName, compositionName, yearOfComposition);
    }

    @Override
    public void playMusic() {
        System.out.println(this + " This composition is representative of Rock music style.");
    }
}
