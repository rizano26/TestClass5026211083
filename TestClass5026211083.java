import java.util.Scanner;
public class TestClass5026211083 {
    public static void main(String[] args) {
	ComputeMethods5026211083 comp = new ComputeMethods5026211083();
		Scanner sc = new Scanner(System.in);

		System.out.println("Temperatur dalam Farenheit : ");
		double tempF = sc.nextDouble();

		System.out.print("Sisi a : ");
		int a = sc.nextInt();
		System.out.print("Sisi b : ");
		int b = sc.nextInt();

		System.out.println("Temperatur dalam Celcius adalah : "+comp.fToC(tempF));
		System.out.println("Sisi miring adalah : "+comp.hypotenuse(a,b));
		System.out.println("Jumlah mata dadu adalah : "+comp.roll());
    }
}