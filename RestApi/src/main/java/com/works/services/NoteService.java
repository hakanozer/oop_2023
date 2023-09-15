package com.works.services;

import com.works.entities.Note;
import com.works.repositories.NoteRepository;
import com.works.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    final NoteRepository noteRepository;

    public ResponseEntity save(Note note) {
        noteRepository.save(note);
        return Util.success(note);
    }

    public ResponseEntity saveAll(List<Note> notes) {
        noteRepository.saveAll(notes);
        return Util.success(notes);
    }

    public ResponseEntity list() {
        //List<Note> list = noteRepository.findAll();
        return Util.success( noteRepository.allNotes() );
    }

}
