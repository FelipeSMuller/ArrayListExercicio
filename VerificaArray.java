package exerciciosLivro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VerificaArray {

	public static void main(String[] args) {

		// Inicialização de dois arrays dinamicos
		ArrayList<Integer> inteiros = new ArrayList<>();

		ArrayList<Integer> numerosInteiros = new ArrayList<>();

		// atribuição de valores no primeiro array.
		inteiros.add(20);
		inteiros.add(40);
		inteiros.add(50);
		inteiros.add(60);
		inteiros.add(100);

		// atribuição de valores no segundo array.
		numerosInteiros.add(100);
		numerosInteiros.add(20);
		numerosInteiros.add(40);
		numerosInteiros.add(60);
		numerosInteiros.add(50);

		// chamando o método que irá verificar.
		JOptionPane.showMessageDialog(null, "Resultado Final = " + MeusArrays.arrayInput(inteiros, numerosInteiros, 0));

	}

}
