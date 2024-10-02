package teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class GrabarConIndice {
public static void main(String[] args) {
	// elementos del indice
			List<Integer> indice = new ArrayList<>();
			List<Long> offset = new ArrayList<>();
			List<Boolean> active = new ArrayList<>();
			// elementos del archivo de objetos
			FileOutputStream grabador;
			FileInputStream lector;
			RandomAccessFile serializadorAleatorioLector;
			ObjectInputStream serializadorLector;
			ObjectOutputStream serializadorInicialGrabador;
			MyObjectOutputStream serializadorPosteriorGrabador;
			// Grabar primer objeto
			String path = "./elementos.dat";
			File file = new File(path);
			try {
				// grabando el primer elemento
				grabador = new FileOutputStream(file);
				serializadorInicialGrabador = new ObjectOutputStream(grabador);
				// entrada del indice
				Persona persona = new Persona(1, "Manolito");
				indice.add(persona.id);
				offset.add(0l);
				active.add(true);
				// grabar
				serializadorInicialGrabador.writeObject(persona);
				serializadorInicialGrabador.close();
				grabador.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Grabar segundo objeto
			try {
				RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
				long pos = randomAccessFile.length();
				randomAccessFile.seek(pos);
				grabador = new FileOutputStream(file, true);
				//ya no debemos grabar como si fuesen secuenciales si no como
				//si fuesen muchos juntos, cada uno con su cabecera
				serializadorInicialGrabador = new ObjectOutputStream(grabador);
				// entrada del indice
				Persona persona = new Persona(2, "Pedrito");
				indice.add(persona.id);
				offset.add(pos);
				active.add(true);
				// grabar
				serializadorInicialGrabador.writeObject(persona);
				serializadorInicialGrabador.close();
				grabador.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Leer el segundo objeto
			try {
				int posicionEnIndice=2;
				RandomAccessFile randomAccessFile=new RandomAccessFile(file, "r");
				Long offsetElement = offset.get(posicionEnIndice-1);
				randomAccessFile.seek(offsetElement);
				lector = new FileInputStream(randomAccessFile.getFD());
				serializadorLector = new ObjectInputStream(lector);
				Object object = serializadorLector.readObject();
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

