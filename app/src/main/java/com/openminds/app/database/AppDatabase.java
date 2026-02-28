package com.openminds.app.database;

import android.content.Context;
import androidx.room.*;
import com.openminds.app.database.dao.*;
import com.openminds.app.database.entity.*;

// Liste toutes tes tables ici
@Database(
        entities = {
                Utilisateur.class,
                Formation.class,
                Session.class,
                Inscription.class,
                Contenu.class,
                Telechargement.class
        },
        version = 1  // si on modife base de donnes incrementer la version
)
public abstract class AppDatabase extends RoomDatabase {

    // Une instance unique pour toute l'app (pattern Singleton)
    private static AppDatabase instance;

    // Déclare tous tes DAOs ici
    public abstract UtilisateurDao utilisateurDao();
    public abstract FormationDao formationDao();
    public abstract SessionDao sessionDao();
    public abstract InscriptionDao inscriptionDao();
    public abstract ContenuDao contenuDao();
    public abstract TelechargementDao telechargementDao();

    // Méthode pour obtenir la base (on l'appelle depuis partout dans l'app)
    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "openminds.db"  // nom du fichier sur le téléphone
            ).build();
        }
        return instance;
    }
}