package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.txt"));
		
		bw.write("OLA MUNDO TESTE OutputStreamWriter");
		bw.newLine();
		
		bw.close();
	}
}
