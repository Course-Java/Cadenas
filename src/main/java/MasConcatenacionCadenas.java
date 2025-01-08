public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
        // constructorCadenas.append(cadena1);
        // constructorCadenas.append(" ");
        // constructorCadenas.append(cadena2);
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        // join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado join = " + resultado);
    }
}

/*
 * NOTAS:
 * La primera forma es la más común de concatenar cadenas
 * La segunda forma usamos la función concat cada vez que vayamos a unir las cadenas
 * La tercera forma usamos StringBuilder inicializándolo cómo vacío donde luego con la función append le iremos agregando nuevas cadenas de esta forma haciendo la concatenación. Finalmente convertimos el contenido del StringBuilder a una cadena de tipo String
 * Con StringBuilder podemos trabajar con los Strings de manera mutable.
 * La cuarta forma usamos StringBuffer, es similar a StringBuilder, solo que este se recomienda cuando se existe la presencia de varios hilos o procesos.
 * La quinta forma es usando el metodo join, donde incluiremos el delimitador y las cadenas que vayamos agregando. (Claramente cada vez que se agregue una cadena, se agrega el delimitador automáticamente (también podemos usar comas o cualquier caracter cómo delimitador))
 */