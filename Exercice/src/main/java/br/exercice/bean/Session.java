package br.exercice.bean;


import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Session {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date; 
	@OneToOne(cascade=CascadeType.ALL)
	private Ruling ruling;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public Ruling getRuling() {
		return ruling;
	}
	public void setRuling(Ruling ruling) {
		this.ruling = ruling;
	}
	
	
	
	
	

}
