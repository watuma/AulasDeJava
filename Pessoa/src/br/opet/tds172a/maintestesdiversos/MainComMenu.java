package br.opet.tds172a.maintestesdiversos;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opet.util.Reader;

import br.opet.tds172a.cargos.Funcionario;
import br.opet.tds172a.util.MyReader;

/**
 * 
 * @author Heraldo
 * @since 19/02/2018
 * @version 1.0.1 Esta classe serve para efetuar os testes durante a aula para
 *          efetuar o cadastro de varios objetos com vetor
 * 
 */
public class MainComMenu {

	/**
	 * constante que determina o tamanho da lista de funcionarios
	 * 
	 * constante � um valor que nunca ir� se alterar por hipotese alguma
	 */
	public static final int TAMANHO_LISTA_FUNCIONARIOS = 2;

	public static void main(String[] args) throws Exception {

		/**
		 * 
		 */
		Funcionario[] listaFuncionarios = new Funcionario[TAMANHO_LISTA_FUNCIONARIOS];
		/**
		 * Declara��o da variavel menu para utiliza��o na switch
		 */
		int menu;

		/**
		 * variavel contador para efetuar a contagem at� o maximo da lista
		 */
		int contador = 0;

		/**
		 * looping para execu��o do menu e das opera��es necessarias de acordo com a
		 * op��o.
		 */

		do {
			/**
			 * Mensagens de boas vindas, e instru��es das op��es.
			 */
			System.out.println("Bem Vindo Ao Menu");
			System.out.println("Digite a op��o desejada");
			System.out.println("1 - Adicionar Funcionario");
			System.out.println("2 - Listar Funcionario");
			System.out.println("9 - Sair do Sistema");

			/**
			 * leitor para receber a op��o do menu
			 */
			menu = Reader.readInt();

			/**
			 * op��es dos menus por meio de switch e case
			 */
			switch (menu) {

			/**
			 * Op��o para adicionar um novo funcionario, incrementando uma posi��o ao final
			 * do processo com mensagens amigaveis.
			 * 
			 */
			case 1:

				if (contador < TAMANHO_LISTA_FUNCIONARIOS) {
					/**
					 * pergunta para o usuario inserir a matricula do funcionario a ser cadastrado
					 */
					System.out.println("Insira a Matricula do funcionario e aperte enter!");
					/**
					 * leitura do que for inserido na console para armazenar a matricula do usuario
					 */
					int matricula = MyReader.readInt();

					/**
					 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
					 */
					System.out.println("Insira a Nome do funcionario e aperte enter!");
					/**
					 * leitura do que for inserido na console para armazenar o nome do funcionario
					 */
					String nome = MyReader.readString();

					/**
					 * pergunta para o usuario inserir o nome do funcionario a ser cadastrado
					 */
					System.out.println("Insira a Data de Nascimento do funcionario e aperte enter!");
					/**
					 * leitura do que for inserido na console para armazenar a data de nascimento do funcionario
					 */
					Date dataNascimento = MyReader.readDate();

					

					/**
					 * Inicializa��o do objeto funcionario com matricula e nome
					 */
					Funcionario funcionarioNovo = new Funcionario(nome, dataNascimento, matricula);

					/**
					 * leitura do que for inserido na console para armazenar o nome do usuario
					 */
					System.out.println("Cadastro do funcionario concluido com sucesso!");
					/**
					 * lista de funcionarios recebendo o funcionario novo e o contador incrementando
					 * 1 posi��o para n�o sobrescrever
					 */
					listaFuncionarios[contador++] = funcionarioNovo;
				} else {
					System.out.println("Lista de Funcionarios est� cheia!");
				}
				break;

			/**
			 * Op��o de listar os funcionarios existentes
			 */

			case 2: {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Lista Funcionarios: ");
				System.out.println("--------------------------------");
				System.out.println("Data de Nascimento - Nome ");

				//for (int j = 0; j < listaFuncionarios.length; j++) {
			    //System.out.println(listaFuncionarios[j].getNome() + " - " + listaFuncionarios[j].getMatricula()
				//			+ " -  " + sdf.format(listaFuncionarios[j].getDataNascimento()));
				//}

				/**
				 * Para casos onde tenha posi��es vazias dentro da lista
				 * 
				 */
				  
				 for (int j = 0; j < listaFuncionarios.length; j++) {
				  
				 if(listaFuncionarios[j] != null){
				 System.out.println(listaFuncionarios[j].getNome() + " - " +listaFuncionarios[j].getMatricula() + " -  " +
				 sdf.format(listaFuncionarios[j].getDataNascimento())); } }
				 
			}

			case 9:
				System.out.println("--------------------------------");

				System.out.println("Obrigado por utilizar o Sistema!");
				break;
			/**
			 * Op��o para caso alguma outra tecla seja in incorreta seja inserida, mensagem
			 * amigavel ao usuario explicando
			 */
			default:
				System.out.println("Op��o invalida, digite novamente.");
				break;
			}
			/**
			 * final do looping informando quando o memso ir� ser finalizado
			 */
		} while (menu < 9);

		/**
		 * Mensagens finais do sistema para informar o fim da execu��o
		 */
		System.out.println("Volte Sempre!");
		System.out.println("Fim");

	}
}
