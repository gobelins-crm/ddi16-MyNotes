package ddi.gobelins.mynotes.details;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ddi.gobelins.mynotes.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EditNoteDetailsFragment extends Fragment {


    public EditNoteDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_note_details, container, false);
    }
}
