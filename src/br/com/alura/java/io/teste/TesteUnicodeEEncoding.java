package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "^";
		
//		Returns the character (Unicode code point) at the specified index
		System.out.println("Unicode: " + s.codePointAt(0));
		
//		Returns the default charset of this JVM. 
		Charset charset = Charset.defaultCharset();
		System.out.println("Encoding: " + charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);

		bytes = s.getBytes(StandardCharsets.UTF_16);
		System.out.print(bytes.length + ", " + StandardCharsets.UTF_16.displayName() + ", ");
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
	}
	
}
