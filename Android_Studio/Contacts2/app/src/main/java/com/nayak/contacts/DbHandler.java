package com.nayak.contacts;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DbHandler extends SQLiteOpenHelper {

    public static final String CONTACT_TABLE = "CONTACT_TABLE";
    public static final String COLUMN_NAME = "NAME";
    public static final String COLUMN_NUMBER = "NUMBER";
    public static final String COLUMN_ID = "ID";

    public DbHandler(@Nullable Context context) {
        super(context, "contact.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + CONTACT_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT, " + COLUMN_NUMBER + " INT)";
        db.execSQL(createTable);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(Contacts contacts){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_NAME, contacts.getName());
        cv.put(COLUMN_NUMBER, contacts.getContactNumber());

        long insert = db.insert(CONTACT_TABLE, null, cv);
        if (insert == -1) {
            return false;
        }else return true;
    }

    public List<Contacts> getContacts(){
        List<Contacts> returnList = new ArrayList<>();
        String queryString = "SELECT * FROM "+ CONTACT_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()){
            do {

                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                int number = cursor.getInt(2);

                Contacts contacts = new Contacts(id, name,number);
                returnList.add(contacts);

            }while (cursor.moveToNext());

        }else{
            cursor.close();
            db.close();
            return returnList;
        }


        return returnList;


    }



}
