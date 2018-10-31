package test;

public class Demo01Split {

	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
		String[] array1 = str1.split(",");
		System.out.println("数组长度：" + array1.length);
		for (String string : array1) {
			System.out.println(string);
		}
	}

}
