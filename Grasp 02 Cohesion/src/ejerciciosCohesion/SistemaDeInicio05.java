package ejerciciosCohesion;

public class SistemaDeInicio05 {

    // Método para inicializar el sistema
    public void iniciarSistema() {
    	//El orden de estas llamadas no importa
        cargarConfiguracion();  // Cargar configuraciones al inicio
        establecerConexiones(); // Establecer conexiones con bases de datos o servicios externos
        iniciarServicios();     // Iniciar servicios necesarios
        mostrarPantallaInicio(); // Mostrar la pantalla de bienvenida
    }

    // Método para cargar las configuraciones
    private void cargarConfiguracion() {
        System.out.println("Cargando configuraciones del sistema...");
    }

    // Método para establecer conexiones con recursos externos
    private void establecerConexiones() {
        System.out.println("Estableciendo conexiones con bases de datos...");
    }

    // Método para iniciar los servicios necesarios
    private void iniciarServicios() {
        System.out.println("Iniciando servicios del sistema...");
    }

    // Método para mostrar la pantalla de inicio
    private void mostrarPantallaInicio() {
        System.out.println("Mostrando pantalla de inicio...");
    }
}

