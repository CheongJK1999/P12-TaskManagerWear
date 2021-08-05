package sg.edu.rp.c346.id19043996.p12_taskmanagerwear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TaskDetails extends AppCompatActivity {
    EditText etName, etDescription, etSeconds;
    Button btnAdd, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        etName = findViewById(R.id.etName);
        etDescription = findViewById(R.id.etDescription);
        etSeconds = findViewById(R.id.etSeconds);

        btnAdd = findViewById(R.id.btnAdd);
        btnCancel = findViewById(R.id.btnCancel);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                etName.setText("");
                etDescription.setText("");
                etSeconds.setText("");

                Toast.makeText(getApplicationContext(),"Clear results", Toast.LENGTH_SHORT).show();

            }
        });

    }
}