package com.j2h.factory.dao;

public class OracleUserDao implements IUserDao {

	@Override
	public void accessUser(String db) {
		System.out.println("����" + db + "��user");
	}

}