package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
//		Padrao DECORATOR: Quando um objeto serve como parâmetro para 
//		outro objeto e esse objeto é usado como parâmetro para outro
//		objeto e assim sucessivamente.
		
//		STREAM: input stream of bytes
//		READER: reading character streams
		
		// Fluxo de Saída de Arquivo
		OutputStream fos = new FileOutputStream("teste.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("OLA MUNDO TESTE OutputStreamWriter");
		bw.newLine();
		bw.newLine();
		bw.write("ehuehueehuehueehe");
		
		bw.close();
	}
}
