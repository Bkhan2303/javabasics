package com.class11;

public class CarsArrays {

	public static void main(String[] args) {
		String[][] cars = { {"Chevy", "Ford","Chrysler","Dodge","GMC"},
							{"Audi","Porsche","Mercedes","VW","BMW"},
							{"Kia","Hyundai","Daihatzu"},
							{"Ferrari","Lamborghini","Fiat","Alfa Romeo","Maserati","Bizzarini","Lancia"}
		};
		for (int i=0; i<cars.length;i++) {
			for(int j=0; j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}

	}

}
