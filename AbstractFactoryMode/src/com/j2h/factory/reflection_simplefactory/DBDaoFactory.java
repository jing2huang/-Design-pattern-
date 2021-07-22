package com.j2h.factory.reflection_simplefactory;

import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;

//ʹ�÷��䣺db��packageName��ͨ�������ļ�����ʽ����
//���֮ǰ�Ĺ�����
public class DBDaoFactory {

	private static String packageName = "com.j2h.factory.dao";
	private static String db = "Mysql";
	
	public static IUserDao createUserDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = packageName + "." + db + "UserDao";
		return  (IUserDao) Class.forName(className).newInstance();
	}

	public static IDepartDao createDepartDao() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = packageName + "." + db + "DepartDao";
		return (IDepartDao) Class.forName(className).newInstance();
	}
}