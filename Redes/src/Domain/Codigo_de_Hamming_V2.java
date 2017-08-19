package Domain;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import Atribuicao_de_bits_a_bits.Inicializar_bits_de_paridade;

public class Codigo_de_Hamming_V2 {
	
	public Inicializar_bits_de_paridade iniciar_paridades = new Inicializar_bits_de_paridade();
	public Sequencia_Final sequencia_Final = new Sequencia_Final();
		
	public void Gerar_Sequencia_Final(String sequencia_bits, String par_ou_impar){
		
		String sequenciaFinal = "";
		int tamanho_sequencia = sequencia_bits.length();
		int cont = 0;
		int contPos = 2;
		
		Map<Integer, Integer> mapa_dados = new TreeMap<Integer, Integer>();
		Map<Integer, TreeSet<Integer>> dic_dados_paridades = 
				iniciar_paridades.Inicializar_Relacao_de_Bits_de_Paridade(tamanho_sequencia);
		
		while (cont < tamanho_sequencia){
					
			char letra = sequencia_bits.charAt(cont);
			int binario = Character.getNumericValue(letra);
			
			if(dic_dados_paridades.containsKey(contPos))
				contPos ++;
			if(contPos == 16)
				contPos ++;

			mapa_dados.put(contPos, binario);
			contPos ++;
			cont ++;
		}
		
		Map<Integer, Integer> parte_paridade = 
				sequencia_Final.Avaliar_Bits_de_dados_para_determinar_bits_de_paridade_V2
		(dic_dados_paridades, mapa_dados, par_ou_impar);
		mapa_dados.putAll(parte_paridade);
		
		
		for (Map.Entry<Integer, Integer> valor_dados : mapa_dados.entrySet())
			sequenciaFinal += String.valueOf(valor_dados.getValue());  
		
		System.out.println("Sequência final: " + sequenciaFinal);
		Mostrar_Paridades(dic_dados_paridades);
	}
	
	public void Mostrar_Paridades(Map<Integer, TreeSet<Integer>> mapa_de_paridades){
			
			for (Map.Entry<Integer, TreeSet<Integer>> valor_dados : mapa_de_paridades.entrySet()) {
				if(valor_dados.getKey() == 4)
					System.out.println("Chave: " + valor_dados.getKey() +
				                   "\nValor: " + valor_dados.getValue());
			}
		}

}
