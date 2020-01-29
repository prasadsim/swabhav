class Assignment1{
	public static void main(String args[]){
		String str = "https://www.swabhavtechlabs.com?developer=prasad&role=architect";
		String[] value = str.split("[@&?$+-]+");
		System.out.println("Website = "+value[0]);
		System.out.println(""+value[1]);
		System.out.println("" + value[2]);
	}
}
