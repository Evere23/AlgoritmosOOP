package com.AlgoritmosOOP.misclases;

import java.util.*;

public class Mscota
{
	private String id;
	private String nombre;
	private String especie;
	private Date fechaingreso;
	private Date fechasalida;
	private String estado;
	
	public Mscota()
	{
		
	}
	
	public Mscota(String id,String nombre,String especie,String estado)
	{
		
	}
	
	//getters
	public String getId()
	{
		return id;
	}
	public String getnombre()
	{
		return nombre;
	}
	public String getespecie()
	{
		return especie;
	}
	public Date getfechaingreso()
	{
		return fechaingreso;
	}
	public Date getfechasalida()
	{
		return fechasalida;
	}
	public String getestado()
	{
		return estado;
	}
	
	//setters
	public void setId(String id)
	{
		this.id = id;
	}
	public void setnombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setespecie(String especie)
	{
		this.especie = especie;
	}
	public void setfechaingreso(Date fechaingreso)
	{
		this.fechaingreso = fechaingreso;
	}
	public void setfechasalida(Date fechasalida)
	{
		this.fechasalida = fechasalida;
	}
	public void setestado(String estado)
	{
		this.estado = estado;
	}
	
	
}
