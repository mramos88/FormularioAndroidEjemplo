package ar.com.sistema.clase01;



import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class PersonaController implements View.OnClickListener {


   PersonaModel p;
   PersonaView view;

   public PersonaController(PersonaModel p){
      this.p =p;
   }
public void setView(PersonaView view){
   this.view = view;
   this.buscarDatos();

}
   private void buscarDatos() {

      this.p.setNombre("Pepito");
      this.p.setSexo("Mujer");
      this.p.setDni(231312);
      this.view.mostrarModelo();
   }

   @Override
   public void onClick(View v) {
      this.view.cargarModelo();
      if(validarDatos()) {
         Log.d("Se guardo", this.p.toString());
      }else{
         Log.d("NO se guardo", "Faltan datoS!");
      }


   }



   boolean validarDatos(){
      if (this.p.getNombre()==null || this.p.getNombre().isEmpty()){
         Log.d("Error","No completo el nombre");
         return false;
      }
      return true;


   }



}

