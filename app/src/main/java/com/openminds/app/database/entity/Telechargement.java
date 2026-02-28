package com.openminds.app.database.entity;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "telechargement",
        foreignKeys = {
                @ForeignKey(entity = Utilisateur.class,
                        parentColumns = "id",
                        childColumns = "utilisateurId",
                        onDelete = ForeignKey.CASCADE),
                @ForeignKey(entity = Formation.class,
                        parentColumns = "id",
                        childColumns = "formationId",
                        onDelete = ForeignKey.CASCADE)
        }
)
public class Telechargement {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int utilisateurId;
    public int formationId;
    public String dateTelecharge;
}
