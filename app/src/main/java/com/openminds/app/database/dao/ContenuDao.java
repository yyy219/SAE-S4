package com.openminds.app.database.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.openminds.app.database.entity.Contenu;

import java.util.List;

@Dao
public interface ContenuDao {

    @Insert
    long insert(Contenu contenu);

    // US04 - Récupérer les contenus d'une formation, dans l'ordre
    @Query("SELECT * FROM contenu WHERE formationId = :formationId ORDER BY ordre ASC")
    List<Contenu> getByFormation(int formationId);
}
