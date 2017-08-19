package Antigo_iniciar_paridades;

import java.util.ArrayList;
import java.util.Map;

public class Inicializar_bits_de_dados {
	
	public void Verificacao_Bits_paridade_Bits_dados
	(Map<Integer, ArrayList<Integer>> mapa_dados){
		
		ArrayList<Integer> bits_que_verificam_3 = 
				new ArrayList<Integer>(){
			{add(1); add(2); }};
			 
		ArrayList<Integer> bits_que_verificam_5 = 
				new ArrayList<Integer>(){
			{add(1); add(4); }};
		
		ArrayList<Integer> bits_que_verificam_6 = 
				new ArrayList<Integer>(){
			{add(2); add(4); }};
		
		ArrayList<Integer> bits_que_verificam_7 = 
				new ArrayList<Integer>(){
			{add(1); add(2); add(4); }};
		
		ArrayList<Integer> bits_que_verificam_9 = 
				new ArrayList<Integer>(){
			{add(1); add(8); }};
		
		ArrayList<Integer> bits_que_verificam_10 = 
				new ArrayList<Integer>(){
			{add(2); add(8); }};
		
		ArrayList<Integer> bits_que_verificam_11 = 
				new ArrayList<Integer>(){
			{add(1); add(2); add(8); }};
		
		ArrayList<Integer> bits_que_verificam_12 = 
				new ArrayList<Integer>(){
			{add(4); add(8); }};
		
		ArrayList<Integer> bits_que_verificam_13 = 
				new ArrayList<Integer>(){
			{add(1); add(4); add(8); }};
		
		ArrayList<Integer> bits_que_verificam_14 = 
				new ArrayList<Integer>(){
			{add(2); add(4); add(8); }};
		
		ArrayList<Integer> bits_que_verificam_15 = 
				new ArrayList<Integer>(){
			{add(1); add(2); add(4); add(8); }};
			
		ArrayList<Integer> bits_que_verificam_17 = 
				new ArrayList<Integer>(){
			{add(1); add(16); }};
		
		ArrayList<Integer> bits_que_verificam_18 = 
				new ArrayList<Integer>(){
			{add(2); add(16); }};
			
		ArrayList<Integer> bits_que_verificam_19 = 
				new ArrayList<Integer>(){
			{add(1); add(2); add(16); }};
			
		ArrayList<Integer> bits_que_verificam_20 = 
				new ArrayList<Integer>(){
			{add(4); add(16); }};
			
		ArrayList<Integer> bits_que_verificam_21 = 
				new ArrayList<Integer>(){
			{add(1); add(4); add(16); }};
	
		ArrayList<Integer> bits_que_verificam_22 = 
				new ArrayList<Integer>(){
			{add(2); add(4); add(16); }};
			
			
			mapa_dados.put(3, bits_que_verificam_3);
			mapa_dados.put(5, bits_que_verificam_5);
			mapa_dados.put(6, bits_que_verificam_6);
			mapa_dados.put(7, bits_que_verificam_7);
			mapa_dados.put(9, bits_que_verificam_9);
			mapa_dados.put(10, bits_que_verificam_10);
			mapa_dados.put(11, bits_que_verificam_11);
			mapa_dados.put(12, bits_que_verificam_12);
			mapa_dados.put(13, bits_que_verificam_13);
			mapa_dados.put(14, bits_que_verificam_14);
			mapa_dados.put(15, bits_que_verificam_15);
			mapa_dados.put(17, bits_que_verificam_17);
			mapa_dados.put(18, bits_que_verificam_18);
			mapa_dados.put(19, bits_que_verificam_19);
			mapa_dados.put(20, bits_que_verificam_20);
			mapa_dados.put(21, bits_que_verificam_21);
			mapa_dados.put(22, bits_que_verificam_22);
		
	}

}
