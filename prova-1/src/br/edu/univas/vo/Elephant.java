package br.edu.univas.vo;

import br.edu.univas.factory.Animal;

public class Elephant implements Animal{

	@Override
	public void eat() {
		System.out.println("elephant eating");
	}
}
