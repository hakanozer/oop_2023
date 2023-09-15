package com.works.restcontrollers;

import com.works.entities.Note;

import java.util.ArrayList;
import java.util.List;

public class DataResult {

    public List<Note> result( int count ) {
        List<Note> notes = new ArrayList<>();
        for (long i = 0; i < count; i++) {
            Note n = new Note();
            n.setNid(i);
            n.setTitle("Title - " + i);
            n.setDetail("Detail - "+i);
            notes.add(n);
        }
        return notes;
    }


}
