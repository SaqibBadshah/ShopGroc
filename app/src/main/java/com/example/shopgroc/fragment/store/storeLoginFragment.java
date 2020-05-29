package com.example.shopgroc.fragment.store;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.shopgroc.R;
import com.google.android.material.textfield.TextInputEditText;


/**
 * @author Abdul Rehman
 */
public class storeLoginFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "StoreLoginFragment";

    TextInputEditText textViewStoreEmail,textViewStorePassword;
    Button buttonStoreLogin;
    NavController navigationController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_store_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        InIt(view);
    }

    private void InIt(View view) {
        buttonStoreLogin = view.findViewById(R.id.buttonStoreLogin);
        textViewStoreEmail = view.findViewById(R.id.textViewStoreEmail);
        textViewStorePassword = view.findViewById(R.id.textViewStorePassword);
        navigationController = Navigation.findNavController(view);
        buttonStoreLogin.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        navigationController.navigate(R.id.action_storeLoginFragment_to_StoreHomeScreenNavigation);
    }
}
