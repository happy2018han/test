package test;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03FileWriter02 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("file02.txt");
		fw.write(48);
		fw.write(49);
		fw.write(50);
		fw.write("\r\n");
		fw.write(65);
		fw.write(66);
		fw.write(67);
		fw.write("\r\n");
		fw.write(97);
		fw.write(98);
		fw.write(99);
		fw.write("\r\n");
		//ѡȡ�ַ������в�������
		String str="��ǰ�αؾ�˯�������Ի᳤��";
		fw.write(str,7,6);
		fw.write("\r\n");
		//ѡȡ�ַ������в�������
		char[] array= { 'j','a','v','a','!'};
		fw.write(array);
		fw.write("\r\n");
		fw.write(array,1,3);
		
				
		
		fw.close();
	}
	
	

}
