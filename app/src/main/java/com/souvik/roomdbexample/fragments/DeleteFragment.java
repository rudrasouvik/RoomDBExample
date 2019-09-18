package com.souvik.roomdbexample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.souvik.roomdbexample.MainActivity;
import com.souvik.roomdbexample.R;
import com.souvik.roomdbexample.User;

/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteFragment extends Fragment {

    private EditText editText;
    private Button deletebtn;

    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete, container, false);
        editText = view.findViewById(R.id.txt_user_id);
        deletebtn = view.findViewById(R.id.deletebtn);

        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(editText.getText().toString());
                User user = new User();
                user.setId(id);

                MainActivity.myAppDatabase.myDao().deleteUser(user);
                editText.setText("");
            }
        });

        return view;
    }

}
