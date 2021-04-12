
public class test3 {

	public static void main(String[] args) {
		StringBuilder background_char = new StringBuilder("");
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			background_char.append("1");
		}
			background_char.append("\n");
	}
		
		
		int end_pos = 0;
		int height = 10;
		int width = 10;
		int side_length = 5;
		int start_pos = (width - side_length)/2;
		int gap = (width - side_length)/2;
		String print_char = "a";
		for(int i=1;i<height+1;i++) {
			end_pos = start_pos;
			side_length -=1;
			for(int j=side_length;j>=0;j--) {
				background_char.replace(end_pos, end_pos+1, print_char);
				end_pos +=1;
			}
			start_pos = i*(width+1)+gap;
			System.out.println(start_pos);

	}System.out.println(background_char);
	}
}

