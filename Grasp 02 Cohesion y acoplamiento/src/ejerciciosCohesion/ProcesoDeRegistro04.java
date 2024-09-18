package ejerciciosCohesion;

public class ProcesoDeRegistro04 {

    // Método principal para llevar a cabo el proceso de registro de un usuario
    public void registrarUsuario(String nombreUsuario, String correo) {
        validarDatos(nombreUsuario, correo);  // Primero validar los datos del usuario
        guardarUsuario(nombreUsuario, correo);  // Luego guardar al usuario en la base de datos
        enviarEmailConfirmacion(correo);  // Finalmente enviar un correo de confirmación
    }

    // Método para validar los datos del usuario
    private void validarDatos(String nombreUsuario, String correo) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario es inválido");
        }
        if (!correo.contains("@")) {
            throw new IllegalArgumentException("El correo electrónico es inválido");
        }
        System.out.println("Datos validados correctamente");
    }

    // Método para guardar los datos del usuario en la base de datos
    private void guardarUsuario(String nombreUsuario, String correo) {
        // Lógica para guardar en la base de datos (simulada)
        System.out.println("Usuario " + nombreUsuario + " guardado en la base de datos");
    }

    // Método para enviar un correo de confirmación al usuario
    private void enviarEmailConfirmacion(String correo) {
        // Lógica para enviar un email (simulada)
        System.out.println("Correo de confirmación enviado a " + correo);
    }
}
