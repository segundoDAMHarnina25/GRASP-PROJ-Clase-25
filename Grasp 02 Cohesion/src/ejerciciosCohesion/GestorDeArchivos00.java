package ejerciciosCohesion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestorDeArchivos00 {

    private String directorioBase;

    public GestorDeArchivos00(String directorioBase) {
        this.directorioBase = directorioBase;
    }

    // Método para leer un archivo
    public String leerArchivo(String nombreArchivo) throws IOException {
        Path ruta = Paths.get(directorioBase, nombreArchivo);
        return new String(Files.readAllBytes(ruta));
    }

    // Método para escribir contenido a un archivo
    public void escribirArchivo(String nombreArchivo, String contenido) throws IOException {
        Path ruta = Paths.get(directorioBase, nombreArchivo);
        Files.write(ruta, contenido.getBytes());
    }

    // Método para eliminar un archivo
    public boolean eliminarArchivo(String nombreArchivo) throws IOException {
        Path ruta = Paths.get(directorioBase, nombreArchivo);
        return Files.deleteIfExists(ruta);
    }

    // Método para listar archivos en el directorio
    public List<String> listarArchivos() throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get(directorioBase))) {
            return stream.map(Path::getFileName)
                         .map(Path::toString)
                         .collect(Collectors.toList());
        }
    }
}

