package es.studium.ejercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal
{

	public static void main(String[] args)
	{
		Director director1 = new Director("Pablo", LocalDate.of(1949, 5, 23), "Español");
		Director director2 = new Director("Pedro", LocalDate.of(1973, 8, 2), "Español");
		Director director3 = new Director("Lucas", LocalDate.of(1963, 4, 21), "Español");
		Director director4 = new Director("Mario", LocalDate.of(2001, 3, 14), "Español");
		Director director5 = new Director("Yesito", LocalDate.of(1352, 4, 13), "Americano");
		
		DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Pelicula pelicula1 = new Pelicula("Avatar 1", 2010, 1.3f, director1);
		Pelicula pelicula2 = new Pelicula("Avatar 2", 2022, 3.1f, director2);
		Pelicula pelicula3 = new Pelicula("Avatar 3", 2024, 6.1f, director3);
		Pelicula pelicula4 = new Pelicula("Avatar 4", 2026, 4.2f, director4);
		Pelicula pelicula5 = new Pelicula("Avatar 5", 2028, 7.3f, director5);
		
		System.out.println("La película de título: " + pelicula1.getTitulo() + " fue dirigida por " + pelicula1.getDirector().getNombre() 
				+ " de nacionalidad " + pelicula1.getDirector().getNacionalidad() + " y de fecha de nacimiento " + formatoEuropeo.format(LocalDate.of(1949, 5, 23)) 
				+ ". La fecha y duración de la película es: " + pelicula1.getAnio() + " y " + pelicula1.getDuracion() + " minutos.");
	}

}
