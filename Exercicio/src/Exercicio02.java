import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		
		double raio1 = 2.00;
		double raio2 = 100.64;
		double raio3 = 150.00;
		double area = Math.PI * Math.pow(raio1, 2);
		double area2 = Math.PI * Math.pow(raio2, 2);
		double area3 = Math.PI * Math.pow(raio3, 2);
		

		System.out.printf("O valor do primeiro raio �: %.4f%n", area);
		System.out.printf("O valor do segundo raio �: %.4f%n", area2);
		System.out.printf("O valor do terceiro raio �: %.4f%n", area3);
	}

}
