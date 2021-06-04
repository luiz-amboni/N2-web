package com.arthuramorim.n3prog.resources;

import java.util.List;

import com.arthuramorim.n3prog.dao.Dao;
import com.arthuramorim.n3prog.dao.ModalityDao;
import com.arthuramorim.n3prog.entity.Modality;

public class ModalityRn extends Dao {

	private ModalityDao dao;

	public ModalityRn() {
		dao = new ModalityDao();
	}


	public void salvar(Modality modality) {
		dao.save(modality);
	}

	public List<Modality> listModalitys() {
		return dao.listModalitys();
	}

	public void delete(Long idModality) {
		dao.delete(idModality);

	}

	public Modality queryId(Long updateId) {
		return dao.queryForId(updateId);
	}

}
