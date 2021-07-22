package com.j2h.factory.abstract_factory.factory;

import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;
import com.j2h.factory.dao.OracleDepartDao;
import com.j2h.factory.dao.OracleUserDao;

public class OracleFactory implements DBFactory {

	@Override
	public IDepartDao createDepartDao() {
		return new OracleDepartDao();
	}
	
	@Override
	public IUserDao createUserDao() {
		return new OracleUserDao();
	}
}
