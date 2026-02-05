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

        DoubleMatrix third = new DoubleMatrix(3, 3);
        DoubleMatrix fourth = new DoubleMatrix(3, 3);
        third.getElements()[0] = new double[]{1.1,2.2,3.3};
        third.getElements()[1] = new double[]{4.4,5.5,6.6};
        third.getElements()[2] = new double[]{7.7,8.8,9.9};
        third.print();
        fourth.getElements()[0] = new double[]{1.1,2.2,3.3};
        fourth.getElements()[1] = new double[]{4.4,5.5,6.6};
        fourth.getElements()[2] = new double[]{7.7,8.8,9.9};
        fourth.print();
        if(third.isDiagonalSame(fourth)){
            System.out.println("The diagonal elements are the same.");
        }
        else {
            System.out.println("The diagonal elements are not the same.");
        }

        DoubleMatrix rotated = third.rotateClockwise90();
        rotated.print();
        
        
    }
}