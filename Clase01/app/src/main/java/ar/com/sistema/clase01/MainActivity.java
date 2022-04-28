package ar.com.sistema.clase01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("stirng",getString(R.string.add_name));

        String s = getString(R.string.add_name);

        PersonaModel modelo =new PersonaModel();
        PersonaController controller = new PersonaController(modelo);
        PersonaView view = new PersonaView(modelo,this,controller);
        controller.setView(view);

   }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","Estoy en el onStart");


    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","Estoy en el onResume");

    }
}