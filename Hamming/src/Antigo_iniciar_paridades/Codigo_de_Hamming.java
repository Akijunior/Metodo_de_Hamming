package Antigo_iniciar_paridades;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import Atribuicao_de_bits_a_bits.Inicializar_bits_de_paridade;
import Domain.Sequencia_Final;
import Antigo_iniciar_paridades.*;

public class Codigo_de_Hamming {
	
	public String[] paridade_binaria = {"impar", "par"};
	
	public Map<Integer, ArrayList<Integer>> mapa_de_paridades = 
			new TreeMap<Integer, ArrayList<Integer>>();
	public Map<Integer, ArrayList<Integer>> mapa_de_dados = 
			new TreeMap<Integer, ArrayList<Integer>>();
	
	public Inicializar_bits_de_dados iniciar_dados = new Inicializar_bits_de_dados();
	public Antigo_iniciar_paridades.Inicializar_bits_de_paridade iniciar_paridades = 
			new Antigo_iniciar_paridades.Inicializar_bits_de_paridade();
	
	public Sequencia_Final sequencia_Final = new Sequencia_Final();
	
	public String Encontrar_Sequencia_Final(String bitsDeDados, String paridade){
		
		String sequenciaFinal = "";

		Map<Integer, Integer> mapa_dados = new TreeMap<Integer, Integer>();
		
		int cont = 0;
		int contPos = 1;
		
		iniciar_paridades.Inicializar_Relacao_de_Bits_de_Dados(mapa_de_paridades);
		iniciar_dados.Verificacao_Bits_paridade_Bits_dados(mapa_de_dados);
		
		while (cont < bitsDeDados.length()){
			
			char letra = bitsDeDados.charAt(cont);
			int binario = Character.getNumericValue(letra);
			
			if(mapa_de_dados.containsKey(contPos)){

				mapa_dados.put(contPos, binario);
				cont ++;
			}
			contPos ++;
		}
		
		Map<Integer, Integer> parte_paridade = 
				sequencia_Final.Avaliar_Bits_de_dados_para_determinar_bits_de_paridade(mapa_de_paridades, mapa_dados, paridade);
		
		mapa_dados.putAll(parte_paridade);
		
		for (Map.Entry<Integer, Integer> valor_dados : mapa_dados.entrySet())
			sequenciaFinal += String.valueOf(valor_dados.getValue());
		
		System.out.println("Sequência final: " + sequenciaFinal);
		Mostrar_Paridades(mapa_de_paridades);
		
		return sequenciaFinal;
	}
	
	
	public void Mostrar_Paridades(Map<Integer, ArrayList<Integer>> mapa_de_paridades){
		
		for (Map.Entry<Integer, ArrayList<Integer>> valor_dados : mapa_de_paridades.entrySet()) {
			if(valor_dados.getKey() == 4)
				System.out.println("Chave: " + valor_dados.getKey() +
			                   "\nValor: " + valor_dados.getValue());
		}
	}
}
