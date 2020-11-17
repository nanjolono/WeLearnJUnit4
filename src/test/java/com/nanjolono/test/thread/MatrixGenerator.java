package com.nanjolono.test.thread;

import java.util.Random;

/**
 * @program: test
 * @description: MatrixGenerator
 * @author: nanjolono
 * @create: 2020-10-27 19:44
 **/
public class MatrixGenerator {
    public static double[][] generate (int rows, int columns) {
        double[][] ret=new double[rows][columns];
        Random random=new Random();
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                ret[i][j]=random.nextDouble()*10;
            }
        }
        return ret;
    }
}
