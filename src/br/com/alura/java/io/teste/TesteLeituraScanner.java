package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));	
		
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
//			Primeira forma para iterar os elementos dentro do
//			scanner:
			
			while(linhaScanner.hasNext()) {
				StringBuilder sb = new StringBuilder();
				sb.append(linhaScanner.next());

				if(linhaScanner.hasNext()) {
					sb.append(", ");
				}
				
				System.out.print(sb);
			}
			System.out.println();
			System.out.println();
// 			Segunda forma de separar os valores do arquivo csv
//			utilizando o metodo do objeto String = split():
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			linhaScanner.close();
		}

		scanner.close();
	}
}
