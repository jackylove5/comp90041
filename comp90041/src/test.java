
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
		int side_length =4;
		int z=0;
		int j = 0;
		for(int i=1;i<height+1;i++) {
			z=j;
			side_length -= 1;
			for(int g=side_length;g>=0;g--) {
			
			background_char.replace(z, z+1, "A");
			z+=1;
			System.out.println(z);
		}j=i*width+i;

		
		
}System.out.println(background_char);
}
}