package br.com.casadocodigo.capitulo1;

public class Usuario {
	private String nome;
	private int pontos;
	private boolean moderador;
	
	public  Usuario(String nome, int pontos){
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	
	/*public void setNome(String nome){
		 this.nome = nome;
	}*/
	
	public String getNome(){
		return nome;
	}
	/*public void setPontos(int pontos){
		this.pontos = pontos;
	}*/
	
	public int getPontos(){
		return pontos;
	}
	
	public void tornaModerador(boolean moderador){
		this.moderador = moderador;
	}
	
	public boolean isModerador(){
		return moderador;
	}
}
