package notebook.service.impl;

import notebook.model.Note;
import notebook.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryNoteServiceImpl implements NoteService {

    @Override
    public List<Note> findAllNotes() {

            return List.of(
                    Note.builder().id("1").name("first").text("Hello World").build(),
                    Note.builder().id("2").name("Second").text("Hello World2").build()
            );
    }
}
