package com.openminds.app.database.entity;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "inscription",
        foreignKeys = {
                @ForeignKey(entity = Utilisateur.class,
                        parentColumns = "id",
                        childColumns = "utilisateurId",
                        onDelete = ForeignKey.CASCADE),
                @ForeignKey(entity = Session.class,
                        parentColumns = "id",
                        childColumns = "sessionId",
                        onDelete = ForeignKey.CASCADE)
        },indices = {@Index(value = {"utilisateurId", "sessionId"}, unique = true)}
)

public class Inscription {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int utilisateurId;
    public int sessionId;
    public String dateInscription;

    // "inscrit", "present", "absent"
    public String statut;
}
