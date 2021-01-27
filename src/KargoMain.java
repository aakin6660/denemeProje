import java.util.Scanner;
public class KargoMain {

	public static void main(String[] args) {
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("7 kiloluk sabun sayisini giriniz:");
		int a=girdi.nextInt();
		System.out.println("2 kiloluk sabun sayisini giriniz:");
		int b=girdi.nextInt();
		System.out.println("Hedef kargo kilogramý:");
		int c=girdi.nextInt();
		
		Korgo k1=new Korgo();
		System.out.println("->"+k1.KorgoPaketiHazirla(a, b, c));
                System.out.println("deneme");

	}

}
