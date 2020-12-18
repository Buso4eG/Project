package zadaniye.ekzamen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class engine extends Activity implements OnClickListener {


@Override
protected void onCreate(Bundle savedInstanceState)
{

super.onCreate(savedInstanceState);
setContentView(R.layout.activity_engine);
TextView textView1 = (TextView) findViewById(R.id.tv2);
textView1.setOnClickListener(this);
}

public void onClick(View v)
{
	Bundle arguments = getIntent().getExtras();
	String l = arguments.get("yes").toString();
	Toast.makeText(engine.this, l, 
	Toast.LENGTH_LONG).show();
}
}
