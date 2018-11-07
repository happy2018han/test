package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo04FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("file02.txt");
		
		//System.out.println(ch);
		//每次调用read()方法都会尝试读取下一个新的字符
		/*错误写法
		 * while(fr.read()!=-1) {
			
			System.out.println(fr.read());
		}*/
		//循环输出
		//(char)ch  将数字转换为字符
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
		fr.close();
	}

}
