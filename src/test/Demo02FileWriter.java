package test;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FileWriter {

	public static void main(String[] args) throws IOException {
		/*
		 * //����д�� 
		 * FileWriter fw=new FileWriter("file.txt");
		 * 
		 * fw.write("hello");
		 * 
		 * fw.close();
		 */

		// ׷��д�� windows���з�\r\n macOs���з�\n Linux���з�\n
		FileWriter fw = new FileWriter("file.txt", true);
		fw.write("\r\n");
		fw.write("\r\n hello world!");
		fw.close();

	}

}
