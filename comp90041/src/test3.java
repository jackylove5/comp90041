
public class test3 {

	public static void main(String[] args) {
		StringBuilder background_char = new StringBuilder("");
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			background_char.append("1");
		}
			background_char.append("\n");
	}
		System.out.println(background_char);
		int width = 10;
		int start_pos = 0;
		int side_length=5;
		int side_length_ =5;
		for (int i=1;i<side_length+1;i++) {
			int end_pos = start_pos;
			side_length_ -=1;
			for(int j=side_length_+1;j>0;j--) {
				background_char.replace(end_pos, end_pos+1, "A");
				end_pos += 1;
			}
			start_pos = i*(width+1) ;
			System.out.println(start_pos);
			System.out.println(i);
		}
		

		System.out.println(background_char);


		

}
}

