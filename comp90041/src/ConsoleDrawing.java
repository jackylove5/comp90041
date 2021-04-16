import java.util.Scanner;
public class ConsoleDrawing {

	public static void main(String[] args) {
    	int Width = Integer.parseInt(args[0]);
    	int Height = Integer.parseInt(args[1]);
    	char back_char = args[2].charAt(0);
    	/** print command lines**/
    	System.out.println("----WELCOME TO MY CONSOLE DRAWING APP----");
    	System.out.println("Current drawing canvas settings:");
    	System.out.println("- Width: " + Width);
    	System.out.println("- Height: " + Height);
    	System.out.println("- Background character: " + back_char);    	
    	System.out.println();
    	System.out.println("Please select an option. Type 4 to exit.");
    	System.out.println("1. Draw triangles");
    	System.out.println("2. Draw squares");
    	System.out.println("3. Update drawing canvas settings");
    	System.out.println("4. Exit");
    	
    	CanvasData canvasdata = new CanvasData(Width,Height,back_char);
    	DrawingCanvas can = new DrawingCanvas();
    	StringBuilder can_canvas = can.canvas(Width, Height, back_char);
    	
    	/**Create a scanner**/
    	//Scanner scanner = new Scanner(System.in);
    	InnerScanner scanner_ = new InnerScanner();
    	int option_1 = scanner_.scanner_int();
    	switch(option_1) {
    	case 1:
    		System.out.println("Side length:");
    		int side_length = scanner_.scanner_int();
    		Triangle tri = new Triangle();
    		int side_length_final = tri.check_side_length(side_length, Width, Height);
    		System.out.println("Printing character:");
    		String print_char = scanner_.scanner_string();
    		System.out.println("Alignment (left, middle, right):");
    		String alignment = scanner_.scanner_string();
    		StringBuilder triangle = tri.printing(side_length_final, print_char, alignment, can_canvas, Width, Height);
    		System.out.println(triangle);
    		String back_char_ = back_char +"";
    		tri.rotation(triangle, alignment, print_char, side_length_final, Width, Height, back_char_, 0);
    		
    		break;
    	case 2:
    		System.out.println("Side length");
    		int side_length_square = scanner_.scanner_int();
    		Square squ = new Square();
    		int side_length_squ_final = squ.check_side_length(side_length_square, Width, Height);
    		System.out.println("Printing character:");
    		String print_char_squ = scanner_.scanner_string();
    		System.out.println("Alignment (left, middle, right):");
    		String alignment_squ = scanner_.scanner_string();
    		StringBuilder square = squ.printing(side_length_squ_final, print_char_squ, alignment_squ, can_canvas, Width, Height);
    		System.out.println(square);
    		String back_char_1 = back_char +"";
    		StringBuilder square_1 = squ.zoom(square, alignment_squ, print_char_squ, side_length_squ_final, Width, Height, back_char_1);

}
}
}