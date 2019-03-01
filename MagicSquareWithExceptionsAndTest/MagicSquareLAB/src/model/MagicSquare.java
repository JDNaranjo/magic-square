package model;

public class MagicSquare {
	
	private int square;
	private String start;
	private String order;
	
	public MagicSquare(int mSquare, String startN, String orderN) {
		
		mSquare = square;
		startN = start;
		orderN = order;
		
	}
	
	public boolean validate(int size) {
		
		boolean valid=false;
		
		if(size % 2 == 0) {
			valid = true;
		}
		
		return valid;
	}
	
	public int[][] createTopNE(int size) {
		
		int[][] matrix = new int[size][size];
		int cont = 1;
		int f=0;
		int c= (size/2);
		
		matrix[f][c]=1;
		
		while(cont<=(size*size)) {
			
			f--;
			c++;
			
			if(f<0 && c>matrix[0].length) {
				f=f+2;
				c--;
			}else if(f<0) {
				f=(matrix.length)-1;
				if(matrix[f][c]!=0) {
					f=2;
				}
			}else if((c>(matrix[0].length-1))) {
				c=0;
				if(matrix[f][c]!=0) {
					c=(matrix[0].length)-1;
				}
			}
			
			cont++;
			matrix[f][c] = cont;
			
		}
		
		return matrix;
		
	}
	
public int[][] createTopNO(int size) {
		
		int[][] matrix = new int[size][size];
		int cont = 1;
		int f=0;
		int c= (size/2);
		
		matrix[f][c]=1;
		
		while(cont<=(size*size)) {
			
			f--;
			c--;
			
			if(f<0 && c<0) {
				f=f+2;
				c++;
			}else if(f<0) {
				f=(matrix.length)-1;
				if(matrix[f][c]!=0) {
					f=1;
				}
			}else if(c<0) {
				c=(matrix[0].length)-1;;
				if(matrix[f][c]!=0) {
					c=(matrix[0].length)-1;
				}
			}
			
			cont++;
			matrix[f][c] = cont;
			
		}
		
		return matrix;
		
	}
	
public int[][] createRightNE(int size) {
	
	int[][] matrix = new int[size][size];
	int cont = 1;
	int f=(size/2);
	int c= (matrix[0].length)-1;
	
	matrix[f][c]=1;
	
	while(cont<=(size*size)) {
		
		f--;
		c++;
		
		if(f<0 && c<0) {
			f--;
			c=c-2;
		}else if(f<0) {
			f=(matrix.length)-1;
			if(matrix[f][c]!=0) {
				c=c-2;
				f--;
			}
		}else if(c>(matrix.length)-1) {
			c=0;
			if(matrix[f][c]!=0) {
				c=c-2;
				f--;
			}
		}
		
		cont++;
		matrix[f][c] = cont;
		
	}
	
	return matrix;
	
}
	//HACER
public int[][] createRightSE(int size) {
	
	int[][] matrix = new int[size][size];
	int cont = 1;
	int f=(size/2);
	int c= (matrix[0].length)-1;
	
	matrix[f][c]=1;
	
	while(cont<=(size*size)) {
		
		f--;
		c++;
		
		if(f<0 && c<0) {
			f--;
			c=c-2;
		}else if(f<0) {
			f=(matrix.length)-1;
			if(matrix[f][c]!=0) {
				c=c-2;
				f--;
			}
		}else if(c>(matrix.length)-1) {
			c=0;
			if(matrix[f][c]!=0) {
				c=c-2;
				f--;
			}
		}
		
		cont++;
		matrix[f][c] = cont;
		
	}
	
	return matrix;
	
}
	
}
