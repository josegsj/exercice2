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
	@Column(name="vote",nullable=true,updatable=true)
	private boolean vote;
	@Column(name="associate_id",nullable=true,length=20,updatable=true)
	private int associateId;
	@Column(name="ruling_id",nullable=true,updatable=true)
	private int rulingId;
	
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
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getRulingId() {
		return rulingId;
	}
	public void setRulingId(int rulingId) {
		this.rulingId = rulingId;
	}
	
	
	

}
