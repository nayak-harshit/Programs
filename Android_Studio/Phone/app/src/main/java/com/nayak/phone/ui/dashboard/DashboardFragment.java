package com.nayak.phone.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.nayak.phone.MainActivity;
import com.nayak.phone.R;
import com.nayak.phone.contacts.Contact;
import com.nayak.phone.database.DbHandler;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    Button saveContact;
    EditText name, number, email, address;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        saveContact =  root.findViewById(R.id.saveContact);
        name = root.findViewById(R.id.name);
        number = root.findViewById(R.id.number);
        email = root.findViewById(R.id.email);
        address = root.findViewById(R.id.address);


        saveContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact contact = new Contact(name.getText().toString(), number.getText().toString(),
                        email.getText().toString(), address.getText().toString());
                Log.d("contactOBJ", "Contact Object Created " + contact.toString());
               DbHandler dbHandler = new DbHandler(getContext());
             dbHandler.addContact(contact);
            }
        });




        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}