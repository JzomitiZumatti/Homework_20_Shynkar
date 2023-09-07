public class MusicStyles {
    private final String bandName;

    private final String compositionName;
    private final int yearOfComposition;

    public MusicStyles(String bandName, String compositionName, int yearOfComposition) {
        this.bandName = bandName;
        this.compositionName = compositionName;
        this.yearOfComposition = yearOfComposition;
    }

    public void playMusic() {
        System.out.println(this + " This composition is representative of mixed music styles.");
    }

    @Override
    public String toString() {
        return "Now " + bandName + " is playing with the song " + compositionName + ", " +
                "which was released in " + yearOfComposition + ".";
    }
}
