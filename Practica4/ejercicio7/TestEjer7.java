package ejercicio7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestEjer7 {
	public static void main(Double[] args) {
		ArbolGeneral<Double> a1 = new ArbolGeneral<Double>();
		ArbolGeneral<Double> a2 = new ArbolGeneral<Double>();
		ArbolGeneral<Double> a3 = new ArbolGeneral<Double>();
		ArbolGeneral<Double> a3_1 = new ArbolGeneral<Double>();
		ArbolGeneral<Double> a3_2 = new ArbolGeneral<Double>();
		ListaGenerica<ArbolGeneral<Double>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Double>>();
		a3.agregarHijo(a3_1);
		a3.agregarHijo(a3_2);
		hijos.agregarInicio(a1); 
		hijos.agregarInicio(a2); 
		hijos.agregarInicio(a3);
		ArbolGeneral<Double>  a = new ArbolGeneral<Double>(null,hijos);
		
		RedDeAguaPotable red = new RedDeAguaPotable(a);
		System.out.println("minimo caudal: "+ red.minimoCaudal(1000));
		
		
	}

}