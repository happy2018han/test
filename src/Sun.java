
public class Sun {
		private static Sun instance;
		private int num;
		public static Sun getInstance() {
			if(instance==null) {
				instance=new Sun();
			}
			return instance;
		}
		public static void setInstance(Sun instance) {
			Sun.instance = instance;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
	
	
}
