package notebook.service;

import notebook.model.Note;

import java.util.List;

public interface NoteService {
     List<Note> findAllNotes();
     String createNote(String name, String text);
     Note saveNote(Note note);
     Note findById(Long id);
     void deleteNote(Long id);
     void deleteByName(String name);
}