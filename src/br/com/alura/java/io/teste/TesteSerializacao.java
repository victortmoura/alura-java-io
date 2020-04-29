package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String nome = "Victor Moura";
		
//		1. Serializacao da String nome
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
//		2. Desserializacao da String nome
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeDesserializado =  (String) ois.readObject();
		System.out.println(nomeDesserializado);
	}
}
