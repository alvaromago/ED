package es.studium.ejemploextraerconstante;

public class EjemploExtraerConstante
{

	private static final String ES = " es ";
	private static final String TEXTO = "El factorial de ";

	public static void main(String[] args)
	{
		int numero = 3;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero)); // Refactor --> Extract Constant
		numero = 5;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
