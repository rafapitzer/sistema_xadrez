package camada_tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		tabuleiro = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}	
}
