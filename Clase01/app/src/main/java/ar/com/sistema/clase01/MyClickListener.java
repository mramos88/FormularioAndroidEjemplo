package ar.com.sistema.clase01;



import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MyClickListener  implements View.OnClickListener {
   Activity a;
   EditText edNombre;
   EditText edApellido;
   EditText edDni;
   RadioButton rbHombre;
   Persona p;

   public MyClickListener(Activity a){
      this.a =a;
      this.p =new Persona();

   }
   @Override
   public void onClick(View v) {

      if(this.edNombre==null) {
         this.edNombre = this.a.findViewById(R.id.etNombre);
         this.edApellido = this.a.findViewById(R.id.etApellido);
         this.edDni = this.a.findViewById(R.id.edDNI);
         this.rbHombre = this.a.findViewById(R.id.rbHombre);
      }
      this.p.setNombre(edNombre.getText().toString());
      this.p.setApellido(edApellido.getText().toString());

      this.p.setDni(Integer.valueOf(edDni.getText().toString()));
      if(rbHombre.isChecked()){
         this.p.setSexo("Hombre");
      }else{
         this.p.setSexo("Mujer");
      }

      Log.d("Se guardo",this.p.toString());






   }



}

