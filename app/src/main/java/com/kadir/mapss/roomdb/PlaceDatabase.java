package com.kadir.mapss.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.kadir.mapss.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDatabase extends RoomDatabase{
    public abstract Placedao placedao();
}
