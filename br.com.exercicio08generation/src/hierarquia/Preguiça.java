package hierarquia;

public class Pregui�a extends Animal implements SomAnimal{
 
	int correr = 0;


	public void correr() {
		correr +=0.5;
	}

	@Override
	public void SomAnimal() {
		System.out.println("zzz zzz zzz");
	}
}
