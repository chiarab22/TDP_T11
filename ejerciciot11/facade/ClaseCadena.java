package ejerciciot11.facade;

import ejerciciot11.funciones.ExtraerIniciales;
import ejerciciot11.funciones.ValidarNombre;

public class ClaseCadena {

    private static String aux;

    public static String DevuelveIniciales(String nombre) {
       ValidarNombre validar = new ValidarNombre();
       ExtraerIniciales extraer = new ExtraerIniciales();

       if (validar.validarNombre(nombre)) {
            aux = extraer.extraeIniciales(nombre);
           
       }
       return aux;
    }
}