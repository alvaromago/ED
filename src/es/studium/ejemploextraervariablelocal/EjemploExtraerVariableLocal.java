package es.studium.ejemploextraervariablelocal;

public class EjemploExtraerVariableLocal
{	
	public static void main(String[] args)
	{
		int numero = 3;
		String mensaje = "El factorial de "; // Refactor --> Extract Local Variable
		String es = " es ";
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
		numero = 5;
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
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
