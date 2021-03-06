import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		boolean terminate = false;
		ArrayList<Integer> z = new ArrayList<Integer>();
		
		while(!terminate){
			int x = in.nextInt();
			switch(x){
				case -1: {
					terminate = true;
					break;
				}
				case 1: {
					int y = in.nextInt();
					z.add(y);
					System.out.println(z);
					System.out.println("If you wish to stop enter -1, otherwise continue");
					break;
				}
				case 2: {
					int y = in.nextInt();
					while(z.contains(y)){
						z.remove(z.indexOf(y));
					}
					System.out.println(z);
					System.out.println("If you wish to stop enter -1, otherwise continue");
					break;
				}
				case 3: {
					System.out.println(z.size());
					System.out.println("If you wish to stop enter -1, otherwise continue");
					break;
				}
			}
		}
		in.close();
	}
	
}
