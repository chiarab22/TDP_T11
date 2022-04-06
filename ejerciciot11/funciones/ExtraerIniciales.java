package ejerciciot11.funciones;

public class ExtraerIniciales {
    char letra1, letra2,x;
    String iniciales;

    public String extraeIniciales(String nombre) {
        letra1 = nombre.charAt(0);
        for (int i = 0; i < nombre.length(); i++) {
            x = nombre.charAt(i);
            if(x == ' '&& nombre.charAt(i+1) >= 'A' && nombre.charAt(i+1) <= 'Z'){
                letra2 = nombre.charAt(i+1);

            }
        }

        iniciales = letra1 + "." + letra2 + ".";
         return iniciales;
    }
}
