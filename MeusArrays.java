package exerciciosLivro;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class MeusArrays {

	// Entrada dos parametros, dois arrays e um numero inteiro.
	public static int arrayInput(ArrayList<Integer> lista, ArrayList<Integer> lista2, int busca) {

		try {

			// verificação da entrada
			busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo"));

			// se o numero for negativo ou 0 um erro ocorre.
			if (busca <= 0) {
				JOptionPane.showMessageDialog(null, "Apenas números inteiros positivos são válidos \nERRO!!");
			}

			else {

				// Ordenação do array dinamico com Collections
				Collections.sort(lista);

				Collections.sort(lista2);

				// valores booleanos iniciados em false.

				/*
				 * Usar valores booleanos permite que controle de um número seja encontrado em
				 * cada array separadamente, sem retornar imediatamente após encontrar o número
				 * em um dos arrays.
				 */

				boolean encontradoEmLista1 = false;

				boolean encontradoEmLista2 = false;

				
				//Iteração sob os dois arrays dinamicos, e a atribuição de true no valor booleano caso o número seja encontrado.
				for (int i = 0; i < lista.size(); i++) {

					if (lista.get(i).equals(busca)) {

						encontradoEmLista1 = true;
					}

				}
				
				//Iterar sob dois arrays separados permite Legibildade , Independência dos Arrays , Melhor Controle.

				for (int i = 0; i < lista2.size(); i++) {

					if (lista2.get(i).equals(busca)) {

						encontradoEmLista2 = true;

					}
				}

				if (encontradoEmLista1 && encontradoEmLista2) {
					return 2;

				} else if (encontradoEmLista1 || encontradoEmLista2) {

					return 1;

				} else {

					return 0;
				}

			}

		} catch (NumberFormatException | NullPointerException erro) {
			JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");
		}

		return busca;

	}

}