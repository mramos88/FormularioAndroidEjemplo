package ar.com.sistema.clase01;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

class PersonaView {
   PersonaModel personaModel;
   Activity a;
   EditText edNombre;
   EditText edApellido;
   EditText edDni;
   RadioButton rbHombre;
   Button btn;

   public PersonaView(PersonaModel personaModel,Activity a,PersonaController controller){
      this.personaModel=personaModel;
      this.a=a;
      if(this.edNombre==null) {
         this.edNombre = this.a.findViewById(R.id.etNombre);
         this.edApellido = this.a.findViewById(R.id.etApellido);
         this.edDni = this.a.findViewById(R.id.edDNI);
         this.btn = this.a.findViewById(R.id.btnGuardar);
         this.rbHombre = this.a.findViewById(R.id.rbHombre);
         btn.setOnClickListener(controller);
      }
   }


   public void cargarModelo(){
      this.personaModel.setNombre(edNombre.getText().toString());
      this.personaModel.setApellido(edApellido.getText().toString());

      this.personaModel.setDni(Integer.valueOf(edDni.getText().toString()));
      if(rbHombre.isChecked()){
         this.personaModel.setSexo("Hombre");
      }else{
         this.personaModel.setSexo("Mujer");
      }

   }
   public void mostrarModelo(){
      edApellido.setText(this.personaModel.getApellido());
      edNombre.setText(this.personaModel.getNombre());
      edDni.setText(this.personaModel.getDni().toString());
      if("Hombre".equals(this.personaModel.getSexo())){
         rbHombre.setChecked(true);
      }else{
         rbHombre.setChecked(false);
      }
   }
}
