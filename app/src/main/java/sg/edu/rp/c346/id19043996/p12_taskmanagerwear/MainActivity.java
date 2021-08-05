package sg.edu.rp.c346.id19043996.p12_taskmanagerwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvTask;
    Button btnTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTask = findViewById(R.id.lvTask);
        btnTask = findViewById(R.id.btnTask);

        btnTask.setOnClickListener(v -> {

            Intent intent = new Intent(TaskDetails.this,
                    TaskList.class);
            startActivity(intent);
        });
    }
}