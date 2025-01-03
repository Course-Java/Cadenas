public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        // Comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparar contenido el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}

/*
 * NOTAS:
 * Si no utilizamos la sintaxis formal de creación de objetos (usando new) entonces los objetos de las cadenas en Java se guardan en una sección de la memoria llamada "Pool de cadenas"
 * En el pool de cadenas, vamos a reutilizar objetos de tipo cadena / String. Por eso no se crea otro objeto con valor "Java", sino que (si los valores de los Strings son iguales) se reutilizarán.
 * print (imprime sin saltos de línea) y println (imprime con saltos de línea)
 * Recordemos que las comparaciones con == se hacen por referencia de memoria más no por contenido (por eso al comparar cadena1 y cadena2 da true porque referencian al mismo objeto en el pool de cadenas. Sin embargo, al comparar cadena1 y cadena3 (aunque sean el mismo contenido) da false porque los dos no referencian al mismo objeto (uno referencia a otro y el otro referencia a otro objeto que fue creado con otra sintaxis que hace que no esté dentro del Pool de cadenas cómo se haría con una sintaxis de creación de cadenas normal)), para hacer una comparación de contenido usaremos la función equals.
 */
