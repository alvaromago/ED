package es.studium.ejercicio4;

public class Principal
{

	public static void main(String[] args)
	{
		Raza raza1 = new Raza("Pastor belga");
		Raza raza2 = new Raza("Fox terrier");
		Raza raza3 = new Raza("Braco alemán");
		Raza raza4 = new Raza("Bichón maltés");
		Raza raza5 = new Raza("Dálmata");
		
		Perro perro1 = new Perro(raza1, 1.2f, 10, "marrón");
		Perro perro2 = new Perro(raza2, 0.5f, 2, "marrón");
		Perro perro3 = new Perro(raza3, 0.9f, 5, "marrón");
		Perro perro4 = new Perro(raza4, 0.5f, 3, "marrón");
		Perro perro5 = new Perro(raza5, 1.2f, 8, "marrón");
		
		System.out.println("La raza del perro es: " + perro1.getRaza().getNombreRaza() + ", su edad es: " + perro1.getEdad() + ", su tamaño es: " + perro1.getTamano() + ", su color es: " + perro1.getColor());
		System.out.println("La raza del perro es: " + perro2.getRaza().getNombreRaza() + ", su edad es: " + perro2.getEdad() + ", su tamaño es: " + perro2.getTamano() + ", su color es: " + perro2.getColor());
		System.out.println("La raza del perro es: " + perro3.getRaza().getNombreRaza() + ", su edad es: " + perro3.getEdad() + ", su tamaño es: " + perro3.getTamano() + ", su color es: " + perro3.getColor());
		System.out.println("La raza del perro es: " + perro4.getRaza().getNombreRaza() + ", su edad es: " + perro4.getEdad() + ", su tamaño es: " + perro4.getTamano() + ", su color es: " + perro4.getColor());
		System.out.println("La raza del perro es: " + perro5.getRaza().getNombreRaza() + ", su edad es: " + perro5.getEdad() + ", su tamaño es: " + perro5.getTamano() + ", su color es: " + perro5.getColor());
	}

}
