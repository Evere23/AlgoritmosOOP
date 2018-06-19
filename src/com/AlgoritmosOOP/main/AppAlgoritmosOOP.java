package com.AlgoritmosOOP.main;

import com.AlgoritmosOOP.misclases.Libro;
import java.util.Scanner;

public class AppAlgoritmosOOP
{

	public static void main(String[] args) 
	{
	
		Libro objLibro1;
		objLibro1 = new Libro("287484b");
		Libro objLibro2;
		objLibro2 = new Libro("8978dgg","todos para 1","el macho");
		Libro objLibro3 = new Libro();
		char cPastaDura = ' ';
		
		
		Scanner entrada  = new Scanner(System.in);
		
		
		System.out.println(objLibro1.getClass());
		
		objLibro1.ISBN = "101B";
		objLibro1.autor = "el macho";
		objLibro1.noHojas = 250;
		objLibro1.anio = 1998;
		objLibro1.titulo = "La guerra de los mundos";
		objLibro1.precio = 250;
		objLibro1.isPastaDura = true;
		String sPasta = " ";
			
		
		System.out.println("El libro " + objLibro1.titulo + " con ISBN "+objLibro1.ISBN+" con el autor "+objLibro1.autor+" con numero de hojas "+objLibro1.noHojas+" del anio "+objLibro1.anio+" con el precio "+objLibro1.precio+" tiene pasta dura?" +objLibro1.isPastaDura);
		
		
		System.out.println("introduce el nombre del titulo");
		objLibro2.titulo = entrada.nextLine();
		System.out.println("introduce el nombre del ISBN");
		objLibro2.ISBN = entrada.nextLine();
		System.out.println("introduce el nombre del autor");
		objLibro2.autor = entrada.nextLine();
		System.out.println("introduce el nombre del anio de edicion");
		objLibro2.anio = entrada.nextInt();
		System.out.println("introduce el precio");
		objLibro2.precio = entrada.nextDouble();
		System.out.println("introduce el  numero de hojas");
		objLibro2.noHojas = entrada.nextInt();
		System.out.println("el libro tiene pasta dura? s/n");
		cPastaDura = entrada.next().charAt(0);
		if (cPastaDura == 'S' || cPastaDura == 's')
			objLibro2.isPastaDura = true;
		else
			objLibro2.isPastaDura = false;
		if (objLibro2.isPastaDura == true)
			sPasta = " si tiene pasta dura";
		else
			sPasta = " no tiene pasta dura";
		
		
		System.out.println("El libro " + objLibro2.titulo + " con ISBN "+objLibro2.ISBN+", con el autor "+objLibro2.autor+", con numero de hojas "+objLibro2.noHojas+", del anio "+objLibro2.anio+", con el precio de $"+objLibro2.precio+ sPasta);
	
		
		System.out.println("El libro " + objLibro3.titulo + " con ISBN "+objLibro3.ISBN+", con el autor "+objLibro3.autor+", con numero de hojas "+objLibro3.noHojas+", del anio "+objLibro3.anio+", con el precio de $"+objLibro3.precio+ sPasta);
		
		
		System.out.println("el libro fue prestado?"+objLibro3.verPrecio("101B"));
		
		
		
	}
}
