package ddi.gobelins.mynotes.datas;

/**
 * Created by lbeltramo on 20/10/2016.
 */

public class Note {
    public String title;
    public String description;

    public Note() {

    }

    public Note(String description, String title) {
        this.title = title;
        this.description = description;
    }
}
