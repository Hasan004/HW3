package org.lab5;

public class Great {

    public int greatest(int a, int b){
        return Math.max(a, b);
    }

    public String greatest(String a, String b){
        if(a.length() > b.length()){
            return a;
        }else{
            return b;
        }
    }

    public int greatest(int... ints) {
        int max = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int factorial (int n){
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

//    public int Fibo(){
//
//    }
//
//    void run(int n){
//
//    }

}
