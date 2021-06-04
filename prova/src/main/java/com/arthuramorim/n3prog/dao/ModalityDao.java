package com.arthuramorim.n3prog.dao;

import java.util.List;

import javax.persistence.Query;

import com.arthuramorim.n3prog.entity.Modality;

public class ModalityDao extends Dao {

	public Modality queryForId(Long id) {
		return getEM().find(Modality.class, id);
	}

	public void save(Modality modality) {
		getEM().merge(modality);

	}

	@SuppressWarnings("unchecked")
	public List<Modality> listModalitys() {
		Query query = getEM().createQuery("From Modality", Modality.class);//
		return query.getResultList();
	}

	public void delete(Long idModality) {
		Modality modality = getEM().getReference(Modality.class, idModality);
		getEM().remove(modality);

	}

}
