package com.nayak.phone.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.nayak.phone.contacts.Contact;

public class DbHandler extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "contacts.db";
    public static final String TABLE_NAME = "contacts_table";
    // Keys
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PHONE ="phone_number";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_ADDRESS = "address";


    public DbHandler( Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME
                + " TEXT, " + KEY_PHONE + " TEXT," +KEY_EMAIL +" TEXT,"+ KEY_ADDRESS+" TEXT" + ")";
        System.out.println(create);
        db.execSQL(create);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addContact(Contact contact){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(KEY_NAME, contact.getName());
        cv.put(KEY_PHONE, contact.getPhoneNumber());
        cv.put(KEY_EMAIL, contact.getEmail());
        cv.put(KEY_ADDRESS, contact.getAddress());

        db.insert(DB_NAME, null, cv);
        Log.d("contactOBJ", "addContact to database ");
        db.close();
    }


}
