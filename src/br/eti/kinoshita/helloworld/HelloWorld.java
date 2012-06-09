package br.eti.kinoshita.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorld extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Bundle hash = this.getIntent().getExtras();
        String name = (String)hash.get("name");
        ((TextView)this.findViewById(R.id.helloText)).setText(name);
    }
}