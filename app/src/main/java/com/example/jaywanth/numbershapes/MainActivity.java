package com.example.jaywanth.numbershapes;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testNumber(View view)
    {
        EditText ed1;
        int a;

            ed1 = findViewById(R.id.ed1);
            try {
                a = Integer.parseInt(ed1.getText().toString());

                Toast.makeText(this, "Enter a number!", Toast.LENGTH_SHORT).show();
                Number ob = new Number();
                ob.n = a;
                if (ob.isSquare() && ob.isTriangular())
                    Toast.makeText(this, a + " is triangular as well as square", Toast.LENGTH_SHORT).show();
                else if (ob.isSquare())
                    Toast.makeText(this, a + " is a square", Toast.LENGTH_SHORT).show();
                else if (ob.isTriangular())
                    Toast.makeText(this, a + " is triangular", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, a + " is neither a square number nor a triangular number", Toast.LENGTH_SHORT).show();
            }
            catch(Exception e)
            {
                Toast.makeText(this, "Enter a number!", Toast.LENGTH_SHORT).show();

            }
    }
    class Number
    {
        int n;

        public boolean isSquare()
        {
            double root;
            root=Math.sqrt(n);
            if(root==Math.floor(root))
                return true;
            else
                return false;

        }
        public boolean isTriangular()
        {
            int x=1,triangular=1;

            while(triangular<n)
            {
                x++;
                triangular=triangular+x;

            }
            if(triangular==n)
                return true;
            else
                return false;
        }
    }
}
