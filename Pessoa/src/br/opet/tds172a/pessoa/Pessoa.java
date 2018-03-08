package br.opet.tds172a.pessoa;

/**
 * @author Heraldo 
 * @since 19/02/2018
 * @version 1.0.1
 *         Esta classe representa uma pessoa, e poder� ser utilizada por
 *         qualquer sistema que necessite criar objetos de pessoas
 */
public class Pessoa {

	/**
	 * Atributo que representa o nome de uma pessoa. valor inicial"".
	 * 	 
	 */
	public String nome = "";
	
	/**
	 * Atributo que representa a data de nascimento de uma pessoa. valor inicial"".
	 * 	 
	 */
	public String dataNascimento = "";
	
	/**
	 * Construtor Pessoa da classe pessoa
	 */
	public Pessoa() 
	{
		System.out.println("Construtor Pessoa()");
	}

	/**
	 * Retorna o nome da pessoa
	 * @return - String nome
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Atribui o valor de um nome para a pessoa 
	 * @param String novoNome
	 * @return - nome recebendo novoNome
	 */
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	/**
	 * retorna o valor de uma data de nascimento a uma pessoa
	 * @return - dataNascimento
	 */
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	/**
	 * Atribui um valor a data de nascimento  de uma pessoa
	 * @param - novaDataNascimento
	 * @return - dataNascimento � retornada
	 */
	public String setDataNascimento(String dataNascimento) {
		return this.dataNascimento = dataNascimento;
	}
	
	/**
	 * M�todo para informar um novo nome e uma nova data de nascimento 
	 * @param - nome recebe novoNome
	 * @param - datanscimento recebe novaDataNascimento
	 */
	public void informarPessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
}