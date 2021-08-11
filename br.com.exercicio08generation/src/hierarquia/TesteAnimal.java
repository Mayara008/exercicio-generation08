
package hierarquia;

import java.util.Scanner;

public class TesteAnimal {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int som = 0;
		int bicho;
		cachorro doguinho = new cachorro();
		cavalo pangare = new cavalo();
		Preguiça preguica = new Preguiça();


		doguinho.setNome("Doguinho");
		doguinho.setIdade(2);
		pangare.setNome("Pangare");
		pangare.setIdade(5);
		preguica.setNome("Preguiça");
		preguica.setIdade(3);


		System.out.println("Escolha um animal : ");
		System.out.println("1 - Cachorro");
		System.out.println("2 - Cavalo");
		System.out.println("3 - Preguiça");
		bicho = ler.nextInt();
		if(bicho == 1) {
			System.out.println("Cachorro, nome :" + doguinho.getNome());
			System.out.println("A idade do cachorro é " + doguinho.getIdade() + " Anos");
			System.out.println("Deseja ouvir o som do cachorro : 1- sim, 2 - não" );
			som = ler.nextInt();
			if(som == 1) {
				doguinho.SomAnimal();
			}

		}else if (bicho == 2) {
			System.out.println("Cavalo, nome :" + pangare.getNome());
			System.out.println("A idade do Cavalo é " + pangare.getIdade() + " Anos");
			System.out.println("Deseja ouvir o som do cavalo : 1- sim, 2 - não" );
			som = ler.nextInt();
			if(som == 1) {
				pangare.SomAnimal();
			}

		}else if (bicho == 3) {
			System.out.println("Preguiça, nome :" + preguica.getNome());
			System.out.println("A idade da preguiça é " + preguica.getIdade() + " Anos");
			System.out.println("Deseja ouvir o som da preguiça : 1- sim, 2 - não" );
			som = ler.nextInt();
			if(som == 1) {
				preguica.SomAnimal();
			}
		}else {
			System.out.println("Porfavor digite um numero valido !");

		}
		System.out.println("Fim do programa");
		ler.close();
	}

}