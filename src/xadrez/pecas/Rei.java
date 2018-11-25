package xadrez.pecas;

import camada_tabuleiro.Tabuleiro;
import xadrez.Cores;
import xadrez.PecasDeXadrez;

public class Rei extends PecasDeXadrez {

	public Rei(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
	}
	
	@Override
	public String toString() {
		return "K";
	}
}
