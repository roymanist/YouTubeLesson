package notebook.controller;

import lombok.AllArgsConstructor;
import notebook.model.Note;
import notebook.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@AllArgsConstructor
public class NoteController {


    private NoteService service ;
    @GetMapping
    public List<Note> findAllNotes()
    {
        //ToDo
        return service.findAllNotes();

    }
}
