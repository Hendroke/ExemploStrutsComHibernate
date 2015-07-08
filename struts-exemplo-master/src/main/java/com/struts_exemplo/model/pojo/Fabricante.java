package com.struts_exemplo.model.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "fabricantes" )
public class Fabricante{

	@Id
	@GeneratedValue
	private int id;

	private String nome;
	
	private String sobrenome;

	@Temporal( TemporalType.DATE )
	@Column( name = "data_fundacao" )
	private Date dataFundacao;

	
	private String slogan;

	@Column(name="pais_sede")
	private String paisSede;

	/**
	 * Método responsável por retornar o valor do atributo id.
	 * 
	 * @return Long id - id a ser retornado(a).
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo id.
	 * 
	 * @param Long id - id a ser atribuido(a).
	 */
	public void setId( int id ) {
		this.id = id;
	}

	/**
	 * Método responsável por retornar o valor do atributo nome.
	 * 
	 * @return String nome - nome a ser retornado(a).
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo nome.
	 * 
	 * @param String nome - nome a ser atribuido(a).
	 */
	public void setNome( String nome ) {
		this.nome = nome;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo sobrenome.
	 * 
	 * @param String sobrenome - sobrenome a ser atribuido(a).
	 */
	public void setSobrenome( String sobrenome ) {
		this.sobrenome = sobrenome;
	}
	
	/**
	 * Método responsável por retornar o valor do atributo sobrenome.
	 * 
	 * @return String sobrenome - sobrenome a ser retornado(a).
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	 * Método responsável por retornar o valor do atributo dataFundacao.
	 * 
	 * @return Date dataFundacao - dataFundacao a ser retornado(a).
	 */
	public Date getDataFundacao() {
		return dataFundacao;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo dataFundacao.
	 * 
	 * @param Date dataFundacao - dataFundacao a ser atribuido(a).
	 */
	public void setDataFundacao( Date dataFundacao ) {
		this.dataFundacao = dataFundacao;
	}

	/**
	 * Método responsável por retornar o valor do atributo slogan.
	 * 
	 * @return String slogan - slogan a ser retornado(a).
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo slogan.
	 * 
	 * @param String slogan - slogan a ser atribuido(a).
	 */
	public void setSlogan( String slogan ) {
		this.slogan = slogan;
	}

	/**
	 * Método responsável por retornar o valor do atributo paisSede.
	 * 
	 * @return String paisSede - paisSede a ser retornado(a).
	 */
	public String getPaisSede() {
		return paisSede;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo paisSede.
	 * 
	 * @param String paisSede - paisSede a ser atribuido(a).
	 */
	public void setPaisSede( String paisSede ) {
		this.paisSede = paisSede;
	}

	/**
	 * Polimorfico
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fabricante [getNome()=" + getNome() + ", getDataFundacao()=" + getDataFundacao() + ", getSlogan()=" + getSlogan() + ", getPaisSede()=" + getPaisSede() + "]";
	}

}
