package notebook.controller;

import jakarta.transaction.Transactional;
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
    public String createNote(@RequestParam String name,@RequestParam String text)
    {
        return service.createNote(name,text);
    }

    @GetMapping("DeleteByName")
    @Transactional
    public void deleteByName(@RequestParam String name)
    {
         service.deleteByName(name);

    }


    @GetMapping("/find/{id}")
    public Note findById(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @GetMapping("delete")
    public void DeleteNote(@RequestParam Long id)
    {
         service.deleteNote(id);
    }

}
