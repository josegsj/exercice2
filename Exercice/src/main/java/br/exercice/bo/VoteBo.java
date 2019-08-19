package br.exercice.bo;


import br.exercice.Dao.VoteDao;
import br.exercice.bean.Associate;
import br.exercice.bean.Session;
import br.exercice.bean.Vote;

public class VoteBo {
	
	private boolean vote;
	private String cpf;
	private String nameRuling;
	private VoteDao voteDao;
	
	
	
	
	public VoteBo(String nameRuling) {
		super();
		this.nameRuling = nameRuling;
	}

	public VoteBo(boolean vote, String cpf,String nameRuling) {
		super();
		this.vote = vote;
		this.cpf = cpf;
		this.nameRuling=nameRuling;
	}
	
	public boolean insertVote() {
		AssocieteBo associeteBo = new AssocieteBo(cpf) ;
		Associate associate=associeteBo.validateCpf();
		SessionBo sessionBo=new SessionBo(nameRuling);
		Session session = sessionBo.searchByTime();
		if(associate!=null && session!=null) {
			Vote votes= new Vote();
			votes.setAssociate(associate);
			votes.setSession(session);
			votes.setVote(vote);
			voteDao.save(votes);
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public long result() {
		SessionBo sessionBo=new SessionBo(nameRuling);
		Session session = sessionBo.searchByTime();
		Vote votes= new Vote();
		votes.setSession(session);
	return 	 voteDao.count(votes.getSession());
	}
	
	
	
	
	
	

}
