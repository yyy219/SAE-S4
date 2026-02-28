package com.openminds.app.database.dao;


import androidx.room.*;
import com.openminds.app.database.entity.Utilisateur;

@Dao
public interface UtilisateurDao {

    // US01 - Créer un compte
    @Insert
    long insert(Utilisateur utilisateur);

    // Connexion - retrouver un user par email + mdp
    @Query("SELECT * FROM utilisateur WHERE email = :email AND motDePasse = :mdp LIMIT 1")
    Utilisateur login(String email, String mdp);

    // Récupérer un user par son ID
    @Query("SELECT * FROM utilisateur WHERE id = :id")
    Utilisateur getById(int id);
}
