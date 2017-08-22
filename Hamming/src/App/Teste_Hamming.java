package App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import Antigo_iniciar_paridades.Codigo_de_Hamming;
import Atribuicao_de_bits_a_bits.Inicializar_bits_de_paridade;
import Domain.Codigo_de_Hamming_V2;

public class Teste_Hamming {
	
	public static void main(String[] args) {
		
		Codigo_de_Hamming hamming = new Codigo_de_Hamming();
		Codigo_de_Hamming_V2 hammingV2 = new Codigo_de_Hamming_V2();
		
		Inicializar_bits_de_paridade paridade = new Inicializar_bits_de_paridade();
		int bit_paridade = 1;
		ArrayList<Integer> lista_bit_paridade = new ArrayList<Integer>();
		
		lista_bit_paridade.add(1); lista_bit_paridade.add(2); lista_bit_paridade.add(4);
		lista_bit_paridade.add(8); lista_bit_paridade.add(16);
		
		Map<Integer, TreeSet<Integer>> valor = paridade.Inicializar_Relacao_de_Bits_de_Paridade(12);

		//String sequencia1 = hamming.Encontrar_Sequencia_Final("100111001010", "Impar");
		//System.out.println("\n");
		hammingV2.Gerar_Sequencia_Final("100111001010", "Impar");
		
		
	}
}
