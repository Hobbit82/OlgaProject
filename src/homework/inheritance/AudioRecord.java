package homework.inheritance;

public class AudioRecord extends MediaRecord implements Playable {
    private String trackName;
    private String getTrackName (){
        return trackName;
    }

    @Override
    public void play() {

    }
}
