package com.j2h.factory.abstract_factory;

import com.j2h.factory.abstract_factory.factory.DBFactory;
import com.j2h.factory.abstract_factory.factory.MysqlFactory;
import com.j2h.factory.abstract_factory.factory.OracleFactory;
import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;

public class AbstarctFactoryTest {

	public static void main(String[] args) {
		DBFactory mFactory = new MysqlFactory();
		IUserDao mUserDao = mFactory.createUserDao();
		mUserDao.accessUser("MYSQL");
		IDepartDao mDepartDao = mFactory.createDepartDao();
		mDepartDao.accessDepart("MYSQL");
		
		DBFactory oFactory = new OracleFactory();
		IUserDao oUserDao = oFactory.createUserDao();
		oUserDao.accessUser("ORACLE");
		IDepartDao oDepartDao = oFactory.createDepartDao();
		oDepartDao.accessDepart("ORACLE");
	}

}