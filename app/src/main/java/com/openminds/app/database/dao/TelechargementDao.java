package com.openminds.app.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.openminds.app.database.entity.Telechargement;

import java.util.List;

@Dao
public interface TelechargementDao {
    // US05 - Enregistrer un téléchargement
    @Insert
    long insert(Telechargement t);

    // US05 - Vérifier si une formation est déjà téléchargée
    @Query("SELECT * FROM telechargement WHERE utilisateurId = :uid AND formationId = :fid LIMIT 1")
    Telechargement isDownloaded(int uid, int fid);

    // Liste des formations téléchargées par un user
    @Query("SELECT * FROM telechargement WHERE utilisateurId = :uid")
    List<Telechargement> getByUtilisateur(int uid);


}
