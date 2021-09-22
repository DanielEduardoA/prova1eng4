package br.edu.univas.vo;

import br.edu.univas.factory.Animal;

public class Bee implements Animal {

	@Override
	public void eat() {
		System.out.println("bee eating");
	}

	
}
