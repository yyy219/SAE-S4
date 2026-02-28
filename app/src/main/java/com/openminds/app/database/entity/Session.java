package com.openminds.app.database.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "session",
        foreignKeys = @ForeignKey(
                entity = Formation.class,       // la table parente
                parentColumns = "id",           // sa clé primaire
                childColumns = "formationId",   // la colonne ici qui pointe vers elle
                onDelete = ForeignKey.CASCADE   // si la formation est supprimée, ses sessions aussi
        )
)
public class Session {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int formationId;  // lien vers Formation

    // "presentielle" ou "en_ligne"
    public String type;

    public String dateDebut;
    public String dateFin;
    public String lieu;
    public String lienOnline;
    public int placesMax;
}
