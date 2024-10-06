package notebook.service;

import lombok.AllArgsConstructor;
import notebook.model.Note;
import notebook.repository.NotebookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class NotebookRepositoryImpl  implements NoteService {

    private final NotebookRepository repository;
    @Override
    public List<Note> findAllNotes() {
        return  repository.findAll();
    }

    @Override
    public String createNote(String name, String text) {
        Note note = new Note();
        note.setName(name);
        note.setText(text);
        repository.save(note);
        return "Saved";

    }

    @Override
    public Note saveNote(Note note) {
        return repository.save(note);
    }

    @Override
    public Note findById(String id) {
        return null;
    }

    @Override
    public void deleteNote(String id) {

    }


}
