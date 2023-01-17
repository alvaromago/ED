package es.studium.ejercicio1;

public class Ejercicio1
{

	private static final double PI = 3.14;

	public static void main(String[] args)
	{
		Ejercicio1 g = new Ejercicio1();
		int radio = 13; // radio del círculo;
		g.longitudCircunferencia(radio);
		g.areaCircunferencia(radio);
	}

	public void areaCircunferencia(int radio)
	{
		double area = PI * radio * radio;
		System.out.println("La superficie del círculo es " + area);
	}

	public void longitudCircunferencia(int radio)
	{
		double longitud = 2 * PI * radio;
		System.out.println("El perímetro del círculo es " + longitud);
	}

}
