package ejerciciot11.funciones;

public class ValidarNombre {
    char letra;

    public boolean validarNombre(String nombre){
        for (int i = 0; i < nombre.length(); i++) {
             letra = nombre.charAt(i);
            if(!((letra >= 'A' && letra <= 'Z')||(letra >= 'a'&& letra <= 'z')||letra == ' ')){
                return false;
            }
        }
        return true;
     }
}
