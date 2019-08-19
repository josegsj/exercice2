package br.exercice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.exercice.bean.Ruling;

@Repository
public interface RulingDaoRepository extends JpaRepository<Ruling, Long> {}  


