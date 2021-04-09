
public class ConsoleDrawing {

	public static void main(String[] args) {
    	int Width = Integer.parseInt(args[0]);
    	int Height = Integer.parseInt(args[1]);
    	char back_char = args[2].charAt(0);
    	
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
    	
    	DrawingCanvas can = new DrawingCanvas();
    	can.pring();

	}

}
