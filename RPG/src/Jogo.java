import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

public class Jogo {

	static int temp_dialog = 100, temp_narrativa = 100, temp_transicao = 100;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);

		Escreve("\n *-----------* �SEJA BEM VINDO AO JOGO� *-----------*", TimeUnit.MILLISECONDS, temp_dialog);
		Escreve("\n                   O �LTIMO DE N�S                   ", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("\n   ");
		Escreve("\n Voc� est� preparado para encarar o futuro... meu caro jogador?", TimeUnit.MILLISECONDS,
				temp_dialog);
		System.out.println("\n ");
		System.out.println(
				"\n 1|SIM, estou pronto!       2|Talvez, n�o sei o que me espera...           3|N�o, tenho medo!!!");
		int responder = entrada.nextInt();
		if (responder == 1) {
			Escreve("Muito bem... Muito bem... Vejamos s�, temos um corajoso por aqui! A grande matrix amar� enfrent�-lo HAHAHAH. Vejamos se � capaz de vencer um computador!!!!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (responder == 2) {
			Escreve("Ora, ora... Achei que era mais corajoso, pobre criatura... Est� ai, um grande motivo pelo qual os computadores s�o bem mais desenvolvidos e ultrapassaram a ra�a humana!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (responder == 3) {
			Escreve("Vejamos s� o que temos por aqui: o pior da peste humana! Chorar� e lamentar� no reinado das m�quinas, j� est� aqui verme... PROSSIGA!",
					TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		}

	}

	public static void Escreve(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int opcao_menu;
		do {
			Escreve("\n\n..::�  �O �LTIMO DE N�S�  �::.. \n\n1 - Jogar \n2 - Sobre o Jogo\n3 - Cr�ditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			opcao_menu = entrada.nextInt();
			if (opcao_menu == 1) {
				jogar();
			} else if (opcao_menu == 2) {
				sobre();
			} else if (opcao_menu == 3) {
				creditos();
			} else if (opcao_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (opcao_menu != 1 && opcao_menu != 2 && opcao_menu != 3 && opcao_menu != 4);
	}

	static void jogar() throws Exception {

	}
	static void sobre() throws Exception {

	}

	static void creditos() throws Exception {
		Scanner entrada = new Scanner (System.in);
        int opcao_menu, temp_narrativa = 150;
        System.out.println("SENAC - SERVI�O NACIONAL DE APRENDIZAGEM COMERCIAL \nJogo elaborado para o PROJETO INTEGRADOR para a mat�ria de PI, no curso de AN�LISE E DESENVOLVIMENTO DE SISTEMAS! \nParticiparam ativamente da cria��o do jogo rpg textual(desenvolvedores):");
        
        Escreve("\n\n-> �Guilherme Alves \n-> �Vin�cius Santana \n-> �Matheus Thome \n-> �Gustavo Souza",TimeUnit.MILLISECONDS, temp_narrativa);
        do{
        System.out.println("\n2 - Sair");
        opcao_menu = entrada.nextInt();
        if(opcao_menu == 2){
          menu();
        }else{
           System.out.println("\nOp��o inv�lida, digite novamente: ");
        }}while(opcao_menu!=2);
     }
	}
