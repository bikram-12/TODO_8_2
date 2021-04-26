package gcit.edu.todo_8p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri!=null){
            String msg = uri.toString();
            textView.setText(msg);
        }
    }
}