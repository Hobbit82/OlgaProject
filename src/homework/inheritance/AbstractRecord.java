package homework.inheritance;

import java.util.Date;

public abstract class AbstractRecord {
    private String author;
    private Date date;
    private String message;
    private MessageType messageType;

    public void showContent () {
        System.out.println(this.author);
        System.out.println(this.date);
        System.out.println(this.message);
        System.out.println(this.messageType);
    }

    public abstract int getSize ();


}
