package com.arthuramorim.n3prog.dao;

import javax.persistence.EntityManager;

import com.arthuramorim.n3prog.database.JpaUtils;

public abstract class Dao {
	private EntityManager entityManager = null;

	public Dao() {
		super();
	}

	public Dao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	protected EntityManager getEM() {
		if (this.entityManager == null) {
			return JpaUtils.EntityManager();
		}
		return this.entityManager;

	}
}