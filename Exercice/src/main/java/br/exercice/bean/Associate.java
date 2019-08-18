package br.exercice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Associate")
public class Associate {
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="ruling_id",nullable=true,updatable=true)
	private String cpf;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
