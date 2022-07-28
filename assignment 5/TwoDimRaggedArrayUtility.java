/*
 * Class: CMSC203 
 * Instructor:farnaz eivazi
 * Description:Assignment 5 holidaybonus calc
 * Due: 7/28/2022
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: bruce wyatt
*/
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class TwoDimRaggedArrayUtility extends java.lang.Object{
	//Constructor
	public TwoDimRaggedArrayUtility() {}
	//need to change 
	public static double[][] readFile(java.io.File file) throws java.io.FileNotFoundException{
		if (file.length()==0){
			return null;
		}

		String[][] temp = new String[10][10]; 
		int row = 0;
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) { 
		String[] currentLine = scan.nextLine().split(" "); 
		if (currentLine.length>0) {
		for (int i = 0; i < currentLine.length; i++) { 
					temp[row][i] = currentLine[i];
				}
		}
				row++; 

			}
		String [][]temp1 = new String[10][10];
		double[][] fillarray = new double[row][]; 
		int i = 0;
		do {
		for ( i = 0; i < fillarray.length; i++) {
			int column = 0;
	
			for (int k = 0; k < temp1[i].length; k++) { 
				if (temp[i][k] == null) { 
					break;
				}
				column++;
			}
		
			fillarray[i] = new double[column]; 
		}
		}while(temp1.equals(temp));
		if(fillarray.length>0) {
		for ( i = 0; i < fillarray.length; i++) {
			for (int j = 0; j < fillarray[i].length; j++) {
				
				fillarray[i][j] = Double.parseDouble(temp[i][j]);
			}
		}
		}

		return fillarray;
		  }

	public static void writeToFile(double[][] data,
            java.io.File outputFile)
     throws java.io.FileNotFoundException {
		 PrintWriter outputfile1 = new PrintWriter(outputFile);
		   String s ="";
		    for (int i = 0;i < data.length;i++) {
		      for (int j = 0;j < data[i].length;j++) {
		        s= s+(data[i][j]+ " ");
		      }
		      s= s+("\n");
		    }
		    outputfile1.print(s.toString());
		    outputfile1.close();
		  }
	public static double getTotal(double[][] data) {
		double sup = 0;
		for( int i = 0; i< data.length;i++) {
			for(int k = 0;k<data[i].length;k++) {
				sup+=data[i][k];
			}
		
		}
		return sup;
	}
	public static double getAverage(double[][] data) {
		int count=0;
		double sup = 0.0;
		for( int i = 0; i< data.length;i++) {
			for(int k = 0;k<data[i].length;k++) {
				sup+=data[i][k];
				count++;
			}
		
		}
		sup = sup/count;
		return sup;
	}
	public static double getRowTotal(double[][] data,int row) {
	
		double sum = 0;
		for (int i = 0; i< data[row].length ; i++) {
	
			sum += data[row][i];
		}
		return sum;
	}
	public static double getColumnTotal(double[][] data,int col) {
	double sum=0;
	for (int i=0; i<data.length; i++){
		if (col<data[i].length) {
			
				   sum += data[i][col];
			
		
		}
		
	}
	return sum;
	}
	public static double getHighestInRow(double[][] data,
            int row) {
		double heighest = 0;
		for(int i = 0; i < data[row].length; i++) {
			if(heighest < data[row][i]) {
			heighest = data[row][i];	
			}
		}
		return heighest;
	}
	public static int getHighestInRowIndex(double[][] data,
            int row) {
		double highest=0;
		int index = 0;
		for (int i = 0; i< data[row].length ; i++) {
		if(highest<data[row][i]) {
			highest=data[row][i];
			 index = i;
		}
		}
		return index;
		
	}
	public static double getLowestInRow(double[][] data,
            int row) {
		double highest=100000;
		for (int i = 0; i< data[row].length ; i++) {
		if(highest>data[row][i]) {
			highest=data[row][i];
		}
		}
		return highest;
	}
	public static int getLowestInRowIndex(double[][] data,
            int row) {
		double highest=100000;
		int index = 0;
		for (int i = 0; i< data[row].length ; i++) {
		if(highest>data[row][i]) {
			highest=data[row][i];
			index = i;
		}
		}
		return index;
	}
	public static double getHighestInColumn(double[][] data,
            int col) {         
		double max=-10000;
	
		for (int i=0; i<data.length; i++){
			if (col<data[i].length) {
				   if ( data[i][col]>max){
					   max = data[i][col];
					
				   }
			}
		}
		return(max);

                                                   	
	}
	public static int getHighestInColumnIndex(double[][] data,
            int col) {
		double max=-10000;
		int k=0;
		for (int i=0; i<data.length; i++){
			if (col<data[i].length) {
				   if ( data[i][col]>max){
					   max = data[i][col];
					   k = i;
				   }
			}
		}
		return(k);
	}
	public static double getLowestInColumn(double[][] data,
            int col) {
		double max=10000;
		
		for (int i=0; i<data.length; i++){
			if (col<data[i].length) {
				   if ( data[i][col]<max){
					   max = data[i][col];
				   }
			}
		}
		return(max);
	}
	public static int getLowestInColumnIndex(double[][] data,
            int col) {
	double max=10000;
	int k=0;
		for (int i=0; i<data.length; i++){
			if (col<data[i].length) {
				   if ( data[i][col]<max){
					   max = data[i][col];
					   k=i;
				   }
			}
		}
		return(k);
	}
	public static double getHighestInArray(double[][] data) {
		
		double max = -10000;
		for( int i = 0; i< data.length;i++) {
			for(int k = 0;k<data[i].length;k++) {
				if(max<data[i][k]) {
				max=data[i][k];}
			}
		
		}
		return max;
	}
	public static double getLowestInArray(double[][] data) {
		double max = 10000;
		for( int i = 0; i< data.length;i++) {
			for(int k = 0;k<data[i].length;k++) {
				if(max>data[i][k]) {
				max=data[i][k];}
			}
	}
		return max;
	}
}
	

