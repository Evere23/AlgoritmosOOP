package com.AlgoritmosOOP.main;

import com.AlgoritmosOOP.misclases.*;

public class AppHerenciaMascotas 
{

	public static void main(String[] args) 
	{
		Mscota objMscota1=new Mscota();
		
		GatoSalvaje objgato1=new GatoSalvaje();
		GatoDomestico objgato2=new GatoDomestico();
		GatoDomestico objgato3=new GatoDomestico();
		GatoDomestico objgato4=new GatoDomestico();
		
		objgato1.setnombre("Gato Tom");
		objgato2.setnombre("Gato Silvestre");
		objgato3.setnombre("Gato Felix");
		objgato4.setnombre("Gato Pelusa");
		
		System.out.println("El gato 1 se llama: "+objgato1.getnombre());
		System.out.println("El gato 2 se llama: "+objgato2.getnombre());
		System.out.println("El gato 3 se llama: "+objgato3.getnombre());
		System.out.println("El gato 4 se llama: "+objgato4.getnombre());
	}

}
