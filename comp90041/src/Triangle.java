import java.util.Scanner;

public class Triangle {
	InnerScanner scanner = new InnerScanner();
	public int check_side_length(int side_length, int width, int height) {
		if (side_length > width ||side_length >height) {
			System.out.println("Error! The side length is too long (Current canvas size is "+width+"*"+height+"). Please try again.");
			System.out.println("Side length:");
			InnerScanner scanner = new InnerScanner();
			int new_side_length = scanner.scanner_int();
			return check_side_length(new_side_length, width, height);
			
	}
		else {
			return side_length;
		}
	}

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
	
	public StringBuilder rot_right(StringBuilder canvas, String print_char, int side_length, int width, String background_char) {
		int start_pos = width+1;
		int side_length_=0;
		int end_pos;
		for (int i=0;i<side_length-1;i++) {
			end_pos = start_pos;
			side_length_ += 1;
			for(int j=0;j<side_length_;j++) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos+width+1;
		}
		int start_pos_ = 0;
		int end_pos_;
		int side_length_1 = side_length;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 -= 1;
			for(int j=side_length_1+1;j>0;j--) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ = i*(width+1)+i;
		}

		return canvas;
	}
	
	public StringBuilder rot_left(StringBuilder canvas, String print_char, int side_length, int width, String background_char) {
		int start_pos = width+1;
		int side_length_=0;
		int end_pos;
		for (int i=0;i<side_length-1;i++) {
			end_pos = start_pos;
			side_length_ += 1;
			for(int j=0;j<side_length_;j++) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos+width+1;
		}
		int start_pos_ = 0;
		int end_pos_;
		int side_length_1 = side_length;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 -= 1;
			for(int j=side_length_1+1;j>0;j--) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ = i*(width+1)+i;
		}

		return canvas;
	}
	
	public StringBuilder rot_down(StringBuilder canvas, String print_char, int side_length, int width, String background_char) {
		int start_pos = 0;
		int side_length_=side_length;
		int end_pos;
		for (int i=0;i<side_length-1;i++) {
			end_pos = start_pos;
			side_length_ -= 1;
			for(int j=0;j<side_length_;j++) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos+width+1;
		}
		int start_pos_ = 0;
		int end_pos_;
		int side_length_1 = side_length;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 -= 1;
			for(int j=side_length_1+1;j>0;j--) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ = i*(width+1)+i;
		}

		return canvas;
	}
	
	public StringBuilder rotation(StringBuilder canvas, String alignment, String print_char, int side_length, int width, int height, String background_char, int count) {
		System.out.println("Type R/L to rotate clockwise/anti-clockwise. Use other keys to continue.");
		String rotation_com = scanner.scanner_string();
		if(rotation_com.equals("R")) {
			count += 1;
			Triangle tri = new Triangle();
			canvas=tri.rot_right(canvas, print_char, side_length, width, background_char);
			System.out.println(canvas);
			return rotation(canvas, alignment, print_char, side_length, width, height, background_char, count);
		}
		else {
			return canvas;
		}
		
	}
}
