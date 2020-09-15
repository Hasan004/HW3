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

}
