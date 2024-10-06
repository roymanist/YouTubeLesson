package notebook.service;

import lombok.AllArgsConstructor;
import notebook.model.Note;
import notebook.repository.NotebookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NotebookRepository repository;

    @Override
    public List<Note> findAllNotes() {
        return repository.findAll();
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
    public Note findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteNote(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByName(String name) {
        repository.deleteByName(name);
    }
}