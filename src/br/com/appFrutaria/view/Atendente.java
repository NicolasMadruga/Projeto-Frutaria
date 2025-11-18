package br.com.appFrutaria.view;

import br.com.appFrutaria.model.Fruta;
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
			System.out.println("Digite:\n1 para Cadastrar frutas\n2 para inspecionar\n3 para remover\n0 para sair");
			opcao = scanner.nextInt();
			return opcao;
		}
		
		public String frutaNome()
		{
			System.out.print("Digite o nome da fruta: ");
			return scanner.nextLine();
		}
		
		public double frutaPreco()
		{
			System.out.print("Digite o preço da fruta: ");
			return scanner.nextDouble();
		}
		
		public int frutaQuantidade()
		{
			System.out.print("Digite a quantidade: ");
			return scanner.nextInt();
		}
		
		public void inspecionar(Fruta fruta)
		{
			System.out.println("Nome da fruta: " + fruta.getNome());
			System.out.println("Preco da fruta: " + fruta.getPreco());
			System.out.println("Quantidade: " + fruta.getQuantidade());
		}
		
		public String removerFruta()
		{
			System.out.println("Qual fruta você deseja remover: ");
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
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
	}
