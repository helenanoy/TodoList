package com.example.user.mytodo.db;


import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME ="com.example.user.mytodo.db";
    public static final int DB_VERSION = 2;
    public static final String TABLE = "tasks";

    public class Columns {
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}