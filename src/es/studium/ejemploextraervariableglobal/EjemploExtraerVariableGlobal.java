package es.studium.ejemploextraervariableglobal;

public class EjemploExtraerVariableGlobal
{

	private static int numero; // Variable ahora disponible en toda la clase no solo en el método main como si estaba antes de extraerlo a variable local (Refactor --> Convert Local Variable to Field)

	public static void main(String[] args)
	{
		EjemploExtraerVariableGlobal refactor = new EjemploExtraerVariableGlobal(); // Ejemplo de refactorización
		numero = 3;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
	}

	public double calcularFactorial(double n) // No es public static double si no public double. Necesario para refactorizar
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
