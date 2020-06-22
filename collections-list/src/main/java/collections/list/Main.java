package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Cria a lista
		List<String> listaMercado = new ArrayList<>();
		
		//Adiciona o elemento a lista
		listaMercado.add("arroz");
		listaMercado.add("feijao");
		listaMercado.add("ovos");
		listaMercado.add("camarao");
		
		//Ordena a lista
		Collections.sort(listaMercado);
		
		//Exibe a lista com os elementos acima
		System.out.println(listaMercado);
		
		//Mostra os elementos com a itera��o de um For
		for(String item : listaMercado) {
			System.out.println("Mostrar item da lista: " + item);
		}
		
		for (int i = 0; i < listaMercado.size(); i++) {
			System.out.println("Item => " + listaMercado.get(i));
		}
		
		//Remove um elemento da lista com o �ndice informado
		listaMercado.remove(0);
		System.out.println(listaMercado);
		
		//Retorna um true ou false se houver n�o item na lista 
		System.out.println(listaMercado.contains("sal"));
		System.out.println(listaMercado.contains("ovos"));

		//Posi��o do item no array(se n�o houver o elemento, retorna -1)
		int posOvo = listaMercado.indexOf("ovos");
		System.out.println("Posi��o do ovo: " + posOvo);
	}

}
