package sg.edu.rp.c346.id20039202.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    EditText etInput;
    TextView tvDisplay2;
    EditText etInput2;
    ToggleButton tgBtn;
    ToggleButton tgBtn2;
    TextView tvDisplay3;
    EditText etInput3;
    RadioGroup rgPayment;
    RadioGroup rgPayment2;
    Button btnDisplay;
    Button btnDisplay2;
    TextView tvDisplay4;
    TextView tvDisplay5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay2 = findViewById(R.id.textViewDisplay2);
        etInput2 = findViewById(R.id.editTextInput2);
        tgBtn = findViewById(R.id.toggleButtonSvs);
        tgBtn = findViewById(R.id.toggleButtonGst);
        tvDisplay3 = findViewById(R.id.textViewDisplay3);
        etInput3 = findViewById(R.id.editTextInput3);
        rgPayment = findViewById(R.id.RadioGroupPayment);
        rgPayment2 = findViewById(R.id.RadioGroupPayment);
        btnDisplay = findViewById(R.id.buttonSplit);
        btnDisplay2 = findViewById(R.id.buttonReset);
        tvDisplay4 = findViewById(R.id.textViewDisplay4);
        tvDisplay5 = findViewById(R.id.textViewDisplay5);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etInput.getText().toString();
            }

            }
        } {



    }
}