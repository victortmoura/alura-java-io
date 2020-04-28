package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("lorem.txt");
		
		ps.print("testando o objeto PrintStream");
		ps.println();
		ps.println("terminando o txt.");
		
		ps.close();
	}
}
