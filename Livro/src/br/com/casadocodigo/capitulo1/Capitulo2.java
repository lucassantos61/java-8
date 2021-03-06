package br.com.casadocodigo.capitulo1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {
	public static void main (String ... args){
		Usuario user1 = new Usuario("Paulo Silveira",180);
		Usuario user2 = new Usuario("Rodirgo Turini",120);
		Usuario user3 = new Usuario("Guilherme Silveira",190);

		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		
		/*usuarios.forEach(new Consumer<Usuario>(){
			public void accept(Usuario u){
				System.out.println(u.getNome());
			}
		});*/
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		
	
	}
}
