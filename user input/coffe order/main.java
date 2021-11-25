package com.mycompany.coffe_order;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends Activity { 
	int total =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}
	public void plusBtn(View view) {
		total = total + 1;
		display(total);
	} 
	public void minusBtn(View view) {
		total = total - 1;
		display(total);
	} 
	public void order(View view) {
		//display(total);
		//displayPrice(total * 5);
		String myMsg = "Total $" + total*5 + "\nThsnks";
		displayMsg(myMsg);
	}
	private void displayMsg(String abc) {
		TextView msgTextView = (TextView) findViewById(R.id.price_text_view);
		msgTextView.setText(abc);
	}
	private void display(int numbers) {
		TextView quantity = (TextView) findViewById(R.id.quantity);
		quantity.setText(" " + numbers);
	}/*
	private void displayPrice(int number) {
		TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
		priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
	}*/

}
