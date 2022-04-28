package ar.com.sistema.clase01;

class PersonaModel {
   private String nombre;
   private String apellido;
   private Integer dni;
   private String sexo;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public Integer getDni() {
      return dni;
   }

   public void setDni(Integer dni) {
      this.dni = dni;
   }

   public String getSexo() {
      return sexo;
   }

   public void setSexo(String sexo) {
      this.sexo = sexo;
   }

   @Override
   public String toString() {
      return "Persona{" +
              "nombre='" + nombre + '\'' +
              ", apellido='" + apellido + '\'' +
              ", dni=" + dni +
              ", sexo='" + sexo + '\'' +
              '}';
   }
}
