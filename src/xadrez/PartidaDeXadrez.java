package xadrez;

import camada_tabuleiro.Posicao;
import camada_tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		IniciarPartida();
	}
	
	public PecasDeXadrez[][] getPecas(){
		PecasDeXadrez[][] mat = new PecasDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for(int j = 0 ; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecasDeXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	private void IniciarPartida() {
		tabuleiro.moverPeca(new Torre(tabuleiro, Cores.WHITE), new Posicao(2,1));
		tabuleiro.moverPeca(new Rei(tabuleiro, Cores.BLACK), new Posicao(0,4));
		tabuleiro.moverPeca(new Rei(tabuleiro, Cores.WHITE), new Posicao(7,4));
	}
}
