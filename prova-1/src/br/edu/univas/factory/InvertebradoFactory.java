package br.edu.univas.factory;

import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;

public class InvertebradoFactory implements AbstractFactory {

	@Override
	public void createAnimals() {
		Ant ant = new Ant();
		ant.eat();

		Bee bee = new Bee();
		bee.eat();
	}
}
