import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� � � �");
		int X = scan.nextInt();
		int Y = scan.nextInt();
		Random random =  (X-Y==0) ? new Random(): new Random(X+Y);
		int SUP = (int) (Math.pow(X-Y,2)/2);
		if(SUP==0)SUP=random.nextInt(X);
		int SID = random.nextInt(SUP);
		int WOW=SID>X-Y ? 1 : 0;
		switch (WOW) {
		case 1:
			System.out.println(Math.sin(X)+Math.sin(Y));
			break;
		case 0:
			System.out.println(2*Math.sin((X+Y)/2)*Math.cos((X-Y)/2));
			break;		
		}
		// TODO Auto-generated method stub

	}

}
