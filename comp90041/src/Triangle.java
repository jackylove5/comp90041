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
	public StringBuilder printing(String print_char, String alignment, StringBuilder canvas) {
		if (alignment == "left") {
			for(i=0)
			canvas.replace(0, 0, alignment)
		}return triangle;
	}
}