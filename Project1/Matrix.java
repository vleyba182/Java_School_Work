import java.io.*;

class Matrix {
	private int[][] storage;

	public Matrix(int rows, int cols) {
		// This constructor will initialize storage to be
		// able to hold the matrix of the specified rows
		// and colums
		storage = new int[rows][cols];
	}

	//Method below determines if the matrix is full or sparse
	public Matrix(BufferedReader in, boolean fullOrSparse) {
		if( fullOrSparse ){
			readFull(in);
		}
		else{
			readSparse(in);
		}
	}

	public void set(int i, int j, int value) {
		// Should store value at index i,j
		storage[i][j] = value;
	}

	public int get(int i, int j) {
		// Should return the value at i,j
		return storage[i][j];
	}

	public int readFull(BufferedReader in) {
		// Reads from in a full matrix
		try{
			//read in the first line
			String header = in.readLine();
			//split the header into 2 values (rows and columns) 
			String[] splits = header.split(" ");
			
			storage = new int[Integer.parseInt(splits[0])][Integer.parseInt(splits[1])];
			
			String line = null;
			
			for( int i = 0 ; i < storage.length ; i++ ){
				//read in the next line
				line = in.readLine();
				
				//split it
				String[] elements = line.split(" ");
				
				//store all elements into the matrix
				for( int j = 0 ; j < storage[0].length ; j++ ){
					storage[i][j] = Integer.parseInt(elements[j]);
				}
			}			
			//close the reader
			in.close();
		//handle exception
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	public int readSparse(BufferedReader in) {
		// Reads from in a sparse matrix
		try{
			//read in the first line
			String header = in.readLine();
			//split the header into 2 values (rows and columns) 
			String[] splits = header.split(" ");
			
			storage = new int[Integer.parseInt(splits[0])][Integer.parseInt(splits[1])];
			
			//read in first line
			String line = in.readLine();
			
			//while not file end or empty line, keep reading and parsing
			while( line != null && line.trim().length() > 0 ){
				//split the line
				String[] values = line.split(" ");
				
				//set the value at that location
				this.set(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
			
				//read int the next line
				line = in.readLine();
			}			
			//close the reader
			in.close();
		//handle exception
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return 0;
	}

	public int writeFull(BufferedWriter out) {
		// write to out that matrix that is this
		// in full format
		PrintWriter outForReal = new PrintWriter(out);

		//write the matrix header
		outForReal.write(storage.length + " " + storage[0].length + "\n");
				
		for( int i = 0 ; i < storage.length ; i++ ){
			//write each element on the line
			for( int j = 0 ; j < storage[0].length ; j++ ){
				outForReal.write( storage[i][j] + " ");
			}
			//pass to the next line
			outForReal.write("\n");
		}			
		//close the writer
		outForReal.close();
		return 0;
	}

	public int writeSparse(BufferedWriter out) {
		// write to out that matrix that is this
		// in sparse format
		PrintWriter outForReal = new PrintWriter(out);
		
		//write the matrix header
		outForReal.write(storage.length + " " + storage[0].length + "\n");
				
		for( int i = 0 ; i < storage.length ; i++ ){
			//write each element on the line
			for( int j = 0 ; j < storage[0].length ; j++ ){
				//if not 0 found, write it
				if(storage[i][j] != 0){
					outForReal.write( i + " " + j + " " + storage[i][j] +"\n");
				}
			}
		}			
		
		//close the writer
		outForReal.close();
		
		return 0;
	}

	public Matrix add(Matrix rightHand) {
		// Consider A + B, A is the left operand B is the right
		// operand. This method will use the object this as the
		// left operand and the object rightHand as the right
		// operand and will return the result of adding them together
		
		//if not same dimension, return null
		if( storage.length != rightHand.getRowCount() || storage[0].length != rightHand.getColumnCount() ){
			System.out.println("---Could not add them up!!! Invalid dimensions...");
			return null;
		}
		
		//create the result matrix
		Matrix result = new Matrix(storage.length, storage[0].length);
		
		//sum them up element by element
		for( int i = 0 ; i < storage.length ; i++ ){
			for( int j = 0 ; j < storage[0].length ; j++ ){
				result.set(i, j, storage[i][j] + rightHand.get(i, j));
			}
		}
		
		//print it
		result.printMatrix();
		
		return result;
	}

	public Matrix multiply(Matrix rightHand) {
		// Consider A * B, A is the left operand B is the right
		// operand. This method will use the object this as the
		// left operand and the object rightHand as the right
		// operand and will return the result of
		
		//if not same dimension, return null
		if( storage.length != rightHand.getColumnCount() || storage[0].length != rightHand.getRowCount() ){
			System.out.println("---Could not multiply them!!! Invalid dimensions...");
			return null;
		}
		
		//create the result matrix
		Matrix result = new Matrix(storage.length, rightHand.getColumnCount());
		
		for (int i = 0; i < storage.length; i++)
            for (int j = 0; j < storage[0].length; j++)
                for (int k = 0; k < storage.length; k++)                    
                	result.set(i, k, result.get(i, k) + storage[i][j] * rightHand.get(j, k));

		
		// print it
		result.printMatrix();
		
		return result;
	}
	
	//getter methods
	public int getRowCount(){
		return storage.length;
	}
	
	public int getColumnCount(){
		return storage[0].length;
	}

	//this will print matrix to the screen
	public void printMatrix(){
		for( int i = 0 ; i < storage.length ; i++ ){
			//write each element on the line
			for( int j = 0 ; j < storage[0].length ; j++ ){
				System.out.print( storage[i][j] + " ");
			}
			//go to the next line
			System.out.println();
		}			
	}
}
