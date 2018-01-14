package com.example.shiva.billscanner.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.shiva.billscanner.login.*;


import com.example.shiva.billscanner.R;
import com.example.shiva.billscanner.login.Signin;

import static com.example.shiva.billscanner.R.id.registration;

public class MainActivity extends AppCompatActivity {


    EditText username,password;
    Button signin,signup;
    String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(EditText) findViewById(R.id.registration);
        password=(EditText) findViewById(R.id.password);
        signin=(Button)findViewById(R.id.signin);
        signup=(Button)findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getin();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getup();
            }
        });


    }

    private boolean checkuser()
    {
        if(user == null)
            return false;
        return true;
    }

    private boolean checkpasswd()
    {
        if(pass == null)
            return false;
        return true;
    }



    public void getin()
    {
        user=username.getText().toString();
        pass=password.getText().toString();

        if(checkuser())
        {
            if(checkpasswd())
            {
                Signin signin = new Signin(this);
                if(signin.login(user,pass))
                {
                    startActivity(new Intent(this,Home.class).putExtra("username",user));
                    finish();
                }
                else
                    Toast.makeText(this,"Invalid Credentials",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Password field empty",Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(this,"Username field empty",Toast.LENGTH_LONG).show();
        }
    }



    public void getup()
    {
        user=username.getText().toString();
        pass=password.getText().toString();

        if(checkuser())
        {
            if(checkpasswd())
            {
                Signup signup = new Signup(this);
                if(signup.logup(user,pass))
                {
                    Toast.makeText(this,"Sign Up Successfull",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(this,Home.class).putExtra("username",user));
                    finish();
                }
                else
                    Toast.makeText(this,"User Already Exists",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Password field empty",Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(this,"Username field empty",Toast.LENGTH_LONG).show();
        }
    }
}
