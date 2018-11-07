package test;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FileWriter {

	public static void main(String[] args) throws IOException {
		/*
		 * //¸²¸ÇÐ´Èë 
		 * FileWriter fw=new FileWriter("file.txt");
		 * 
		 * fw.write("hello");
		 * 
		 * fw.close();
		 */

		// ×·¼ÓÐ´Èë windows»»ÐÐ·û\r\n macOs»»ÐÐ·û\n Linux»»ÐÐ·û\n
		FileWriter fw = new FileWriter("file.txt", true);
		fw.write("\r\n");
		fw.write("\r\n hello world!");
		fw.close();

	}

}
