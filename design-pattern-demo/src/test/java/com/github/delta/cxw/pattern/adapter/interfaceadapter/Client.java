package com.github.delta.cxw.pattern.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("dsfds");
			}
		};
		
		absAdapter.m1();
	}
}
