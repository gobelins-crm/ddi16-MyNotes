package ddi.gobelins.mynotes.datas;

import com.orm.SugarRecord;

/**
 * Created by lbeltramo on 20/10/2016.
 */

public class Note extends SugarRecord {
    public String title;
    public String description;

    public Note() {

    }

    public Note(String description, String title) {
        this.title = title;
        this.description = description;
    }
}
