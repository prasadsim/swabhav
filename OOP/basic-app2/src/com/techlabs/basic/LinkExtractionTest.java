package com.techlabs.basic;

class LinkExtractionTest{
	public static void main(String args[]){
		String str = "https://www.swabhavtechlabs.com?developer=prasad$role=java";
		String[] value = str.split("[@&?$+-]+",3);
//		System.out.println("Website = "+value[0]);
//		System.out.println(""+value[1]);
//		System.out.println("" + value[2]);

		for(String a : value) {
			System.out.println(a);
		}
		}
		
		
	}
//}
