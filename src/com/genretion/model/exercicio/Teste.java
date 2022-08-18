package com.genretion.model.exercicio;

public class Teste extends Animal{

	public static void main(String[] args) {
	
		Cachorro c1 = new Cachorro();
		c1.setNome("Amerelão");
		c1.setIdade(2);
		c1.correr();
		c1.emitirSom();
		System.out.println("Nome: "+c1.getNome());
		System.out.println("Idade: "+c1.getIdade());
		
		Preguica p1 = new Preguica();
		p1.setNome("Flavin");
		p1.setIdade(4);
		p1.emitirSom();
		p1.subir();
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Idade: "+p1.getIdade());
		
		Cavalo h1 = new Cavalo();
		
		h1.setNome("Rodrigo");
		h1.setIdade(7);
		h1.correr();
		h1.emitirSom();
		System.out.println("Nome: "+h1.getNome());
		System.out.println("Idade: "+h1.getIdade());

	}

}
