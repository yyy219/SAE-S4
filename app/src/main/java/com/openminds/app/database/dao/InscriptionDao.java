package com.openminds.app.database.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.openminds.app.database.entity.Inscription;

import java.util.List;

@Dao
public interface InscriptionDao {

    // US03 - S'inscrire à une session
    @Insert
    long insert(Inscription inscription);

    // Vérifier si déjà inscrit
    @Query("SELECT * FROM inscription WHERE utilisateurId = :uid AND sessionId = :sid LIMIT 1")
    Inscription getInscription(int uid, int sid);

    // US17 - Nb d'inscrits à une session (stat admin)
    @Query("SELECT COUNT(*) FROM inscription WHERE sessionId = :sessionId")
    int countBySession(int sessionId);

    // Toutes les inscriptions d'un bénévole
    @Query("SELECT * FROM inscription WHERE utilisateurId = :uid")
    List<Inscription> getByUtilisateur(int uid);
}
