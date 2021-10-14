package collections3;

import java.util.ArrayList;
import java.util.List;

public class estoque {

	public static void main(String[] args) {
		
		List<estoqueLoja> produtos = new ArrayList<estoqueLoja>();
		int indice = 0;

		estoqueLoja produto1 = new estoqueLoja("PlayStation 5", 0001, 5, 5999.90);
		estoqueLoja produto2 = new estoqueLoja("Maquina de lavar", 0002, 15, 8789.00);
		estoqueLoja produto3 = new estoqueLoja("Ferro de passar", 0003, 30, 4499.00);
		estoqueLoja produto4 = new estoqueLoja("Caixa de som", 0004, 80, 149.00);
		estoqueLoja produto5 = new estoqueLoja("Fone celular", 0005, 100, 99.00);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);

		System.out.println("Adicionando produtos a Lista...");
		System.out.println();
		System.out.println("LISTA ATUALIZADA");

		for (estoqueLoja produto : produtos) {
			System.out.println(produto.toString());
			System.out.println("\n");
			System.out.println("\n");
		}

		produtos.remove(produto1);
		produtos.remove(produto2);
		System.out.println("Removendo produtos à Lista...");
		System.out.println();
		System.out.println("LISTA ATUALIZADA");

		for (estoqueLoja produto : produtos) {
			System.out.println(produto.toString());
			System.out.println("\n");
			System.out.println("\n");
		}

		produtos.add(produto2);
		indice = produtos.indexOf(produto2);
		produto1.setPreco(9.99);
		produtos.set(indice, produto1);

		System.out.println("Atualizando preços...");
		System.out.println("LISTA ATUALIZADA");
		for (estoqueLoja produto : produtos) {
			System.out.println(produto.toString());
			System.out.println();
			System.out.println();
		}
	}
}
