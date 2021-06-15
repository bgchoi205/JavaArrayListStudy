package com.cbg.test210615;

public class MainRunner {

	public static void main(String[] args) {
		ArrayList2 arraylist = new ArrayList2();
        for(int i=0; i<1000; i++){
            arraylist.addLast(i);
        }
        
        System.out.println(arraylist.get(999));

	}

}
