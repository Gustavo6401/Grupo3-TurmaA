import java.util.Scanner;

public class o�tlmoDeN�s 

{

	public static void main(String[] args)
	
	{
		
		Scanner entrada = new Scanner (System.in);
		
		boolean menu = false;
		String nome;
        int opcao; 
		
		System.out.println(" *-----------* Seja Bem Vindo ao Jogo *-----------* ");
		System.out.println("\n                  O �LTIMO DE N�S                   ");
		
		System.out.print("\nPor favor, digite o nome do player: ");
		nome = entrada.next();
		
		System.out.printf("\nOl� %s", nome);
		
		do {
			
			System.out.println("\nDigite a op��o desejada: ");
			
			
			System.out.println("\n(1) - Iniciar");
			System.out.println("(2) - Instru��es");
			System.out.println("(3) - Como Jogar");
			System.out.println("(4) - Sair");
			
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				menu = true;
			break;
			case 2:
				System.out.println(nome + " as instru��es s�o b�sicas, voc� deve ajudar Will Smith a desvendar todos os mist�rios de CONCEITOS DA COMPUTA��O. \r\n"
						+"\r\n"
						+ "Somente assim, will ser� capaz de vencer todas essas m�quinas que est�o ansiosas para lhe derrotar!!!!\r\n"
						+ "\r\n"
						+ "Lembre-se dos n�meros e de suas convers�es de bases. Este ser� o passo mais f�cil que voc� percorrer�. A dificuldade aumentar� ao avan�ar.\r\n"
						+ "\r\n"
						+ "Espero que se lembre de Maurice Karnaugh. Afinal, o mapa que ele aprimorou ser� um dos maiores desafios a ser enfrentados.\r\n"
						+ "\r\n"
						+ "Agora siga! Avante!!!! \\r\\n");
						
				break;
			case 3:
				System.out.println("No jogo todas as perguntas s�o de alternativas, por tanto leia atentamente as perguntas e digite a reposta que desejar, por�m"
						+ " "
						+ "tome cuidado, pois voc� ter� chances limitadas. ");
				break;
			case 4:
				System.out.println("");
				break;
				default:
					System.out.println("Digite uma op��o v�lida");
			}
			
		}while(menu==false);
		
	}
	
}
