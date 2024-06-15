package PooConta;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExemploConta c1 = new ExemploConta(123456, 123, 1, "Maria dos Santos", 2500.0f);
    	c1.visualiza();
    
    	ExemploConta c2 = new ExemploConta(123456, 123, 1, "João da Silva", 2000.0f);
    	c2.visualiza();
    
    	c1.setSaldo(100000.0f);
    	c1.setTitular("Maria Joaquina");
    	c1.visualiza();

	}


	}