package com.mycompany.coffe_order;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends Activity { 
	int quantity =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}
	public void plusBtn(View view) {
		quantity = quantity + 1;
		displayQuantity(quantity);
	} 
	public void minusBtn(View view) {
		quantity = quantity - 1;
		displayQuantity(quantity);
	}
	public void orderBtn(View view) {
		displayPrice(quantity*5);
		
	}
	private void displayPrice(int numbers) {
		TextView priceView = (TextView) findViewById(R.id.price_text_view);
		priceView.setText(" " + numbers);
	}
	private void displayQuantity(int numbers) {
		TextView quantity = (TextView) findViewById(R.id.quantity_text_view);
		quantity.setText(" " + numbers);
	}
	
}
