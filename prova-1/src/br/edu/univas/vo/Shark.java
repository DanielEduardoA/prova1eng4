package br.edu.univas.vo;

import br.edu.univas.factory.Animal;

public class Shark implements Animal{

	@Override
	public void eat() {
		System.out.println("shark eating");
	}

}
