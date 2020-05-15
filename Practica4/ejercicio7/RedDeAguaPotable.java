package ejercicio7;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable {
	private ArbolGeneral<Double> arbolRed;

	public RedDeAguaPotable (ArbolGeneral<Double> arbol){
		super();
		arbolRed = arbol;
	}
	public double minimoCaudal(double valorCaudal) {
		if(arbolRed.esHoja()) {
			return valorCaudal;
		}
		else {
			ListaGenerica<ArbolGeneral<Double>> lHijos = arbolRed.getHijos();
			double minimo = valorCaudal;
			double calculado = 0;
			lHijos.comenzar();
			while(!lHijos.fin()) {
				ArbolGeneral<Double> hijo = lHijos.proximo();
				RedDeAguaPotable subRed = new RedDeAguaPotable(hijo);
				calculado = subRed.minimoCaudal(valorCaudal/lHijos.tamanio());
				if(calculado < minimo) {
					minimo = calculado;
				}
			}
			return minimo; 
		}
	}
}
