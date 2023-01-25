package area;
import java.util. Scanner; 
public class cuerpoprincipal {
static Scanner entrada;
public static void main(String[] args) {
	entrada= new Scanner (System.in);
	rectangulo p= new rectangulo();
	int opc, opc2;
	System.out.println("Ingrese una opcion:\n 1.- rectangulo \n 2.- circulo\n 3.-salida");
	opc = entrada.nextInt();
	switch(opc) {
	case 1:
		System.out.println("Ingrese una opcion:\n 1.-Area\n 2.- perimetro \n 3.- diagonal");
		opc2 = entrada.nextInt();
		switch(opc2) {
		
		case 1: 
			p.datos();
			p.areadelrectangulo();
			break;

		case 2:
			p.datos();
			p.perimetrodelrectangulo();
			break;
			
		case 3:
			p.datos();
			p.diagonaldelrectangulo();
			break;
		 } break;
	case 2:
		System.out.println("Ingrese una opcion:\n 1.- area \n 2.- perimetro");
		opc2 = entrada.nextInt();
		switch(opc2) {
		case 1:
			p.datos2();
			p.circunferenciadelcirculo();
				break;
			case 2:
					p.datos2();
					p.areaciadelcirculo();
				break;
			
		
		}
		break;
	
	
	
	
		
	case 3:
		System.exit(0);
		default:
			System.out.println("Opcion Incorrecta");
	break;
	}
		
}}