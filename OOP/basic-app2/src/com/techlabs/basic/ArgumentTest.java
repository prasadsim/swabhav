package com.techlabs.basic;

public class ArgumentTest {
	public static void main(String names[]) {
//		System.out.println(names.length);
//		System.out.println();
//		for (String f_name : names) {
//			f_name = f_name.concat(" AurionPro");
//			System.out.println(f_name);
//
//		}
//		System.out.println(names[0]);
//		System.out.println();
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].concat(" AurionPro");
			System.out.println("Hash code of NameArrayElements:"+names[i].hashCode());
		}
		
		System.out.println("\nHash code of NameArray:"+names.hashCode());

		System.out.println();
//		System.out.println(names[0]+"\n");
		
		String copy[] = new String[10];
		for(int i=0;i<names.length;i++) {
			copy[i]=names[i];
			System.out.println("Hash code of CopyArrayElements:"+copy[i].hashCode());
		}
		System.out.println("\nHash code of CopyArray:"+copy.hashCode());
		
		copy[3]="Swabhav Techlabs";
		System.out.println("\n"+names[3]);
		System.out.println(names[3].hashCode());

	}
}
