package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {
	public static void main(String[] args) {
		Map<Integer , String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		
		 for (int Chave : usuarios.keySet()) {
			System.out.println(Chave);
		}
		
			 for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
			 for(Entry<Integer, String> registro: usuarios.entrySet()) {
				 System.out.println(registro.getKey() + " ===> "); 
			 }
	}

}
