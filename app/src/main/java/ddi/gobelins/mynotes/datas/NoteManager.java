package ddi.gobelins.mynotes.datas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lbeltramo on 20/10/2016.
 */

public class NoteManager {
    private final static NoteManager instance = new NoteManager();
    private List<Note> notes;

    private NoteManager() {

    }

    public static NoteManager getInstance() {
        return instance;
    }

    public void generateFakeData() {
        for (int i = 0; i < 10; i++) {
            addNote(new Note());
        }
    }

    public void wipe() {
        notes.clear();
    }

    public List<Note> fetchNoteList() {
        notes = new ArrayList<>();
        return notes;
    }

    public void addFakeNote() {
        addNote(new Note("Fake Description", "Fake Title"));
    }

    private void addNote(Note note) {
        notes.add(note);
    }
}
