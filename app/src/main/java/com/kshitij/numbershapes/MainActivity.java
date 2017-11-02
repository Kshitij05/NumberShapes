package com.kshitij.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

               int number;

                      public boolean IsTriangular()
                      {

                          int x = 1; //counter variable
                          int triangularNumber = 1;

                            while(triangularNumber < number)
                            {
                                x++;

                                triangularNumber = triangularNumber + x; //the loop will stop executing till triangularNumber > number or triangularNumber = number (ideal case)



                            }


                          if (number == triangularNumber)
                          {

                              return true;
                          }

                          else
                          {
                              return false;
                          }




                      }

               public boolean IsSquare()
               {

                   double squareRoot = Math.sqrt(number);

                   if(squareRoot == Math.floor(squareRoot))

                   {
                       return true;
                   }

                   else
                   {
                       return false;

                   }









               }





    }

    public void testNumber(View view) { //this class will be acting as my main class (where I do main result showing stuff

        String message = "";

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        if (usersNumber.getText().toString().isEmpty())
        {

            message = "please enter a number!";

        }

        else

        {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(usersNumber.getText().toString());


            if (myNumber.IsSquare()) //will enter this if it is true
            {
                if (myNumber.IsTriangular()) {

                    message = "the number is both Triangular and Square!";

                } else  //if it is only square, not triangular
                {

                    message = "the number is Square, but not Triangular.";

                }


            } else  //if it is not square, it can be either be only Triangular, or it can be neither Triangular nor square
            {
                if (myNumber.IsTriangular()) {
                    message = "the number is Triangular, but not Square.";

                } else //neither square(tabhi is loop me aya), nor triangular (above wali condition)
                {

                    message = "the number is neither Triangular nor Square.";

                }


            }

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
