package ejerciciot11;

import ejerciciot11.facade.ClaseCadena;

public class Main {
    public static void main(String[] args) {

      String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac"); 

      System.out.println(iniciales);

      iniciales = ClaseCadena.DevuelveIniciales("Chiara Boccaletti"); 

      System.out.println(iniciales);

      iniciales = ClaseCadena.DevuelveIniciales("Andreas    Dulac"); 

      System.out.println(iniciales);

      iniciales = ClaseCadena.DevuelveIniciales("Andreas 8Dulac"); 
      
      System.out.println(iniciales);
    }
}
