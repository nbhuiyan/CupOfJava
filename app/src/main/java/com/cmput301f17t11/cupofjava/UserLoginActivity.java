package com.cmput301f17t11.cupofjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Activity handles required username and optional password entry.
 * User can register if they have not done so yet.
 */
public class UserLoginActivity extends Activity {

    private EditText username_editText;
    private EditText password_editText;
    private Button signIn;

    /**
     * Launches the screen to enter username and optional password.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username_editText = (EditText) findViewById(R.id.username);
        password_editText = (EditText) findViewById(R.id.password);

        signIn = (Button) findViewById(R.id.username_sign_in_button);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserLoginActivity.this, MainActivity.class);
            }
        });
    }

    /**
     * Stores username.
     */
    public void addUsername(){
        String username = username_editText.getText().toString();

        /**
         * Handler if no username is entered.
         */
        if (username.isEmpty()) {
            username_editText.setError("Enter username!");
            return;
        }
    }

    /**
     * Stores password if entered
     * Optional for user.
     */
    public void addPassword(){
        String password = password_editText.getText().toString();
    }
}
