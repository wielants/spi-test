package com.example.service;

public class ProviderTest {
	public static void main(String[] args) {
		SpecialService srv = SpecialServiceFactory.getSpecialService();
		System.out.println(srv.getSomethingSpecial());
	}
}
