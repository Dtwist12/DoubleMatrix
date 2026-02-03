public class TestMatrix {

    public static void main(String[] args) {
        DoubleMatrix matrixA = new DoubleMatrix(2, 3);
        for (int i = 0; i < matrixA.getNumberOfRows(); i++) {
            for (int j = 0; j < matrixA.getElements()[i].length; j++) {
                matrixA.getElements()[i][j] = Math.random() * 100;
            }
        }
        matrixA.print();
        //crete another matrix
        DoubleMatrix matrixB = new DoubleMatrix(2, 3);
        for (int i = 0; i < matrixB.getNumberOfRows(); i++) {
            for (int j = 0; j < matrixB.getElements()[i].length; j++) {
                matrixB.getElements()[i][j] = Math.random() * 100;
            }
        }
        matrixB.print();
        DoubleMatrix result = matrixA.addMatrices(matrixB);
        result.print();
        if(matrixA.isDiagonalSame(matrixB)){
            System.out.println("The diagonal elements are the same.");
        }
        else {
            System.out.println("The diagonal elements are not the same.");
        }
        
    }
}