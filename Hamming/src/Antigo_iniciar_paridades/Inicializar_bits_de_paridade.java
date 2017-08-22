package Antigo_iniciar_paridades;

import java.util.ArrayList;
import java.util.Map;

public class Inicializar_bits_de_paridade {
	
	public void Inicializar_Relacao_de_Bits_de_Dados
	(Map<Integer, ArrayList<Integer>> mapa_paridade){
		
		ArrayList<Integer> bits_verificados_por_1 = 
				new ArrayList<Integer>(){
			{add(3); add(5); add(7); add(9);
			 add(11); add(13); add(15); add(17); add(19); add(21); }};
			 
		ArrayList<Integer> bits_verificados_por_2 = 
				new ArrayList<Integer>(){
			{add(3); add(6); add(7); add(10);
			 add(11); add(14); add(15); add(18); add(19); add(22); }};
		
		ArrayList<Integer> bits_verificados_por_4 = 
				new ArrayList<Integer>(){
			{add(5); add(6); add(7); add(12);
			 add(13); add(14); add(15); add(20); add(21); add(22); }};
		
		ArrayList<Integer> bits_verificados_por_8 = 
				new ArrayList<Integer>(){
			{add(9); add(10); add(11); add(12);
			 add(13); add(14); add(15); }};
		
		ArrayList<Integer> bits_verificados_por_16 = 
				new ArrayList<Integer>(){
			{add(17); add(18); add(19); add(20); add(21); add(22); }};
		
		mapa_paridade.put(1, bits_verificados_por_1);
		mapa_paridade.put(2, bits_verificados_por_2);
		mapa_paridade.put(4, bits_verificados_por_4);
		mapa_paridade.put(8, bits_verificados_por_8);
		mapa_paridade.put(16, bits_verificados_por_16);
	}


}
