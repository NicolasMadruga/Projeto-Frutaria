package br.com.appFrutaria;

import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.service.Prateleira;
import br.com.appFrutaria.view.Atendente;

public class AppFrutaria
	{

		public static void main(String[] args)
		{
			Atendente atendente = new Atendente();
			Prateleira prateleira = new Prateleira();
			
			int quantidadeConsultas = Prateleira.getConsultas();
			
			int opcaoEscolhida;
			
			
			do {
				opcaoEscolhida = atendente.menuPrincipal();
				prateleira.gerenciarPrateleira(opcaoEscolhida, atendente);
				
				
			} while (opcaoEscolhida != 0);
			
		}

	}
