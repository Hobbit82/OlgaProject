package homework.inheritance;

public class ImageRecord extends MediaRecord implements Printable {
    private String imageName;
    private String getImageName () {
        return imageName;
    }

    @Override
    public void print() {

    }
}
