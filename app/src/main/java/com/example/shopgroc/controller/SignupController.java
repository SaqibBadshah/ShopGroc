package com.example.shopgroc.controller;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.shopgroc.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignupController {

    private final static String TAG="SignupController";
    private static SignupController signupController = null;
    private FirebaseAuth mAuth=FirebaseAuth.getInstance();

    private SignupController(){}

    public static SignupController getInstance(){
        if(signupController == null)signupController = new SignupController();
        return signupController;

    }

    public void signupUser(final Activity activity, final User user, String password){


        mAuth.createUserWithEmailAndPassword(user.getEmail(),password)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success");
                    FirebaseUser fbUser = mAuth.getCurrentUser();
                    if (fbUser!=null){
                        createUser(activity,user);
                    }
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.getException());
                    Toast.makeText(activity, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void createUser(Activity activity, User user){
        UserController.getInstance().createUser(activity, user, new UserController.UserCallbackListener() {
            @Override
            public void onSuccess(boolean isSuccess, User user) {

            }

            @Override
            public void onFailure(boolean isFailure, Exception e) {

            }
        });
    }

    public set

    public interface SignupCallbackListener{
        void onSuccess(boolean isSuccess,User user);
        void onFailure(boolean isFailure,Exception e);
    }

}