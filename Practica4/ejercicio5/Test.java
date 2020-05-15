package ejercicio5;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Test {
	public static void main(String[] args) {
		ArbolGeneral<AreaEmpresa> a = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('A',4));
		ArbolGeneral<AreaEmpresa> b = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('B',7));
		ArbolGeneral<AreaEmpresa> c = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('C',5));
		ListaGenerica<ArbolGeneral<AreaEmpresa>> nietrosJ = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		nietrosJ.agregarFinal(a);
		nietrosJ.agregarFinal(b);
		nietrosJ.agregarFinal(c);
		ArbolGeneral<AreaEmpresa>  j =  new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('J',13), nietrosJ);
		ArbolGeneral<AreaEmpresa> d = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('D',6));
		ArbolGeneral<AreaEmpresa> e = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('E',10));
		ArbolGeneral<AreaEmpresa> f = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('F',18));
		ListaGenerica<ArbolGeneral<AreaEmpresa>> nietrosK = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		nietrosK.agregarFinal(d);
		nietrosK.agregarFinal(e);
		nietrosK.agregarFinal(f);
		ArbolGeneral<AreaEmpresa>  k =  new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('K',25), nietrosK);
		ArbolGeneral<AreaEmpresa> g = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('G',6));
		ArbolGeneral<AreaEmpresa> h = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('H',10));
		ArbolGeneral<AreaEmpresa> i = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('I',18));
		ListaGenerica<ArbolGeneral<AreaEmpresa>> nietrosL = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		nietrosL.agregarFinal(g);
		nietrosL.agregarFinal(h);
		nietrosL.agregarFinal(i);
		ArbolGeneral<AreaEmpresa> l=  new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('L',10), nietrosL);
		ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		hijos.agregarFinal(j);
		hijos.agregarFinal(k);
		hijos.agregarFinal(l);
		ArbolGeneral<AreaEmpresa> arbol =  new ArbolGeneral<AreaEmpresa>(new AreaEmpresa('M',20), hijos);
		
		System.out.print(arbol.preOrden().toString());	
	}
	
	

}
