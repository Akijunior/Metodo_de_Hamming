package Atribuicao_de_bits_a_bits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Inicializar_bits_de_paridade {
	
	
	public Map<Integer, TreeSet<Integer>> Inicializar_Relacao_de_Bits_de_Paridade(int tamanho_da_sequencia){
		
		int cont = 1;
		int tamanho_adaptado = tamanho_da_sequencia + 1;
		ArrayList<Integer> paridades = new ArrayList<Integer>();
		int valor;
		
		while (Math.pow(2, cont) <= tamanho_da_sequencia){
			cont ++;
		}
		tamanho_adaptado += cont;
		cont = 0;
		
		while (Math.pow(2, cont) <= tamanho_adaptado){
			valor = (int) Math.pow(2, cont);
			paridades.add(valor);		
			cont ++;
		}
		
		ArrayList<Integer> reverso = new ArrayList<Integer>();
		reverso.addAll(paridades);
		
		Collections.reverse(reverso);
		Map<Integer, TreeSet<Integer>> mapa_paridades = new TreeMap<Integer, TreeSet<Integer>>();
		TreeSet<Integer> lista;
		
		for (Integer integer : paridades) {
			
			lista = Criar_lista_Bits_Dados_para_Paridades(tamanho_adaptado, integer, reverso);
			mapa_paridades.put(integer, lista);
		}
		
		/*for (Map.Entry<Integer, TreeSet<Integer>> integer : mapa_paridades.entrySet()) {
			System.out.println("Chave: " + integer.getKey() + "\nValores: " + integer.getValue());
			
		}*/
		return mapa_paridades;
	}
	
	
	public TreeSet<Integer> Criar_lista_Bits_Dados_para_Paridades(int tamanho_sequencia, int bit_paridade,
																    ArrayList<Integer> lista_bit_paridade){
		
		TreeSet<Integer> lista_bits_dados = new TreeSet<Integer>();
		ArrayList<Integer> reverso = new ArrayList<>();
		reverso.addAll(lista_bit_paridade);
		Collections.reverse(reverso);
		
		while (tamanho_sequencia >= 0){
			
			int valorTemp = tamanho_sequencia;
			
			for (Integer paridade : lista_bit_paridade) {
				if(valorTemp >= paridade){
					
					if(paridade.equals(bit_paridade)){
						lista_bits_dados.add(tamanho_sequencia);
						lista_bits_dados.remove(paridade);
					}
					valorTemp -= paridade;
				}
			}
			tamanho_sequencia --;
			
		}
		return lista_bits_dados;
		}

	
	
}
