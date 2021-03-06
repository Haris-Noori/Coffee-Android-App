/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package coffee.example.coffee;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

import androidx.appcompat.app.AppCompatActivity;

import coffee.example.coffee.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int quantity = 0;    //  initializing quantity variable
    public int price = 5;       // initializing price variable

    /**
     * This method is called when the increment Quantity button is clicked.
     */
    public void incQuantity(View view) {

        quantity++;
        display(quantity);
        displayPrice(quantity * price);
    }

    /**
     * This method is called when the decrement Quantity button is clicked.
     */
    public void decQuantity(View view) {

        quantity--;
        if(quantity < 0)
        {
            quantity = 0;
        }
        display(quantity);
        displayPrice(quantity * price);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        String priceMessage = "You ordered " + quantity + " coffees\n" + "Thank You!";

        display(quantity);
        displayPrice(quantity * price);
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when submit Order button is clicked
     */
    private void displayMessage(String message)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}