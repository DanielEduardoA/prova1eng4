package br.edu.univas.factory;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(int option) {
		if (option == 1) {
			return new VertebradoFactory();

		} else if (option == 2) {
			return new InvertebradoFactory();
		}
		
		return null;
	}

}
