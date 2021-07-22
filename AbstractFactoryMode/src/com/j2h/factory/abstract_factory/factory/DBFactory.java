package com.j2h.factory.abstract_factory.factory;

import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;

//¹¤³§
public interface DBFactory {
	
	public IUserDao createUserDao();
	
	public IDepartDao createDepartDao();

}