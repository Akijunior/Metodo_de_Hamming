package Inverter_Lista;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Imprimir_Invertido {
	
	public void imprimeInvertido(Collection<? extends Object> colecao) {
		  imprimeInvertido(colecao.iterator());
		}
		 
	private void imprimeInvertido(Iterator<? extends Object> iterator) {
	  if (iterator.hasNext()) {
	    Object object = iterator.next();
	    imprimeInvertido(iterator);
	    System.out.println(object);
	  }
	}
	
	private void retornaPosicaoDaListaQueVoceQuer(List list) {
		
		ListIterator it = list.listIterator(list.size());
		while(it.hasPrevious()) {
		Object obj = it.previous();
		}
	}
	
}
