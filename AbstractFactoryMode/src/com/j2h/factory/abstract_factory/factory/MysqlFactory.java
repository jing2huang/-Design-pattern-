package com.j2h.factory.abstract_factory.factory;

import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;
import com.j2h.factory.dao.MysqlDepartDao;
import com.j2h.factory.dao.MysqlUserDao;

public class MysqlFactory implements DBFactory {

	@Override
	public IUserDao createUserDao() {
		return new MysqlUserDao();
	}

	@Override
	public IDepartDao createDepartDao() {
		return new MysqlDepartDao();
	}

}
