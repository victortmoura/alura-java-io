package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
//		Padrao DECORATOR: Quando um objeto serve como parâmetro para 
//		outro objeto e esse objeto é usado como parâmetro para outro
//		objeto e assim sucessivamente.
		
//		STREAM: input stream of bytes
//		READER: reading character streams
		
		// Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}
