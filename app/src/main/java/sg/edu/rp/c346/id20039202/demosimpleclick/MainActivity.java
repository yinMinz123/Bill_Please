package sg.edu.rp.c346.id20039202.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tgBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tgBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etInput.getText().toString();
                if (rgGender.getCheckedRadioButtonId() == R.id.radioButtonGenderMale) {
                    userInput = " He says " + userInput;
                } else{
                    userInput = " She says " + userInput;
                }
                tvDisplay.setText(userInput);
            }
        });
        tgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tgBtn.isChecked()){      //it can be reduced to 1 line by doing etInput.setEnabled(tgBtn.isChecked());
                    etInput.setEnabled(true);
                } else{
                    etInput.setEnabled(false);
                }
            }
        });
    }
}