package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		   // trata bytes. Foca nos bits e bytes
		InputStream fis = new FileInputStream("lorem.txt");
		   // trata arrays de Chars. Foca nos caracteres
		Reader isr = new InputStreamReader(fis);
		   // trata strings/linha
		
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();

	}

}
