package com.android.omdbtest.db;

import com.android.omdbtest.model.ShowSearchDetails;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ShowSearchDetails.class}, version = 1, exportSchema = false)
public abstract class BookMarkDatabase extends RoomDatabase
{
    public abstract BookmarkDao getDao();
}
