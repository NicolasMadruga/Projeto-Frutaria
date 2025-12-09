package br.com.appFrutaria.service;

import java.util.List;
import java.util.ArrayList;

import br.com.appFrutaria.model.Produto;
import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.model.Verdura;
import br.com.appFrutaria.model.ProdutosLimpeza;

import br.com.appFrutaria.view.Atendente;

public class Prateleira
	{
		Atendente atendente;
		ArrayList<Produto> listaProdutos;
		private int opcao;

		private int frutas;
		private int verduras;
		private int pLimpeza;

		static int consultas;
		
		public Prateleira()
		{
			atendente = new Atendente();

			listaProdutos = new ArrayList<>();
		}

		public static int getConsultas()
		{
			return consultas;
		}

		public void gerenciarPrateleira(int opcao, Atendente atendente)
		{
			int totalConsultas = consultas;
			consultas++;

			atendente.contagemConsultas(totalConsultas);

			if (opcao < 0 || opcao > 4)
			{
				do
				{
				opcao = atendente.erro();
				} while(opcao < 0 || opcao > 4);
			}

			switch (opcao)
			{
			case 1:
			{
				int cadastro = atendente.cadastro();

				if (cadastro < 1 || cadastro > 3)
				{
					atendente.erro();
				}

				if (cadastro == 1)
				{
					String nome = atendente.produtoNome();
					double preco = atendente.produtoPreco();
					int quantidade = atendente.produtoQuantidade();

					Produto fruta = new Fruta(nome, preco, quantidade);
					listaProdutos.add(fruta);

					frutas++;
				} 
				else if (cadastro == 2)
				{
					String nome = atendente.produtoNome();
					double preco = atendente.produtoPreco();
					int quantidade = atendente.produtoQuantidade();

					Produto verdura = new Verdura(nome, preco, quantidade);
					listaProdutos.add(verdura);

					verduras++;
				} 
				else if (cadastro == 3)
				{
					String nome = atendente.produtoNome();
					double preco = atendente.produtoPreco();
					int quantidade = atendente.produtoQuantidade();

					Produto limpeza = new ProdutosLimpeza(nome, preco, quantidade);
					listaProdutos.add(limpeza);

					verduras++;
				}

				break;
			}
			case 2: 
			{
				int inspecao = atendente.inspecao();

				if (inspecao < 0 || inspecao > 3)
				{
					atendente.erro();
				}

				if (listaProdutos.isEmpty())
				{
					atendente.listaVazia();
				}

				switch (inspecao)
				{
				case 1: 
				{
					if (frutas == 0)
					{
						atendente.listaVazia();
					}
					else
					{
						for (Produto p : listaProdutos)
						{
							if (p instanceof Fruta)
							{
								String msg = p.toString();
								atendente.mostrarProduto(msg);
							}
						}
					}

					break;
				}
				case 2:
				{
					if (verduras == 0)
					{
						atendente.listaVazia();
					}
					else
					{
						for (Produto p : listaProdutos)
						{
							if (p instanceof Verdura)
							{
								String msg = p.toString();
								atendente.mostrarProduto(msg);
							}
						}
					}

					break;
				}

				case 3:
				{
					if (pLimpeza == 0)
					{
						atendente.listaVazia();
					} 
					else
					{
						for (Produto p : listaProdutos)
						{
							if (p instanceof ProdutosLimpeza)
							{
								String msg = p.toString();
								atendente.mostrarProduto(msg);
							}
						}
					}

					break;
				}
				}

				break;
			}
			case 3:
			{
				int remocao = atendente.remocao();
				
				
				if (frutas == 0)
				{
					atendente.listaVazia();
				}
				else if (remocao == 1)
				{
					
					String nome = atendente.produtoNome();
					
					for (int i = 0; i < listaProdutos.size(); i++)
					{
						if (listaProdutos.get(i).getNome().equalsIgnoreCase(nome))
						{
							listaProdutos.remove(i);
						}
					}
				} 
				
				if (verduras == 0)
				{
					atendente.listaVazia();
				}
				else if (remocao == 2)
				{
					if (verduras == 0)
					{
						atendente.listaVazia();
					}
					
					String nome = atendente.produtoNome();
					
					for (int i = 0; i < listaProdutos.size(); i++)
					{
						if (listaProdutos.get(i).getNome().equalsIgnoreCase(nome))
						{
							listaProdutos.remove(i);
						}
					}
				} 
				
				if (pLimpeza == 0)
				{
					atendente.listaVazia();
				}
				else if (remocao == 3)
				{
					if (pLimpeza == 0)
					{
						atendente.listaVazia();
					}
					
					String nome = atendente.produtoNome();
					
					for (int i = 0; i < listaProdutos.size(); i++)
					{
						if (listaProdutos.get(i).getNome().equalsIgnoreCase(nome))
						{
							listaProdutos.remove(i);
						}
					}
				}

				break;
			}

			case 4: 
			{
				int busca = atendente.busca();

				if (listaProdutos.isEmpty())
				{
					atendente.listaVazia();
				} 
				else
				{
					if (busca == 1)
					{
						if (frutas == 0)
						{
							atendente.listaVazia();
						}
						
						for (Produto p : listaProdutos)
						{
							if (p instanceof Fruta f)
							{
								atendente.inspecionarFruta(f);
							}
						}
					} 
					else if (busca == 2)
					{
						if (verduras == 0)
						{
							atendente.listaVazia();
						}
						
						for (Produto p : listaProdutos)
						{
							if (p instanceof Verdura v)
							{
								atendente.inspecionarVerdura(v);
							}
						}
					} 
					else if (busca == 3)
					{
						if (pLimpeza == 0)
						{
							atendente.listaVazia();
						}
						
						for (Produto p : listaProdutos)
						{
							if (p instanceof ProdutosLimpeza pl)
							{
								atendente.inspecionarProdutoLimpeza(pl);
							}
						}
					}
				}

				break;
			}
			
			case 0: 
			{
				atendente.encerrar();
				break;
			}
			}
		}
	}
