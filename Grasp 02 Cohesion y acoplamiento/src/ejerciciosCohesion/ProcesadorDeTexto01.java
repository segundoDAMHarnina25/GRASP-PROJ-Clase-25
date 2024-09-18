package ejerciciosCohesion;

public class ProcesadorDeTexto01 {

    // Método principal para procesar un texto: sigue una secuencia de operaciones
    public String procesarTexto(String texto) {
        String textoLimpio = eliminarEspacios(texto);  // Primer paso: limpiar el texto
        String textoMinusculas = convertirAMinusculas(textoLimpio);  // Segundo paso: convertir a minúsculas
        return reemplazarCaracteresEspeciales(textoMinusculas);  // Tercer paso: reemplazar caracteres especiales
    }

    // Elimina espacios en blanco al inicio y al final del texto
    private String eliminarEspacios(String texto) {
        return texto.trim();  // Retorna el texto sin espacios en los extremos
    }

    // Convierte todo el texto a minúsculas
    private String convertirAMinusculas(String texto) {
        return texto.toLowerCase();  // Retorna el texto en minúsculas
    }

    // Reemplaza caracteres especiales con un espacio
    private String reemplazarCaracteresEspeciales(String texto) {
        return texto.replaceAll("[^a-zA-Z0-9 ]", " ");  // Reemplaza cualquier carácter especial
    }
}

