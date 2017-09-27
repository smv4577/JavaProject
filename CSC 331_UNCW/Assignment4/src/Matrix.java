import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Sydney Vernatter
 * Matrix class to allow matrices to be transposed, added, and multiplied
 *
 */
public class Matrix {
	private int numRows;
	private int numCols;
	double[][] data;

	/**
	 * 
	 * @param data: Data is a two dimensional array made out of doubles
	 */
	public Matrix(double[][] data) {
		// TODO Auto-generated constructor stub
		this.data  = data;
		numRows = data.length;
		numCols = data[0].length;
	}

	/**
	 * 
	 * @param file: Takes a file that contains a matrix
	 */
	public Matrix(String file) {
		Scanner s = null;
		try {
			s = new Scanner (new File(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		numRows = 0;
		numCols = 0;
		
		while (s.hasNextLine())
		{
			numRows++;
			String line = s.nextLine();
			String[] columns = line.split(" ");
			numCols = columns.length;
		}
		
		double[][] data = new double[numRows][numCols];
		s.close();

		try {
			s = new Scanner(new File(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i=0; i < numRows; i++) {	// iterates through rows
			for (int j=0; j < numCols; j++) {	// iterates through columns
				if (s.hasNextDouble()) {
					data[i][j] = s.nextDouble();
				}
			}
		}
		this.data = data;
	}

	/**
	 * 
	 * @param matrix: looks at a matrix to compare to other matrix
	 * @return true if equal, false if not equal.
	 */
	public boolean equals(Matrix matrix) {
		if (this.getNumRows() != matrix.getNumRows()) {
			return false;
		}
		for (int i=0; i < numRows; i++) {
			if (this.getNumCols() != matrix.getNumCols()) {
				return false;
			}
			for (int j=0; j < numCols; j++) {
				double m1 = this.data[i][j];
				double m2 = matrix.data[i][j];
				if (m1 != m2) {
					return false;
				}
			}
		}	
		return true;
	}

	/**
	 * 
	 * @return numRows - number of rows
	 */
	public int getNumRows() {
		return numRows;
	}

	/**
	 * 
	 * @return numCols - number of columns
	 */
	public int getNumCols() {
		return numCols;
	}

	/**
	 * 
	 * @return a transposed matrix
	 */
	public Matrix transpose() {
		// TODO Auto-generated method stub
		// rows and columns switch - first row becomes first column
		double[][] newData = new double[numCols][numRows];	// creates new double 2d array
		for (int i=0; i < numRows; i++) {	// iterates through rows
			for (int j=0; j < numCols; j++) {	// iterates through columns
				newData[j][i] = this.data[i][j];
			}
		}
		Matrix matrix = new Matrix(newData);
		int newNumRows = getNumRows();
		int newNumCols = getNumCols();
		matrix.numRows = newNumCols;
		matrix.numCols = newNumRows;
		return matrix;
	}

	/**
	 * 
	 * @param matrix being added to original matrix
	 * @return new Matrix with the newData after adding original matrix and Matrix matrix
	 */
	public Matrix add(Matrix matrix) {
		// TODO Auto-generated method stub
		// number of rows/columns has to be the same
		// m1 + m2 = m3
		double[][] newData = new double[numRows][numCols];	// creates new double 2d array
		for (int i=0; i < numRows; i++) {	// iterates through rows
			for (int j=0; j < numCols; j++) {	// iterates through columns
				newData[i][j] = this.data[i][j] + matrix.data[i][j];
			}
		}
		return new Matrix(newData);
	}

	/**
	 * 
	 * @param d - double being multiplied to the the matrix
	 * @return matrix with the new data
	 */
	public Matrix mult(double d) {
		// TODO Auto-generated method stub
		// scaler multiplication - every value in the matrix gets multiplied by "double d"

		double[][] newData = new double[numRows][numCols];	// creates new double 2d array
		for (int i=0; i < numRows; i++) {	// iterates through rows
			for (int j=0; j < numCols; j++) {	// iterates through columns
				newData[i][j] += this.data[i][j] * d;
			}
		}
		return new Matrix(newData);
	}

	/**
	 * 
	 * @param matrix - matrix multiplying original matrix
	 * @return matrix with the multiplied data
	 */
	public Matrix mult(Matrix matrix) {
		// TODO Auto-generated method stub
		// number of columns in the first matrix has to be equal to the number of rows in the second matrix
		// first row * first column = first row[0], second row * first column = second row[0]

		double[][] newData = new double[numRows][matrix.numCols];	// creates new 2d double array
		for (int i=0; i < numRows; i++) {	// iterates through rows of first matrix
			for (int j=0; j < matrix.numCols; j++) {	// iterates through columns of second matrix
				for (int k=0; k < matrix.numRows; k++) {	// iterates through rows of second matrix
					newData[i][j] += this.data[i][k] * matrix.data[k][j];
				}
			}
		}
		return new Matrix(newData);
	}

	/**
	 * Overrides toString() method and and prints the number of rows and columns, and the matrix.
	 */
	public String toString() {
		String result = "";
		for (int i=0; i < numRows; i++) {	// iterates through rows
			result += "\n";
			for (int j=0; j < numCols; j++) {	// iterates through columns
				result += data[i][j] + " ";
			}
		}
		return (getNumRows() + "x" + getNumCols() + " matrix" + result + "\n");
	}
}
