public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        // Cadena multiples líneas (text block)
        var cadenas4 = """
                Este es un texto
                multilínea
                con muchas
                lineas
                """;
        System.out.println("cadenas4 = " + cadenas4);
    }
}

/*
 * NOTAS:
 * La forma más común de declarar un string es simplemente cómo la cadena1, la sintaxis que usa cadena2 es la forma en cómo declaramos nuevos objetos (porque String también es un objeto)
 */