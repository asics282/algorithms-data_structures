package com.example.HW_Algoritms.HW4;

public class Main {
    public static void main(String[] args) {
        RBTree <Integer> tree = new RBTree<>();
        System.out.println(tree.add(71));
        System.out.println(tree.add(4));
        System.out.println(tree.add(3));
        System.out.println(tree.add(55));
        System.out.println(tree.add(13));
        System.out.println(tree.add(15));
        System.out.println(tree.add(15));
        System.out.println(tree.add(299));
        System.out.println("Обшее количество нод в дереве = " + tree.counter());
    }
}