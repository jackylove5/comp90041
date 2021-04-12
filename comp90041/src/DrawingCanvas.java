public class DrawingCanvas {
	
	StringBuilder background_char = new StringBuilder("");
	

	public StringBuilder canvas(int width,int height,char background){
		for(int i=0; i< height; i++) {
			for(int j=0; j<width; j++) {
				background_char.append(background);
			}
			background_char.append("\n");
		}
		return background_char;
	}

}

