package com.openminds.app.database.entity;


import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "utilisateur")
public class Utilisateur {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String nom;
    public String prenom;
    public String email;
    public String motDePasse;

    public String role; //sois benevole sois admin//

    public String dateInscription;


}
