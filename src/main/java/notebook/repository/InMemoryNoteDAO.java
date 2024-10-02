package notebook.repository;

import notebook.model.Note;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryNoteDAO {
    private final List<Note> Notes = new ArrayList<>();


    public List<Note> findAllNotes() {

        return Notes;
    }

    public Note createNote(String id, String name, String text) {

        Note Not = new Note();
         Not.setId(id);
         Not.setName(name);
         Not.setText(text);
        Notes.add(Not);
        return Not;
    }

    public Note saveNote(Note note) {
        Notes.add(note);
        return note;
    }


    public Note findById(String id) {
        return Notes.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    public Note updateNote(Note note) {
       return null;
    }


    public void deleteNote(String id) {
        var Note = findById(id);
        if(Note != null){Notes.remove(Note);}
    }
}
