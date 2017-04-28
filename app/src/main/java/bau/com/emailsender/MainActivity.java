package bau.com.emailsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openMailClient (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        //address to send the message
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "marcosbau5@parkifast.com" });
        //subject
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        //mail body
        intent.putExtra(Intent.EXTRA_TEXT, "mail body");

        startActivity(Intent.createChooser(intent, ""));
    }
}
