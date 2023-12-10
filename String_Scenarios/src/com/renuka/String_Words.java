package com.renuka;

public class String_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We are reversing words";
		String strArray[]=str.split(" ");
		for(int i=strArray.length-1;i>=0;i--) {
			//System.out.println(strArray[i]);
			System.out.print(strArray[i]);
		}
	}

}
