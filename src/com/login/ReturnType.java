package com.login;
public class ReturnType{
int a=10;
int b=20;
private int surya() {
return a;
}
private int jaya() {
	// TODO Auto-generated method stub
return b;
}
public static void main(String[] args) {
	ReturnType a=new ReturnType();
	int surya=a.surya();
	int jaya=a.jaya();
	System.out.println(surya-2);
	System.out.println(jaya/2);
}
}
