package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.Fila;
import controller.TelefoneContoller;

public class Principal {

	public static void main(String[] args) {
		
		TelefoneContoller telefone = new TelefoneContoller();
		Fila<String> fila = new Fila<>();
		
		int opc=0 ;
		while(opc!=9)
		{
			opc=Integer.parseInt(JOptionPane.showInputDialog("Digite :\n 1-Inserir Ligação\n "
					+ "2-Consular Ligações\n 9-Sair"));
			switch (opc) {
			case 1: {
				String numTelefone=JOptionPane.showInputDialog("Digite o telefone :");
				telefone.insereLigacoes(fila, numTelefone);
				break;
			}
			case 2:{
				try {
				telefone.consultaLigacao(fila);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 9:{
				System.out.println("Fim");
				break;
			}
			default:
				System.out.println("Valor digitado não é valido , tente novamente");
			}
			
			
		}
		
		
	}

}
