package tdd.sample;

public class Fibonacci {

    public int fib(int nthNum) {
        if(nthNum <= 2) {
            return 1;
        }
        if(nthNum == 3){
            return fib(3-2)+fib(3-1);
        }
        if(nthNum == 4){
            return fib(4-2)+fib(4-1);
        }
        return fib(nthNum-2)+fib(nthNum-1);
    }

    public int fibonacciArray(int nthNum) {
        int[] fiboArray = new int[nthNum];
//        if(nthNum == 1){
//            fiboArray[0] = 1; // 1
//        }
//        if(nthNum == 2){
//            fiboArray[0] = 1;
//            fiboArray[1] = 1; // 1
//        }
//        if(nthNum == 3){
//            fiboArray[0] = 1;
//            fiboArray[1] = 1;
//            fiboArray[2] = fiboArray[0] + fiboArray[1]; //1+1
//            fiboArray[2] = fiboArray[2-2] + fiboArray[2-1]; //1+1
//            fiboArray[2] = fiboArray[nthNum-3] + fiboArray[nthNum-2]; //1+1
//        }
//        if(nthNum == 4){
//            fiboArray[0] = 1;
//            fiboArray[1] = 1;
//            fiboArray[2] = 2;
//            fiboArray[3] = fiboArray[nthNum-3] + fiboArray[nthNum-2]; //1+2
//        }

        for(int i=0; i<nthNum; i++){
            if(i <= 1){
                fiboArray[i] = 1;
            }
            if(i-2 >= 0){
                fiboArray[i] = fiboArray[i-2] + fiboArray[i-1];
            }
        }

        return fiboArray[nthNum-1];
    }

}
