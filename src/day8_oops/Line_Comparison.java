package day8_oops;

public class Line_Comparison (
               private int x1;
		private int y1;
		private int x2;
		private int y2;


                           void Line_Comparisons() {
					Scanner in = new Scanner(System.in);
					System.out.println("enter values:");
					x1 = in.nextInt();
					x2 = in.nextInt();
					y1 = in.nextInt();
					y2 = in.nextInt();
					
				}

				static void compareTo(int length1, int length2) {
					if (length1 == length2)
						System.out.println("length 1 is equal to length 2");
					else if (length1 > length2)
						System.out.println("length 1 is greater than length 2");
					else
						System.out.println("length 2 is greater than length 1");
				}

				static double calculate_length(Line_Comparison obj) {
					double length = Math.sqrt(Math.pow(obj.x2 - obj.x1, 2) + Math.pow(obj.y2 - obj.y1, 2));
					return length;
				}

				public static void main(String[] args) {
					
					System.out.println("enter values for line 1:");
				
					Line_Comparison line1 = new Line_Comparison();
					System.out.println("enter values for line 2:");
					Line_Comparison line2 = new Line_Comparison();
					line1.Line_Comparisons();
					line2.Line_Comparisons();
					int length1 = (int) calculate_length(line1);
					int length2 = (int) calculate_length(line2);
					System.out.println("length 1: " + length1);
					System.out.println("length 2: " + length2);
					compareTo(length1, length2);
	}

}
