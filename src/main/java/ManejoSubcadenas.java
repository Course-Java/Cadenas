public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        // Subcadena "Mundo"
        // var subcadena2 = cadena1.substring(5);
        var subcadena2 = cadena1.substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}

/*
 * NOTAS:
 * Una subcadena es una parte extraída de una cadena original (desde un index inicial a un index final (los dos dados cómo parámetros))
 * El caracter señalado por el último index en la cadena, no se proporciona en la subcadena.
 */