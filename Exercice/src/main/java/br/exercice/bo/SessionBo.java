package br.exercice.bo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.exercice.Dao.RulingDaoRepository;
import br.exercice.Dao.SessionDao;
import br.exercice.bean.Ruling;
import br.exercice.bean.Session;

public class SessionBo {
	
	private String nameRuling;
	private Date time;
	private  RulingDaoRepository rulingDao;
	private SessionDao sessionDao;
	
	
	public SessionBo(String nameRuling, Date time) {
		super();
		this.nameRuling = nameRuling;
		this.time = time;
	}
	
	public SessionBo(String nameRuling) {
		
	}
	
	public boolean createSession(){
		if(nameRuling!=null) {
			Ruling ruling=rulingDao.getOne(nameRuling);			
			if(ruling!=null) {
				Session session= new Session();
				session.setDate(prepapareDate(time));
				session.setRuling(ruling);
				sessionDao.save(session);
				return true;
			}
		}
		return false;
	}
	
	private Calendar prepapareDate(Date date) {
		Calendar cal = Calendar.getInstance();
		if(date!=null) {
		  cal.setTime(date);
		}else {
			cal.set(Calendar.MINUTE,1);
		}
		  return cal;
	}
	
	public Session searchByTime() {
		Session s=sessionDao.getOne(nameRuling);
		if(s.getDate().before(dateNow())) {
			return s;
		}else 
			return null;
	}
	
	private Calendar dateNow() {
		Calendar cal = new GregorianCalendar();
		return cal;
	}
	
	
	
	
	
	
	

}
