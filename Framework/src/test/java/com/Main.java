package com;

public class Main {
	 public static void main(String[] args) {
		
		 ExcellReader rd = new ExcellReader("C:\\Users\\chintan\\Desktop\\Login.xlsx","Reg");
		 int rows =   rd.getRowCount();
		 System.out.println("Total row : "+rows);
		 int cols = rd.getColCount();
		 System.out.println("Total col : "+cols);
		 
		 for(int i=1;i<rows;i++)
		 {
			 for(int j=0;j<cols;j++)
			 {
				 String data = rd.getData(i, j);
				 System.out.print(data+" ");
			 }
			 System.out.println();
			
		 }
		 
	}
}
