package ddi.gobelins.mynotes.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ddi.gobelins.mynotes.R;
import ddi.gobelins.mynotes.datas.Note;

/**
 * Created by lbeltramo on 20/10/2016.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private final List<Note> notes;

    public NotesAdapter(List<Note> notesArg) {
        notes = notesArg;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_item_note, parent, false);
        ViewHolder holder = new ViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Note note = notes.get(position);

        String title = note.title;
        String description = note.description;

        holder.setTitle(title);
        holder.setDescription(description);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleTextView;
        private final TextView descriptionTextView;

        ViewHolder(View itemView) {
            super(itemView);

            titleTextView = (TextView) itemView.findViewById(R.id.list_item_note_title);
            descriptionTextView = (TextView) itemView.findViewById(R.id.list_item_note_description);
        }

        void setTitle(String title) {
            titleTextView.setText(title);
        }

        void setDescription(String description) {
            descriptionTextView.setText(description);
        }
    }
}
