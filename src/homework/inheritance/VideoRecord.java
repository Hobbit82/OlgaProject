package homework.inheritance;

public class VideoRecord extends MediaRecord implements Playable {
    private String videoName;
    private String getVideoName () {
        return videoName;
    }

    @Override
    public void play() {

    }
}
