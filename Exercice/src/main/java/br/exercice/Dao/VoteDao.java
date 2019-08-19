package br.exercice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.exercice.bean.Vote;

public interface VoteDao extends JpaRepository<Vote, Long> {}  


