package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.StandardSocketOptions;

public class Demo1102BufferFileReader {
	public static void main(String[] args) throws IOException {

		
		FileReader fr = new FileReader("file02.txt");
		
		char[] ch=new char[3];
		int len=fr.read(ch);
		String str=new String(ch);
		System.out.println(str);
		
		
		ch=new char[3];
		len=fr.read(ch);
		str=new String(ch);
		System.out.println(str);
		
		ch=new char[3];
		len=fr.read(ch);
		str=new String(ch);
		System.out.println(str);
		
		
		
		
		fr.close();
	}
}
