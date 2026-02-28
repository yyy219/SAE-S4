package com.openminds.app.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.openminds.app.database.entity.Formation;

import java.util.List;

@Dao
public interface FormationDao {
    // US15 - Admin crée une formation
    @Insert
    long insert(Formation formation);

    // US02 - Liste toutes les formations disponibles
    @Query("SELECT * FROM formation")
    List<Formation> getAll();

    // US02 - Filtrer par thématique
    @Query("SELECT * FROM formation WHERE thematique = :thematique")
    List<Formation> getByThematique(String thematique);

    // Détail d'une formation (US04)
    @Query("SELECT * FROM formation WHERE id = :id")
    Formation getById(int id);

    // US17 - Compter le nombre de formations (stats admin)
    @Query("SELECT COUNT(*) FROM formation")
    int countAll();

    @Update
    void update(Formation formation);

    @Delete
    void delete(Formation formation);
}
