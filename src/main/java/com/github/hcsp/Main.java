package com.github.hcsp;

public class Main {
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static void main(String[] args) {
        int x=0;
        f(x);
        System.out.println(f(x));
    }
    public static int f(int x){
        return x+1;
    }
}
