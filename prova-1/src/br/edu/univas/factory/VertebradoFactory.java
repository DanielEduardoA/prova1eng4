package br.edu.univas.factory;

import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class VertebradoFactory implements AbstractFactory{

	@Override
	public void createAnimals() {
		Shark shark = new Shark();
		shark.eat();
		Elephant elephant = new Elephant();
		elephant.eat();
	}
}
