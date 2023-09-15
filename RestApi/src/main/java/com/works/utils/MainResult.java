package com.works.utils;

import com.works.entities.Note;
import com.works.restcontrollers.DataResult;

import java.util.List;

public class MainResult {
    public static void main(String[] args) {

        DataResult dataResult = new DataResult();
        List<Note> notes = dataResult.result(1000);

        long start = System.currentTimeMillis();

        notes
        .parallelStream()
        .forEach( item -> {
            try {
                Thread.sleep(15);
                System.out.println( item );
            }catch (Exception ex) {}
        });


        long end = System.currentTimeMillis();
        long betwenn = end - start;
        System.out.println("Stream : " + betwenn);
    }
}

// Stream : 17267
// ParalelStream : 2268