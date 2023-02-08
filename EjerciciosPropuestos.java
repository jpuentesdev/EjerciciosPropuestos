package ejerciciosTema0;
import java.util.Random;

public class EjerciciosPropuestos {
	
	public static void ejercicio8() {
		Random random = new Random();

        char r = (char) ('a' + random.nextInt(26));
        System.out.println("Caracter generado aleatoriamente: " + r);
        if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
        	System.out.println("Es una vocal");
        }else {
        	System.out.println("Es una consonante");
        }
	}
	public static void main(String[] args) {
		
		ejercicio8();
	}
}

