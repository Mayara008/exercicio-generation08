
package hierarquia;

public class cachorro extends Animal implements SomAnimal {

	int correr = 0;

	public void correr() {
		correr +=1;
	}

	@Override
	public void SomAnimal() {
		System.out.println("Au Au AU !");
	}
}
