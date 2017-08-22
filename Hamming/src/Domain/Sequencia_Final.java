package Domain;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sequencia_Final {
	
	public Map<Integer, Integer> Avaliar_Bits_de_dados_para_determinar_bits_de_paridade
	(Map<Integer, ArrayList<Integer>> mapa_paridades, Map<Integer, Integer> mapa_dados, String par_ou_impar) {

		TreeMap<Integer, Integer> dados_a_voltarem = new TreeMap<>();
		
		int cont1 = 0; int cont2 = 0; int cont4 = 0; int cont8 = 0; int cont16 = 0; 
		
		
		for (Map.Entry<Integer, Integer> valor_dados : mapa_dados.entrySet()) {
			
			for (Map.Entry<Integer, ArrayList<Integer>> valor_paridade : mapa_paridades.entrySet()) {
				
				if(valor_paridade.getValue().contains(valor_dados.getKey()))
					if (valor_dados.getValue().equals(1)){
						if(valor_paridade.getKey().equals(1))
							cont1 ++;
						else if(valor_paridade.getKey().equals(2))
							cont2 ++;
						else if(valor_paridade.getKey().equals(4))
							cont4 ++;
						else if(valor_paridade.getKey().equals(8))
							cont8 ++;
						else if(valor_paridade.getKey().equals(16))
							cont16 ++;
				}
			}
		}
		if(par_ou_impar.equals("Par")){
			if(cont1%2==0)
				dados_a_voltarem.put(1, 0);
			else
				dados_a_voltarem.put(1, 1);
			
			if(cont2%2==0)
				dados_a_voltarem.put(2, 0);
			else
				dados_a_voltarem.put(2, 1);
			
			if(cont4%2==0)
				dados_a_voltarem.put(4, 0);
			else
				dados_a_voltarem.put(4, 1);
			
			if(cont8%2==0)
				dados_a_voltarem.put(8, 0);
			else
				dados_a_voltarem.put(8, 1);
			
			if(cont16%2==0)
				dados_a_voltarem.put(16, 0);
			else
				dados_a_voltarem.put(16, 1);
		}
		else{
			if(cont1%2!=0)
				dados_a_voltarem.put(1, 0);
			else
				dados_a_voltarem.put(1, 1);
			
			if(cont2%2!=0)
				dados_a_voltarem.put(2, 0);
			else
				dados_a_voltarem.put(2, 1);
			
			if(cont4%2!=0)
				dados_a_voltarem.put(4, 0);
			else
				dados_a_voltarem.put(4, 1);
			
			if(cont8%2!=0)
				dados_a_voltarem.put(8, 0);
			else
				dados_a_voltarem.put(8, 1);
			
			if(cont16%2!=0)
				dados_a_voltarem.put(16, 0);
			else
				dados_a_voltarem.put(16, 1);
		}
		
		return dados_a_voltarem;

	}

	public Map<Integer, Integer> Avaliar_Bits_de_dados_para_determinar_bits_de_paridade_V2(
			Map<Integer, TreeSet<Integer>> paridades, Map<Integer, Integer> mapa_dados, String paridade) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, Integer> dados_a_voltarem = new TreeMap<>();
		
		int cont1 = 0; int cont2 = 0; int cont4 = 0; int cont8 = 0; int cont16 = 0;
		
		
		for (Map.Entry<Integer, Integer> valor_dados : mapa_dados.entrySet()) {
			
			for (Map.Entry<Integer, TreeSet<Integer>> valor_paridade : paridades.entrySet()) {
				
				if(valor_paridade.getValue().contains(valor_dados.getKey()))
					if (valor_dados.getValue().equals(1)){
						if(valor_paridade.getKey().equals(1))
							cont1 ++;
						else if(valor_paridade.getKey().equals(2))
							cont2 ++;
						else if(valor_paridade.getKey().equals(4))
							cont4 ++;
						else if(valor_paridade.getKey().equals(8))
							cont8 ++;
						else if(valor_paridade.getKey().equals(16))
							cont16 ++;
				}
			}
		}
		if(paridade.equals("Par")){
			if(cont1%2==0)
				dados_a_voltarem.put(1, 0);
			else
				dados_a_voltarem.put(1, 1);
			
			if(cont2%2==0)
				dados_a_voltarem.put(2, 0);
			else
				dados_a_voltarem.put(2, 1);
			
			if(cont4%2==0)
				dados_a_voltarem.put(4, 0);
			else
				dados_a_voltarem.put(4, 1);
			
			if(cont8%2==0)
				dados_a_voltarem.put(8, 0);
			else
				dados_a_voltarem.put(8, 1);
			
			if(cont16%2==0)
				dados_a_voltarem.put(16, 0);
			else
				dados_a_voltarem.put(16, 1);
		}
		else{
			if(cont1%2!=0)
				dados_a_voltarem.put(1, 0);
			else
				dados_a_voltarem.put(1, 1);
			
			if(cont2%2!=0)
				dados_a_voltarem.put(2, 0);
			else
				dados_a_voltarem.put(2, 1);
			
			if(cont4%2!=0)
				dados_a_voltarem.put(4, 0);
			else
				dados_a_voltarem.put(4, 1);
			
			if(cont8%2!=0)
				dados_a_voltarem.put(8, 0);
			else
				dados_a_voltarem.put(8, 1);
			
			if(cont16%2!=0)
				dados_a_voltarem.put(16, 0);
			else
				dados_a_voltarem.put(16, 1);
		}
		
		return dados_a_voltarem;
	}
}


