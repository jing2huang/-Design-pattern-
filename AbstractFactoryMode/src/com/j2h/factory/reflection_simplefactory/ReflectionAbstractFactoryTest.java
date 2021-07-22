package com.j2h.factory.reflection_simplefactory;

import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;

public class ReflectionAbstractFactoryTest {

	public static void main(String[] args) {
		try {
			//�ͻ��˲�֪��������ʵ����ĸ����ݿ� ����
			IUserDao userDao = DBDaoFactory.createUserDao();
			userDao.accessUser("MYSQL");
			IDepartDao departDao = DBDaoFactory.createDepartDao();
			departDao.accessDepart("MYSQL");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}