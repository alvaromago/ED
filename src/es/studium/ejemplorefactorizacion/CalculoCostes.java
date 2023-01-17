package es.studium.ejemplorefactorizacion;

public class CalculoCostes
{
	private static final double SUELDO_TRABAJADORES = 1500; // Refactor --> Extract Class
	public static void main(String[] args)
	{
		costeTrabajadores(50);
		System.out.println(costeTrabajadores(50));
	}
	public static double costeTrabajadores(int numeroTrabajadores)
	{
		return SUELDO_TRABAJADORES * numeroTrabajadores;
	}
}
