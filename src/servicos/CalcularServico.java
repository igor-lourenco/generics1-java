package servicos;

import java.util.List;

public class CalcularServico {
	
	//esse metodo vai trabalhar com qualquer tipo T, desde que o T seja qualquer subtipo  de Comparable T
	public static <T extends Comparable <? super T>> T max(List<T> lista) {
		if(lista.isEmpty()) 
			throw new IllegalStateException("Lista nao pode estar vazia");
		T max = lista.get(0);
			for(T item : lista) {
				//compara se a variavel "item" é maior que a variável "max"
				if(item.compareTo(max) > 0)
					//atauliza a variavel "max" se o "item" for maior
					max = item;
			}
			return max;
		}
	}


