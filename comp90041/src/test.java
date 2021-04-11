
public class test {

	public static void main(String[] args) {
		/**test1 te = new test1();
		te.print();**/
		StringBuilder background_char = new StringBuilder("");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
			background_char.append("1");
		}
			background_char.append("\n");

	}
		int width = 5;
		int height =5;
		int j = -1;
		for(int i=0;i<height;i++) {
			j=i*width+1;
			background_char.replace(j, j+1, "A");
		}

		
		System.out.println(background_char);
}
}
