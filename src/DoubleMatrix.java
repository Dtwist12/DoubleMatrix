//this class is used to show a double matrix, constructor initalizes the size of the matrix
//adding two matrices is also implemented here

public class DoubleMatrix {

//attribute
double[][] elements;
//constructor create any size matrix
public DoubleMatrix(int M, int N){
    elements = new double[M][N];
}
//getters

public double[][] getElements(){
    return elements;
}

//additional getters
public int getNumberOfRows(){
    return elements.length;
}

//print method

public void print(){
 for (int row = 0; row < elements.length; row++){
    for (int col = 0; col < elements[row].length; col++){
        System.out.print(oneDecimal(elements[row][col]) + " ");
    }
    System.out.println();
 }
System.out.println();

}

//this method uses double format to limit decimal places to 1
public double oneDecimal(double value){
    double step1 = value * 10;
    int step2 = (int)step1;
    double step3 = step2/10.0;
    return step3;
}

//this method adds two matrices and returns the result as a new matrix
public DoubleMatrix addMatrices (DoubleMatrix another){
    //first check if the two matrices have the same size
    if (this.getNumberOfRows() == another.getNumberOfRows() && this.getElements()[0].length == another.getElements()[0].length){
      DoubleMatrix result = new DoubleMatrix(this.getNumberOfRows(), this.getElements()[0].length);
      for (int i = 0; i < this.getNumberOfRows(); i++){
        for (int j = 0; j < this.getElements()[0].length; j++){
            result.getElements()[i][j] = this.getElements()[i][j] + another.getElements()[i][j];
        }
      }
      return result;
    }
    else {
      return null;
    }
}
//this method checks if the matrix are the same  in the diagonal
public boolean isDiagonalSame(DoubleMatrix another){
    if (this.getNumberOfRows() == this.getElements()[0].length && another.getElements()[0].length == another.getNumberOfRows() && this.getNumberOfRows() == another.getNumberOfRows()){
        return false;
    }
    for (int i = 0; i < this.getNumberOfRows(); i++){
        if (this.getElements()[i][i] != another.getElements()[i][i]){
            return false;
        }
    }
    return true;
}

//this method will rotate the matrix so for example if the matrix is 1 2 3
// it will become 3 2 1 

public DoubleMatrix rotateClockwise90(){
    DoubleMatrix result = new DoubleMatrix (getElements()[0].length, getNumberOfRows());
    for (int i = 0; i < getNumberOfRows(); i++){
        for (int j = 0; j < getElements()[0].length; j++){
            result.getElements()[j][getNumberOfRows() - 1 - i] = this.getElements()[i][j];
        }
    }
    return result;
}
}


