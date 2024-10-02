package notebook.service;

import notebook.model.Note;


import java.util.List;


public interface NoteService {
     List<Note> findAllNotes() ;
     Note saveNote(Note note);
     Note findById(String id);
     Note updateNote(Note note);
     void deleteNote(String id);
    }
