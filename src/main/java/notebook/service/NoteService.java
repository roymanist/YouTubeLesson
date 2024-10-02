package notebook.service;

import notebook.model.Note;


import java.util.List;


public interface NoteService {
     List<Note> findAllNotes() ;
     Note createNote(String id, String name, String text);
     Note saveNote(Note note);
     Note findById(String id);
     Note updateNote(Note note);
     void deleteNote(String id);
    }
