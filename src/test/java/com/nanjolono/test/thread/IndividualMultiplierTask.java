package com.nanjolono.test.thread;

/**
 * @program: test
 * @description: IndividualMultiplierTask
 * @author: nanjolono
 * @create: 2020-10-27 20:36
 **/
public class IndividualMultiplierTask implements Runnable {
    private final double[][] result;
    private final double[][] matrix1;
    private final double[][] matrix2;

    private final int row;
    private final int column;

    public IndividualMultiplierTask(double[][] result,double[][] matrix1,double[][] matrix2,int i,int j){
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = i;
        this.column = j;

    }

    @Override
    public void run() {
        result[row][column] = 0;
        for (int i = 0; i < matrix1[row].length; i++) {
            result[row][column] += matrix1[row][i] * matrix2[i][column];
        }
    }
}
