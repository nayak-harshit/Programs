package com.nayak.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button addContacts, view;
    EditText name, number;
    ListView listView;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addContacts = findViewById(R.id.add_contact);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        listView = findViewById(R.id.listView);
        view = findViewById(R.id.view);
        DbHandler handler = new DbHandler(MainActivity.this);
        List<Contacts> everyone =  handler.getContacts();

        adapter = new ArrayAdapter<Contacts>(MainActivity.this, android.R.layout.simple_list_item_1, everyone);
        listView.setAdapter(adapter);


        addContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contacts contacts;
                try {
                    contacts = new Contacts(-1, name.getText().toString(), Integer.parseInt(number.getText().toString()));
//                    Toast.makeText(MainActivity.this, contacts.toString(), Toast.LENGTH_SHORT).show();
                } catch (Exception e){
                    System.out.println(e);
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    contacts = new Contacts(-1,"error", 0);

                }
                DbHandler handler = new DbHandler(MainActivity.this);
                boolean sucess = handler.addOne(contacts);
//                    Toast.makeText(MainActivity.this, "sucess = " + sucess, Toast.LENGTH_SHORT).show();


            }
        });


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHandler handler = new DbHandler(MainActivity.this);
                List<Contacts> everyone =  handler.getContacts();

               adapter = new ArrayAdapter<Contacts>(MainActivity.this, android.R.layout.simple_list_item_1, everyone);
                listView.setAdapter(adapter);



//                Toast.makeText(MainActivity.this, everyone.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}