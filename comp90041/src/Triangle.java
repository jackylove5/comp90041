import java.util.Scanner;

public class Triangle {
	public int check_side_length(int side_length, int width, int height) {
		if (side_length > width) {
			System.out.println("Error! The side length is too long (Current canvas size is "+width+"*"+height+"). Please try again.");
			System.out.println("Side length:");
			Scanner scanner_1 = new Scanner(System.in);
			int new_side_length = scanner_1.nextInt();
			return check_side_length(new_side_length, width, height);
			
	}
		else {
			return side_length;
		}
	}
	StringBuilder triangle = new StringBuilder("");
	DrawingCanvas drawing_canvas = new DrawingCanvas();
	public StringBuilder printing(int side_length, String print_char, String alignment, StringBuilder canvas, int width,int height) {
		if (alignment.equals("left")) {
			int start_pos = 0;
			int end_pos = 0;
			for(int i=1;i<height+1;i++) {
				end_pos = start_pos;
				side_length -=1;
				for(int j=side_length;j>=0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i;
		}
		return canvas;
	}
		else if(alignment.equals("right")) {
			int start_pos = width - side_length;
			int end_pos = 0;
			int gap = width - side_length;
			for(int i=1;i<height+1;i++) {
				end_pos = start_pos;
				side_length -=1;
				for(int j=side_length;j>=0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i+gap;
		
		}return canvas;
		}
		else if(alignment.equals("middle")) {
			int start_pos = (width - side_length)/2;
			int end_pos = 0;
			int gap = (width - side_length)/2;
			for(int i=1;i<height+1;i++) {
				end_pos = start_pos;
				side_length -=1;
				for(int j=side_length;j>=0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i+gap;
		
		}return canvas;
		}
		else {
		return null;
	}
		
}
}
