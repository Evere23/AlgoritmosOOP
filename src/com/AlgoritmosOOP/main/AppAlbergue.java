package com.AlgoritmosOOP.main;
import java.util.*;
import com.AlgoritmosOOP.misclases.Mscota;
public class AppAlbergue 
{

	public static void main(String[] args) 
	{
		Mscota objperro1 = new Mscota();
		Mscota objperro2 = new Mscota("2P2","Ringo","perro","disponible");
		Mscota objperro3 = new Mscota();
		Scanner entrada=new Scanner(System.in);
		
		objperro1.setId("1202");
		objperro1.setnombre("Scooby doo");
		objperro1.setespecie("Perro");
		objperro1.setestado("No disponible");
		
		System.out.println("ID : ");
		objperro3.setId(entrada.next());
		System.out.println("Nombre : ");
		objperro3.setnombre(entrada.next());
		System.out.println("estado : ");
		objperro3.setespecie(entrada.next());
		System.out.println("estado : ");
		objperro3.setestado(entrada.next());
		
		System.out.println(" El ID es "+objperro2.getId()+" El Nombre es "+objperro2.getnombre()+" La especie es "+objperro2.getespecie()+" el estado es "+objperro2.getestado());
		
		System.out.println(" El ID es "+objperro1.getId()+" El Nombre es "+objperro1.getnombre()+" La especie es "+objperro1.getespecie()+" el estado es "+objperro1.getestado());
		
		System.out.println(" El ID es "+objperro3.getId()+" El Nombre es "+objperro3.getnombre()+" La especie es "+objperro3.getespecie()+" el estado es "+objperro3.getestado());
	}

}
