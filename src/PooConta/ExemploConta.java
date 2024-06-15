package PooConta;
public class ExemploConta {

    /*Atributos da Classe Conta*/
	private int numero = 0;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
 
   /*Método Construtor da Classe Conta - com todos os parâmetros*/
	public ExemploConta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
   
   /*Métodos Get e Set da Classe Conta*/
   public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void visualiza() {
		System.out.printf("\n Nome do titular: %s \n O saldo da conta %.2f \n "
				+ "O número da conta é: %d \n O número da agência: %d \n O tipo é: %d \n", 
				titular , saldo, numero, agencia, tipo);			
	}
   
}	