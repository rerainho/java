package PooExemploTransporte;

public class PooTerrestre {
	
	private int numeroRodas;
	protected float velocidade;

	public PooTerrestre(int capacidade, int numeroRodas, float velocidade) {
		super();
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

    public void visualizar() {

    	
		super.visualizar();
		System.out.println("Número de rodas: " + this.numeroRodas);
		System.out.println("Velocidade é: " + this.velocidade);

	
	}
}