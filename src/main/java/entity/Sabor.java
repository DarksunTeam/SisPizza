package entity;

import java.io.Serializable;
import java.util.List;

public class Sabor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idSabor;
	private String nome;
	private Double preco;
	
	private List<Ingrediente> ingredientes;
	
	public Sabor() {
		
	}

	public Sabor(Integer idSabor, String nome, Double preco) {
		super();
		this.idSabor = idSabor;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Sabor [idSabor=" + idSabor + ", nome=" + nome + ", preco="
				+ preco + "]";
	}

	public Integer getIdSabor() {
		return idSabor;
	}

	public void setIdSabor(Integer idSabor) {
		this.idSabor = idSabor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}