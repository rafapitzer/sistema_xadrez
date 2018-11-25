package xadrez.pecas;

import camada_tabuleiro.Tabuleiro;
import xadrez.Cores;
import xadrez.PecasDeXadrez;

public class Torre extends PecasDeXadrez{

	public Torre(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
	}

	@Override
	public String toString() {
		return "R";
	}
}
