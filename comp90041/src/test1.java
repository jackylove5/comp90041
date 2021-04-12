
public class test1 {
	public void print(){
	System.out.println("Hello");
	
	int end_pos = 0;
	int width = 5;
	int height = 5;
	int side_length = 3;
	String print_char = "a";
	int start_pos = width - side_length;
	StringBuilder canvas = new StringBuilder("");
	for(int i=1;i<height+1;i++) {
		end_pos = start_pos;
		side_length -=1;
		for(int j=side_length;j>=0;j--) {
			canvas.replace(end_pos, end_pos+1, print_char);
			end_pos +=1;
		}
		start_pos = i*(width+1)+(width-side_length);
}
}
}