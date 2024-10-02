package notebook.service.impl;

import lombok.AllArgsConstructor;
import notebook.model.Note;
import notebook.repository.InMemoryNoteDAO;
import notebook.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryNoteServiceImpl implements NoteService {


    private final InMemoryNoteDAO repository;

    @Override
    public List<Note> findAllNotes() {

            return repository.findAllNotes();
    }

    @Override
    public Note createNote(String id, String name, String text) {
        return repository.createNote(id,name,text);
    }

    @Override
    public Note saveNote(Note note) {
        return repository.saveNote(note);
    }

    @Override
    public Note findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Note updateNote(Note note) {
        return repository.updateNote(note);
    }

    @Override
    public void deleteNote(String id) {
        repository.deleteNote(id);
    }
}
