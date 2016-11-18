package cx.ath.tucker.apilevel16project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bbutton_web_view = (Button) findViewById(R.id.button_web_view);
        bbutton_web_view.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("cx.ath.tucker.apilevel16project.WebViewActivity"));

            }
        });




    }
}

