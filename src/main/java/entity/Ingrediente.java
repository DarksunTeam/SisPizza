package entity;

import java.io.Serializable;
import java.util.List;

public class Ingrediente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idIngrediente;
	private String nome;
	
	private List<Sabor> sabores;
	
	public Ingrediente() {
		
	}

	public Ingrediente(Integer idIngrediente, String nome) {
		super();
		this.idIngrediente = idIngrediente;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Ingrediente [idIngrediente=" + idIngrediente + ", nome=" + nome
				+ "]";
	}

	public Integer getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(Integer idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Sabor> getSabores() {
		return sabores;
	}

	public void setSabores(List<Sabor> sabores) {
		this.sabores = sabores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
