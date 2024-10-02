package teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GrabarSinIndice {
	public static void main(String[] args) {
		FileWriter grabadorTexto;
		//elementos del archivo de objetos
		FileOutputStream grabador = null;
		FileInputStream lector;
		ObjectInputStream serializadorLector;
		ObjectOutputStream serializadorInicialGrabador;
		MyObjectOutputStream serializadorPosteriorGrabador;
		String path="./elementos.dat";
		File file=new File(path);
		try {
			//grabando el primer elemento
			grabador=new FileOutputStream(file);
			serializadorInicialGrabador=new ObjectOutputStream(grabador);
			Persona persona = new Persona(1, "Manolito");
			serializadorInicialGrabador.writeObject(persona);
			serializadorInicialGrabador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			grabador.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Grabar segundo objeto
		try {
			grabador=new FileOutputStream(file,true);
			serializadorPosteriorGrabador=new MyObjectOutputStream(grabador);
			Persona personita = new Persona(2, "Pedrito");
			serializadorPosteriorGrabador.writeObject(personita);
			serializadorPosteriorGrabador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			grabador.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Leer el segundo objeto
		try {
			lector=new FileInputStream(file);
			serializadorLector=new ObjectInputStream(lector);
			Object object = serializadorLector.readObject();
			object = serializadorLector.readObject();
			serializadorLector.close();
			System.out.println(object.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("ya esta");
	}
}
