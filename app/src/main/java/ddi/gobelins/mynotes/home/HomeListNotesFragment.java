package ddi.gobelins.mynotes.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ddi.gobelins.mynotes.R;
import ddi.gobelins.mynotes.datas.Note;
import ddi.gobelins.mynotes.datas.NoteManager;
import ddi.gobelins.mynotes.list.NotesAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeListNotesFragment extends Fragment {

    private RecyclerView recyclerView;
    private NotesAdapter notesAdapter;

    public HomeListNotesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initList(view);
        initNotesAdapter();

        return view;
    }

    private void initNotesAdapter() {
        List<Note> notes = NoteManager.getInstance().fetchNoteList();
        notesAdapter = new NotesAdapter(notes);

        this.recyclerView.setAdapter(notesAdapter);
    }

    private void initList(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.list_notes_recyclerview);
        //recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
    }

    public void refreshList() {
        notesAdapter.notifyDataSetChanged();
    }
}
