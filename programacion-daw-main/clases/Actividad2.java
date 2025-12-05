package clases;

import clases.src.*;




public class Actividad2 {
    public static void main(String[] args) {
        ciudad ciudadNacimiento = new ciudad(1, "Madrid", 34);
        ciudad ciudadResidencia = new ciudad(2, "Barcelona", 93);
        fecha fechaNacimiento = new fecha(15, 6, 2000);

        Persona3 individuo = new Persona3("asdfdf","Domin","Lopez",'M');
        individuo.setCiudadNacimiento(ciudadNacimiento);
        individuo.setCiudadResidencia(ciudadResidencia);
        individuo.setFechaNacimiento(fechaNacimiento);

        individuo.imprimePersona();
    }
}

