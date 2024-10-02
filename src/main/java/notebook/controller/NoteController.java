package notebook.controller;

import lombok.AllArgsConstructor;
import notebook.model.Note;
import notebook.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@AllArgsConstructor
public class NoteController {


    private NoteService service ;
    @GetMapping
    public List<Note> findAllNotes()
    {

        return service.findAllNotes();

    }

    @PostMapping("SaveNote")
    public Note saveNote(@RequestBody Note note)
    {
        return service.saveNote(note);
    }

    @GetMapping("CreateNote")
    public Note createNote(@RequestParam String id,@RequestParam String name,@RequestParam String text)
    {
        return service.createNote(id,name,text);
    }


    @GetMapping("/find/{id}")
    public Note findById(@PathVariable String id)
    {
        return service.findById(id);
    }

    @GetMapping("delete")
    public void DeleteNote(@RequestParam String id)
    {
         service.deleteNote(id);
    }

}
