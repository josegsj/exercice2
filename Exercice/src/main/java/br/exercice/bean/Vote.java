package br.exercice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vote")
public class Vote {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="vote",nullable=true,length=100,updatable=true)
	private boolean vote;
	@Column(name="cpf",nullable=true,length=100,updatable=true)
	private String cpf;
	@Column(name="session_id",nullable=true,length=100,updatable=true)
	private int sessionID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isVote() {
		return vote;
	}
	public void setVote(boolean vote) {
		this.vote = vote;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSessionID() {
		return sessionID;
	}
	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	} 
	
	

}
