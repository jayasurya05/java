package com.login;

public class LoopingStatements {
private void count(int a,int b) {
for (int i = a; i < b; i++) {
	
	System.exit(6);
	
	System.out.println(i);
}
}
	public static void main(String[] args) {
		LoopingStatements a=new LoopingStatements();
		a.count(2, 7);
	}
}
