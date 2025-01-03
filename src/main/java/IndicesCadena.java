public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de índices en un cadena
        var cadena1 = "Hola Mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);

        // Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9); // Recuperar el caracter 'o'
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        // Recuperar el caracter 'M'
        var personalCaracter = cadena1.charAt(5); // Recuperar el caracter 'M'
        System.out.println("personalCaracter = " + personalCaracter);
    }
}

/*
 * NOTAS:
 * Cómo String vendría a ser un objeto o clase, este tiene métodos (en este específico caso ya definidos), uno de estos es charAt(index del caracter que se obtendrá).
 * charAt() se usa para recuperar un caracter de la cadena a la que se indique
 */