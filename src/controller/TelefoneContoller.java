package controller;

import br.edu.fateczl.fila.Fila;

public class TelefoneContoller {

	
	public TelefoneContoller() {
			super();
	}
	
	public void insereLigacoes(Fila<String>fila,String numTel)
	{
		fila.insert(numTel);
		System.out.println("Chamada Salva");
		
	}
	public void consultaLigacao(Fila<String> fila) throws Exception
	{
		System.out.println("Lista de chamadas:");
	
		if(fila.isEmpty())
		{
			throw new Exception("Não há chamadas registradas");
		}
		while(!fila.isEmpty())
		{
			try {
				System.out.println(fila.remove());
			} catch (Exception e) {
				
			}
		}
		
	}
	
}
