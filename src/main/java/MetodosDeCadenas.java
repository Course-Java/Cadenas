public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodo de cadenas
        var cadena1 = "Hola Mundo";

        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevacadena = cadena1.replace('o', 'a');
        System.out.println("nuevacadena = " + nuevacadena);

        // Convertir a mayúsculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a minúsculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        // Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}

/*
 * NOTAS:
 * Recordemos que los strings con INMUTABLES, por lo tanto, con el metodo replace no reemplazamos el valor de cadena1, si no creamos un nuevo objeto con los caracteres modificados (referenciando ahora cadena1 a este nuevo valor)
 * Con el metodo trim() eliminamos los espacios al inicio y al final (" xd   ", ahora con trim(): "xd")
 */