package com.class11;

public class LargestNumber {

	public static void main(String[] args) {
		int[] numb= {12,23,134,12,123,155,4,5};
        int max=numb[0];
        for(int i=0;i<numb.length;i++) {
            if(numb[i]>max) {
                max=numb[i];
            }
        }
        System.out.println(max);

	}

}
