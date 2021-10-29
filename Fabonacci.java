package com.abs;

public class Fabonacci {
	public static void main(String[] args) {
		int j=0,k=1;
		System.out.print(j+","+k+",");
		for(int i=2;i<=30;i++) {
		int c=j+k;
		System.out.print(c+",");
		j=k;
		k=c;
		}



	
	}
	}