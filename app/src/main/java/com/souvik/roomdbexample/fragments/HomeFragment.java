package com.souvik.roomdbexample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.souvik.roomdbexample.MainActivity;
import com.souvik.roomdbexample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button BnAddUser, BnReadUser, BnDeleteUser, BnUpdateUser;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        BnAddUser = view.findViewById(R.id.bn_add_user);
        BnAddUser.setOnClickListener(this);

        BnReadUser = view.findViewById(R.id.bn_view_users);
        BnReadUser.setOnClickListener(this);

        BnDeleteUser = view.findViewById(R.id.bn_delete_user);
        BnDeleteUser.setOnClickListener(this);

        BnUpdateUser = view.findViewById(R.id.bn_update_user);
        BnUpdateUser.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bn_add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.bn_view_users:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.bn_delete_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteFragment()).addToBackStack(null).commit();
                break;

            case R.id.bn_update_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateFragment()).addToBackStack(null).commit();
                break;
        }

    }
}
