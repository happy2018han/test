package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo04FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("file02.txt");
		
		//System.out.println(ch);
		//ÿ�ε���read()�������᳢�Զ�ȡ��һ���µ��ַ�
		/*����д��
		 * while(fr.read()!=-1) {
			
			System.out.println(fr.read());
		}*/
		//ѭ�����
		//(char)ch  ������ת��Ϊ�ַ�
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
		fr.close();
	}

}
