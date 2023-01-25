package area;
import java.util. Scanner;

public class rectangulo {
Scanner in = new Scanner(System.in);
	int a,b,r,p,ra, cir,ar,diago;
	
	public void perimetrodelrectangulo() {
		p=(2*a)+(2*b);
		System.out.println("El perimetro del rectangulo es: " + p);
	}
		
public void areadelrectangulo() {
	r=a*b;
	System.out.println("El area del rectangulo es: " + r);
	}
public void circunferenciadelcirculo() {
	cir=(2*ra)*3;
	System.out.println("La circunferencia del circulo es: " + cir);
	}
public void areaciadelcirculo() {
	ar=3*(ra*ra);
	System.out.println("El area del circulo es: " + ar);
}
public void diagonaldelrectangulo() {
	diago=((a*a)+(b*b));
	double diag = Math.sqrt(diago);
	System.out.println("La diagonal del circulo " + diag);
}
public void datos() {
	System.out.println("Ingresa Altura");
	a=in.nextInt();
	System.out.println("Ingresa Base");
	b=in.nextInt();
}
public void datos2() {
	System.out.println("Ingresa el radio del circulo");
	ra=in.nextInt();
	
}
}
