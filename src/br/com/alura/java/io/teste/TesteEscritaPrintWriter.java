package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.print("testando o objeto PrintWriter");
		pw.println();
		pw.println("terminando o txt.");
		
		pw.close();
	}
}
