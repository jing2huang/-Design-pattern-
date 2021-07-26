package com.j2h.static_proxy;

public class BuyPorxyTest {

	public static void main(String[] args) {
		BuyCarProxy buyProxy = new BuyCarProxy(new BuyCarImpl());
		buyProxy.buyCar();
	}
}