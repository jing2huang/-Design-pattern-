package com.j2h.factory.reflection_simplefactory;

import com.j2h.factory.dao.IDepartDao;
import com.j2h.factory.dao.IUserDao;

//使用反射：db和packageName可通过配置文件的形式引入
//替代之前的工厂类
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