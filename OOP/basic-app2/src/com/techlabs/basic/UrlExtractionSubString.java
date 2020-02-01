package com.techlabs.basic;

public class UrlExtractionSubString {
	public static void main(String[] args) {
		String str = "https://www.swabhavtechlabs.com?developer=prasad@role=java";
//		String str = "https://www.swabhavtechlabs.com?developer=prasad";
//		String str = "https://www.swabhavtechlabs.com?role=java";
//		String str = "https://www.swabhavtechlabs.com?role=java@developer=prasad";
//		String str = "";
		
		
		int start=str.indexOf("www.");
		int end=str.indexOf(".com");
		System.out.println("Name of Company:"+ str.substring(start+4,end));
		
		start=str.indexOf("developer");
		end=str.indexOf("@role");
		if(start!=-1) {
			if(end!=-1) {
				System.out.println("Developer:"+str.substring(start+10,end));
			}
			else {
				System.out.println("Developer:"+str.substring(start+10));
			}			
		}
		
		start=str.lastIndexOf("role");
		end=str.indexOf("@developer");
		if(start!=-1) {
			if(end!=-1) {
				System.out.println("role:"+str.substring(start+5,end));
			}
			else {
				System.out.println("role:"+str.substring(start+5));
			}
		}
	}
}
