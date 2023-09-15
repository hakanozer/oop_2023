package com.works.repositories;

import com.works.entities.Note;
import com.works.projections.INoteCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query(value = "select NID, DETAIL, TITLE, CID, NAME from PUBLIC.NOTE\n" +
            "inner join PUBLIC.NOTE_CATEGORIES NC on NOTE.NID = NC.NOTE_NID\n" +
            "inner join PUBLIC.CATEGORY C on C.CID = NC.CATEGORIES_CID", nativeQuery = true)
    List<INoteCat> allNotes();

}