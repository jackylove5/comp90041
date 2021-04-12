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
    	Scanner scanner = new Scanner(System.in);
    	int option_1 = scanner.nextInt();
    	switch(option_1) {
    	case 1:
    		System.out.println("Side length:");
    		int side_length = scanner.nextInt();
    		Triangle tri = new Triangle();
    		int side_length_final = tri.check_side_length(side_length, Width, Height);
    		System.out.println("Printing character:");
    		String print_char = scanner.next();
    		System.out.println("Alignment (left, middle, right):");
    		String alignment = scanner.next();
    		StringBuilder triangle = tri.printing(side_length_final, print_char, alignment, can_canvas, Width, Height);
    		System.out.println(triangle);
    		
    		break;
    		
    		
    	

	}

	}
}
