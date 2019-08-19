package br.exercice.bo;

import br.exercice.Dao.AssocieteDao;
import br.exercice.bean.Associate;

public class AssocieteBo {
	
	private String  cpf;
	private AssocieteDao associeteDao;

	public AssocieteBo(String cpf) {
		super();
		this.cpf = cpf;
	}
	
	
	public  Associate validateCpf() {
		if(cpf!=null) {
			Associate associate= associeteDao.getOne(cpf);
			if(associate==null) {
				associate=new Associate();
				associate.setCpf(cpf);
				associeteDao.save(associate);
			}
			return associeteDao.getOne(cpf);
		}
		return null;
	}

}
