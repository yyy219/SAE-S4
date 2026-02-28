package com.openminds.app.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.openminds.app.database.entity.Session;

import java.util.List;

@Dao
public interface SessionDao {

    // US15 - Admin crée une session
    @Insert
    long insert(Session session);

    // US03 - Sessions disponibles pour une formation
    @Query("SELECT * FROM session WHERE formationId = :formationId")
    List<Session> getByFormation(int formationId);

    @Query("SELECT * FROM session WHERE id = :id")
    Session getById(int id);
}
