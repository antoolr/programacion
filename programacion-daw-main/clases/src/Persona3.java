package clases.src;

public class Persona3 {
    String cedula;
    String nombre;
    String apellido;
    char genero;
    

    fecha fechaNacimiento;
    ciudad ciudadNacimiento;
    ciudad ciudadResidencia;

    public Persona3() {}
  
    

    public Persona3(String cedula, String nombre, String apellido, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    //Metodos
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String nombre(){
        return this.nombre;
    }
    public void setCiudadNacimiento(ciudad ciudadNacimiento) {
    this.ciudadNacimiento = ciudadNacimiento;
}

public void setCiudadResidencia(ciudad ciudadResidencia) {
    this.ciudadResidencia = ciudadResidencia;
}

public void setFechaNacimiento(fecha fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

public void imprimePersona() {
    System.out.println("Nombre: " + nombre + " " + apellido);
    System.out.println("Ciudad de nacimiento: " + ciudadNacimiento.nombre);
    System.out.println("Ciudad de residencia: " + ciudadResidencia.nombre);
    System.out.print("Fecha de nacimiento: ");
    fechaNacimiento.mostrarFecha();
}


}
