package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker obj = new Speaker(90);
        obj.volumeUp();
        obj.showVolume();

        obj.volumeUp();
        obj.showVolume();

        obj.volumeUp();
        obj.showVolume();
    }
}
