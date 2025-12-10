package br.com.appFrutaria.model;

public class Verdura extends Produto
	{
		private String tipo;
		
		
		public Verdura()
		{
			super();
			this.tipo = null;
		}
		
		public Verdura(String nome, double preco, int quantidade)
		{
			super(nome, preco, quantidade);
		}
		
		@Override
		public String toString()
		{
			return "Nome: " + nome + "\nPreco: " + preco + "\nQuantidade: " + quantidade;
		}
		
	}
