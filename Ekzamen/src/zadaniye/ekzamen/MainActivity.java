package zadaniye.ekzamen;

import android.R.string;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity
{
TextView tv, tv1, tv2, tv3;
String M = "", E = "", K = "";

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
	}
}
@Override
public boolean onContextItemSelected(MenuItem item) {
	switch(item.getItemId())
	{
		case R.id.item1:
	M = "Model S";
	tv.setText(M+E+K);
	break;
		case R.id.item2:
	M = "Model X";
	tv.setText(M+E+K);
	break;
///////////////////////////////////
		case R.id.item3:
	E = " Turbo 2.0";
	tv.setText(M+E+K);
	break;
		case R.id.item4:
	E = " Diesel 2.0";
	tv.setText(M+E+K);
	break;
///////////////////////////////////	
		case R.id.c1:
	K = " Comfort";
	tv.setText(M+E+K);
	break;
		case R.id.c2:
	K = " Comfort+";
	tv.setText(M+E+K);
	break;
		case R.id.c3:
	K = " Premium";
	tv.setText(M+E+K);
	ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
	imageView1.setImageResource(R.drawable.image);
	break;
	}
	return true;
	}

}



