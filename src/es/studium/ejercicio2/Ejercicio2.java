package es.studium.ejercicio2;

import java.util.Scanner;

public class Ejercicio2
{

	private static String preguntaNombre = "¿Cómo te llamas?";
	private static String preguntaEdad = "¿Cuántos años tienes?";
	private static String preguntaCurso = "¿En qué curso estás?";

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre = preguntaNombreUsuario(teclado);
		String edad = preguntaEdadUsuario(teclado);
		String curso = preguntaCursoUsuario(teclado);
		mensaje(nombre, edad, curso);
		teclado.close();
	}

	public static String preguntaCursoUsuario(Scanner teclado)
	{
		System.out.println(preguntaCurso);
		String curso = teclado.nextLine();
		return curso;
	}

	public static String preguntaEdadUsuario(Scanner teclado)
	{
		System.out.println(preguntaEdad);
		String edad = teclado.nextLine();
		return edad;
	}

	public static String preguntaNombreUsuario(Scanner teclado)
	{
		System.out.println(preguntaNombre);
		String nombre = teclado.nextLine();
		return nombre;
	}
	
	public static void mensaje(String nombre, String edad, String curso)
	{
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
