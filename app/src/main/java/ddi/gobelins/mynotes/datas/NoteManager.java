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
        Note.deleteAll(Note.class);
    }

    public List<Note> fetchNoteList() {
        notes = Note.listAll(Note.class);
        return notes;
    }

    public void addFakeNote() {
        addNote(new Note("Fake Description", "Fake Title"));
    }

    private void addNote(Note note) {
        notes.add(note);
        note.save();
    }
}
