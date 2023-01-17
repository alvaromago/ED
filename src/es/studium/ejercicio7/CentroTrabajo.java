package es.studium.ejercicio7;

public class CentroTrabajo
{
	private int idCentroTrabajo;
	private String nombreCentroTrabajo;
	private String direccionCentroTrabajo;
	
	public CentroTrabajo()
	{
		idCentroTrabajo = 0;
		nombreCentroTrabajo = "";
		direccionCentroTrabajo = "";
	}

	public CentroTrabajo(String nombreCentroTrabajo, String direccionCentroTrabajo)
	{
		this.nombreCentroTrabajo = nombreCentroTrabajo;
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}

	public CentroTrabajo(int idCentroTrabajo, String nombreCentroTrabajo, String direccionCentroTrabajo)
	{
		this.idCentroTrabajo = idCentroTrabajo;
		this.nombreCentroTrabajo = nombreCentroTrabajo;
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}

	public int getIdCentroTrabajo()
	{
		return idCentroTrabajo;
	}

	public void setIdCentroTrabajo(int idCentroTrabajo)
	{
		this.idCentroTrabajo = idCentroTrabajo;
	}

	public String getNombreCentroTrabajo()
	{
		return nombreCentroTrabajo;
	}

	public void setNombreCentroTrabajo(String nombreCentroTrabajo)
	{
		this.nombreCentroTrabajo = nombreCentroTrabajo;
	}

	public String getDireccionCentroTrabajo()
	{
		return direccionCentroTrabajo;
	}

	public void setDireccionCentroTrabajo(String direccionCentroTrabajo)
	{
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}
	
}
