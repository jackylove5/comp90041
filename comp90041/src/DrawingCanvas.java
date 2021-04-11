public class DrawingCanvas {
	
	StringBuilder background_char = new StringBuilder("");
	
	public StringBuilder canvas(int width,int height,char background){
		for(int i=0; i< width; i++) {
			for(int j=0; j<height; j++) {
				background_char.append(background);
			}
			background_char.append("\n");
		}
		return background_char;
	}

}
