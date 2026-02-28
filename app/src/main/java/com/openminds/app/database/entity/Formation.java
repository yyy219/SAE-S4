package com.openminds.app.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "formation")

public class Formation {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String titre;
    public String description;

    // ex: "environnement", "inclusion", "égalité"
    public String thematique;

    public int dureeMinutes;
    public String dateCreation;
}
