package br.exercice.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	@OneToOne(cascade=CascadeType.ALL)
	private Associate associate;
	@ManyToOne()
	private Session session;
	
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

	
	
	

}
