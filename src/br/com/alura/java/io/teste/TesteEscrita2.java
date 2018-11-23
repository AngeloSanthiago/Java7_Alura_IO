package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		TesteEscrita2 testeEscrita2 = new TesteEscrita2();
		//passo1
//		testeEscrita2.escreveSomenteComFileWriter();
		
		//passo2
		testeEscrita2.escreveComFileWriter();

	}

	private void escreveComFileWriter() throws IOException {
		// O FileWriter trabalha direto com caracteres
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("TEste de escrita de linha bufferedWriter(filewriter)");
		bw.newLine();
		bw.newLine();
		bw.write(System.lineSeparator());
		bw.write("Linha 2");

		bw.close();
		
	}

	private  void escreveSomenteComFileWriter() throws IOException {
		// O FileWriter trabalha direto com caracteres
		FileWriter fw = new FileWriter("lorem2.txt");
		fw.write("TEste de escrita de linha");
        //fw.write("\r\n");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("Linha 2");
		
		fw.close();
	}

}
