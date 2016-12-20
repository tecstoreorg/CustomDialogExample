package tec_store.org.alertdialogexample;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.tv);
        Button button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).create();
                View prompt = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_dialog,null);
                final EditText editText = (EditText) prompt.findViewById(R.id.edit_text);
                Button button1 = (Button) prompt.findViewById(R.id.btn_dialog);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text = editText.getText().toString();
                        textView.setText(text);
                        dialog.dismiss();
                    }
                });
                dialog.setView(prompt);
                dialog.show();
            }
        });
    }
}
