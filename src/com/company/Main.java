package com.company;

public class Main {

    public static void main(String[] args) {
        Class classs = new Class(2001,"Sultanbek",new int[] {20});
        System.out.println(classs.getNumber() + " " + classs.getWord() + " " + classs.getArray());
    }
}
