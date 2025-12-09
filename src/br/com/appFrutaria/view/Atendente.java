package br.com.appFrutaria.view;

import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.model.Produto;
import br.com.appFrutaria.model.Verdura;

import java.util.Scanner;

public class Atendente
	{
		Scanner scanner;
		int opcao;
		
		public Atendente()
		{
			scanner = new Scanner(System.in);
		}
		
		public int menuPrincipal()
		{
			System.out.println("Digite:");
			System.out.println("1 para cadastrar um produto");
			System.out.println("2 para inspecionar os produtos");
			System.out.println("3 para remover um produto");
			System.out.println("4 para buscar um produto");
			System.out.println("0 para sair");
			opcao = scanner.nextInt();
			return opcao;
		}
		
		public int cadastro()
		{
			System.out.println("Que tipo de produto você deseja cadastrar?\n");
			System.out.println("1 - Frutas");
			System.out.println("2 - Verduras");
			System.out.println("3 - Produtos de Limpeza");
			
			return scanner.nextInt();
		}
		
		public int inspecao()
		{
			System.out.println("Que tipo de produto você deseja inspecionar?\n");
			System.out.println("1 - Frutas");
			System.out.println("2 - Verduras");
			System.out.println("3 - Produtos de Limpeza");
			
			return scanner.nextInt();
		}
		
		public int remocao()
		{
			System.out.println("Que tipo de produto você deseja remover?\n");
			System.out.println("1 - Frutas");
			System.out.println("2 - Verduras");
			System.out.println("3 - Produtos de Limpeza");
			
			return scanner.nextInt();
		}
		
		public int busca()
		{
			System.out.println("Que tipo de produto você deseja buscar?\n");
			System.out.println("1 - Frutas");
			System.out.println("2 - Verduras");
			System.out.println("3 - Produtos de Limpeza");
			
			return scanner.nextInt();
		}
		
		public String produtoNome()
		{
			System.out.print("Digite o nome: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		
		public double produtoPreco()
		{
			System.out.print("Digite o preço: ");
			scanner.nextLine();
			return scanner.nextDouble();
		}
		
		public int produtoQuantidade()
		{
			System.out.print("Digite a quantidade: ");
			return scanner.nextInt();
			
		}
		
		public void inspecionarFruta(Produto fruta)
		{
			System.out.println("Nome da fruta: " + fruta.getNome());
			System.out.println("Preco da fruta: " + fruta.getPreco());
			System.out.println("Quantidade: " + fruta.getQuantidade());
			System.out.println("Código: " + fruta.getCodigo());
		}
		
		public void inspecionarVerdura(Produto verdura)
		{
			System.out.println("Nome da verdura: " + verdura.getNome());
			System.out.println("Preco da verdura: " + verdura.getPreco());
			System.out.println("Quantidade: " + verdura.getQuantidade());
			System.out.println("Código: " + verdura.getCodigo());
		}
		
		public void inspecionarProdutoLimpeza(Produto produtoLimpeza)
		{
			System.out.println("Nome do produto: " + produtoLimpeza.getNome());
			System.out.println("Preco do produto: " + produtoLimpeza.getPreco());
			System.out.println("Quantidade: " + produtoLimpeza.getQuantidade());
			System.out.println("Código: " + produtoLimpeza.getCodigo());			
		}
		
		public String removerFruta()
		{
			System.out.println("Qual fruta você deseja remover: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public String removerVerdura()
		{
			System.out.println("Qual verdura você deseja remover: ");
			return scanner.nextLine();
		}
		
		public String removerProdutoLimpeza()
		{
			System.out.println("Qual produto você deseja remover?");
			return scanner.nextLine();
		}
		
		public void encontrado()
		{
			System.out.println("Encontrada!");
		}
		
		public void nEncontrado()
		{
			System.out.println("Não encontrada.");
		}
		
		public void removido()
		{
			System.out.println("Produto removido!");
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
		
		public void contagemFrutas(int total)
		{
			System.out.println("O total de frutas é de " + total);
		}
		
		public void contagemConsultas(int total)
		{
			System.out.println("O total de consultas foi de " + total);
		}
		
		public void listaVazia()
		{
			System.out.println("A lista está vazia ou não tem o tipo de produto que você precisa.");
		}
		
		public void mostrarProduto(String toString)
		{
			System.out.println(toString);
		}
		
		public int erro()
		{
			System.out.println("A opção escolhida não é válida, por favor insira novamente: ");
			return scanner.nextInt();
		}
	}
