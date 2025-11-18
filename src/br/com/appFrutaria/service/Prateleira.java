package br.com.appFrutaria.service;

import java.util.List;
import java.util.ArrayList;

import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.view.Atendente;


public class Prateleira
	{
		Atendente atendente;
		ArrayList<Fruta> listaFruta;
		int opcao;
		
		public Prateleira()
		{
			atendente = new Atendente();
			listaFruta = new ArrayList<>();
		}
		
		public void gerenciarPrateleira(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			case 1 :
			{
			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			
			Fruta fruta = new Fruta(nome, preco, quantidade);
			listaFruta.add(fruta);
			
			break;
			}
			case 2:
			{
				for (Fruta fruta : listaFruta)
				{
					atendente.inspecionar(fruta);
				}
				break;
			}
			case 3:
			{
				String nome = atendente.removerFruta();
				boolean removido = false;
				
				for (int i = 0; i < listaFruta.size(); i++)
				{
					if(listaFruta.get(i).getNome().equalsIgnoreCase(nome))
					{
						listaFruta.remove(i);
						removido = true;
						break;
					}
				}
			}
			
			case 4:
			{
				String nomeFruta = atendente.frutaNome();
				
				for (Fruta fruta : listaFruta)
				{
					if (fruta.getNome().equalsIgnoreCase(nomeFruta))
					{
						atendente.encontrado();
						atendente.inspecionar(fruta);
					}
					else
					{
						atendente.nEncontrado();
					}
				}
			}
			
			case 0:
			{
				atendente.encerrar();//
			}
			}
		}
	}
