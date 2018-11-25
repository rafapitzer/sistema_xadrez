package xadrez;

import camada_tabuleiro.Pecas;
import camada_tabuleiro.Tabuleiro;

public class PecasDeXadrez extends Pecas {
		
	private Cores cores;

	public PecasDeXadrez(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro);
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}	
}
