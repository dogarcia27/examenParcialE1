package examenParcialE1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CambioVocalPorNumero {

	public static void main(String[] args) {
		
		File fichero = new File ("."+ File.separator + "src" + File.separator + "examenParcialE1" + File.separator + "ficheroPrueba.txt");
		if(!fichero.exists()) {
			System.out.println("Error, el fichero indicado no existe");
		}
		FileReader fir=null;
		try {
			fir = new FileReader (fichero);
			int i;
			char caracter = 0;
			String cadena = "";
			while ((i=fir.read())!=-1) {
				//Leer el caracter y sobreescribir en mayus o minus
				caracter = (char)i;
			   	if(caracter=='a'){
			   		caracter='1';
			   	} else if(caracter=='e'){
			   		caracter='2';
			   	} else if(caracter=='i'){
			   		caracter='3';
			   	} else if(caracter=='o'){
			   		caracter='4';
			   	} else if(caracter=='u'){
			   		caracter='5';
			   	}
			   	cadena+=caracter;
			   	
			}
			System.out.println("Este es el fichero con las vocales cambiadas por numeros:");
			System.out.println(cadena);
			escribirFichero(cadena);
			fir.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void escribirFichero(String texto) {
		
		File outputFile = new File ("."+ File.separator + "src" + File.separator + "examenParcialE1" + File.separator + "ficheroSalida.txt");
		try (
				BufferedWriter bfw = new BufferedWriter(new FileWriter(outputFile));
	        ) {
			bfw.write(texto);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
