package br.edu.univas.vo;

import br.edu.univas.factory.Animal;

public class Ant implements Animal {

	@Override
	public void eat() {
		System.out.println("ant eating");
	}

	
}
