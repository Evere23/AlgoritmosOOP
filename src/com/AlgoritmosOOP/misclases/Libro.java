package com.AlgoritmosOOP.misclases;

public class Libro 
{
	public String ISBN;
	public String titulo;
	public String autor;
	public int anio;
	public int noHojas;
	public double precio;
	public boolean isPastaDura;
	
	//metodo contructor
	
	public Libro()// si escribes valores aqui sirve para hacer un default
	{
		this.ISBN = "No ISBN";
		this.titulo = "No Name";
		this.autor = "No autor";
		this.anio = 0;
	}
	
	public Libro(String ISBN)
	{
		this.ISBN = ISBN;
	}
	public Libro(String ISBN, String titulo, String autor)
	{
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
	}
	public Libro(String ISBN, String titulo, String autor, int anio)
	{
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
	}
	
	public boolean prestarLibro()
	{
		return false;
	}
	
	
	public void agregarLibro()
	{
		
	}
	public void eliminarLibro()
	{
		
	}
	
	public int contarLibro()
	{
		return 0;
	}
	
	public double verPrecio(String ISBN)
	{
		return precio;
	}
	
	
}
