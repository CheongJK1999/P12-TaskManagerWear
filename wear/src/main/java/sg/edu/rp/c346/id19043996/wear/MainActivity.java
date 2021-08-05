package sg.edu.rp.c346.id19043996.wear;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import sg.edu.rp.c346.id19043996.wear.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}