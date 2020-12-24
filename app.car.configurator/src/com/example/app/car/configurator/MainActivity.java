package com.example.app.car.configurator;

import android.R.string;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends FragmentActivity
{
TextView tv, tv1, tv2, tv3, tv4, text;
String Model = "", Engine = "", K = "", Price;
Button btn1;
int p=0, p1=0, p2= 0, p3= 0;
ImageView image1;
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
tv = (TextView) findViewById(R.id.tv);
tv1 = (TextView) findViewById(R.id.tv1);
tv1.setOnCreateContextMenuListener(this);
tv2 = (TextView) findViewById(R.id.tv2);
tv2.setOnCreateContextMenuListener(this);
tv3 = (TextView) findViewById(R.id.tv3);
tv3.setOnCreateContextMenuListener(this);
tv4 = (TextView) findViewById(R.id.tv4);
tv4.setOnCreateContextMenuListener(this);
text = (TextView) findViewById(R.id.text);
btn1 = (Button) findViewById(R.id.btn1);

btn1.setOnClickListener(new OnClickListener()
{
@Override
public void onClick(View v)
{
Price = String.format("%d", p);
p = p1+p2+p3;
text.setText("¬арт≥сть: " +Price +"$");
}
});
}
@Override
public void onCreateContextMenu(ContextMenu menu, View v,
		ContextMenuInfo menuInfo) {
	
	switch(v.getId())
	{
	case R.id.tv1:
	getMenuInflater().inflate(R.menu.context1, menu);
	break;
	case R.id.tv2:
	getMenuInflater().inflate(R.menu.context2, menu);
	break;
	case R.id.tv3:
	getMenuInflater().inflate(R.menu.context3, menu);
	break;
	case R.id.tv4:
	getMenuInflater().inflate(R.menu.context4, menu);
	break;
	}
}
@Override
public boolean onContextItemSelected(MenuItem item) {
	switch(item.getItemId())
	{
		case R.id.item1:
	Model = "Model S,";
	tv.setText(Model+Engine+K);
	p1 = 8000;
	break;
		case R.id.item2:
	Model = "Model X,";
	tv.setText(Model+Engine+K);
	p1 = 10000;
	break;
///////////////////////////////////
		case R.id.item3:
	Engine = " Turbo 2.0,";
	tv.setText(Model+Engine+K);
	p2 = 0;
	break;
		case R.id.item4:
	Engine = " Diesel 2.0,";
	tv.setText(Model+Engine+K);
	p2 = 1000;
	break;
///////////////////////////////////	
		case R.id.c1:
	K = " Comfort";
	tv.setText(Model+Engine+K);
	p3 = 0;
	break;
		case R.id.c2:
	K = " Comfort+";
	tv.setText(Model+Engine+K);
	p3 = 1000;
	break;
		case R.id.c3:
	K = " Premium";
	tv.setText(Model+Engine+K);
	p3 = 2000;
	break;
//////////////////////////////////
		case R.id.white:
	image1 = (ImageView) findViewById(R.id.image1);
	image1.setImageResource(R.drawable.image);
	break;
		case R.id.black:
	image1 = (ImageView) findViewById(R.id.image1);
	image1.setImageResource(R.drawable.black);
	break;
		case R.id.blue:
	image1 = (ImageView) findViewById(R.id.image1);
	image1.setImageResource(R.drawable.blue);
	break;
	}
	return true;
	}
}



