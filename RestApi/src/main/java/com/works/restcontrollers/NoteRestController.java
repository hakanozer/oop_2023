package com.works.restcontrollers;

import com.works.entities.Note;
import com.works.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/note")
public class NoteRestController {

    final NoteService noteService;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Note note) {
        return noteService.save(note);
    }

    @PostMapping("/saveAll")
    public ResponseEntity saveAll(@RequestBody List<Note> notes) {
        return noteService.saveAll(notes);
    }

    @GetMapping("/list")
    public ResponseEntity list()  {
        return noteService.list();
    }


}
