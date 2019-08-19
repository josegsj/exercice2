package br.exercice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.exercice.bean.Session;



public interface SessionDao extends JpaRepository<Session, Long> {} 