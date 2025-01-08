public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        System.out.print("\n");
        // Ingresar datos
        var nombre = " Ubaldo Acosta Soto ";
        var empresa = " Global Mentoring ";
        var dominio = "com.mx";

        // Normalizamos nombre
        // Primero imprimimos el nombre
        System.out.println("Nombre Usuario: " + nombre);
        // Le quitamos los espacios al inicio y al final con trim(), reemplazamos el espacio por un punto y convertimos a minúsculas
        var nombreNormalizado = nombre.trim().replace(' ', '.').toLowerCase();
        // Ahora imprimimos el nombre normalizado
        System.out.println("Nombre normalizado: " + nombreNormalizado);
        System.out.print("\n");

        // Normalizamos dominio de email
        // Primero imprimimos el nombre de la empresa
        System.out.println("Nombre empresa = " + empresa);
        // Ahora imprimimos la extensión del dominio
        System.out.println("Extension del dominio = " + dominio);
        // Añadimos una arroba, quitamos los espacios al inicio y al final, quitamos los espacios, convertimos a minúsculas y concatenamos con el dominio
        var dominioNormalizado = '@' + empresa.trim().replace(" ", "").toLowerCase().concat('.' + dominio);
        // Ahora imprimimos el dominio de email normalizado
        System.out.println("Dominio de email normalizado: " + dominioNormalizado);
        System.out.print("\n");

        // Por último, para generar el email completo, concatenamos el nombre normalizado y el dominio de email normalizado
        var emailFinalGenerado = nombreNormalizado.concat(dominioNormalizado);
        // Ahora imprimimos el email generado
        System.out.println("Email final generado: " + emailFinalGenerado);
    }
}
