package com.j2h.factory.dao;

public class MysqlDepartDao implements IDepartDao {

	@Override
	public void accessDepart(String db) {
		System.out.println("·ÃÎÊ" + db + "µÄdepart");
	}

}
