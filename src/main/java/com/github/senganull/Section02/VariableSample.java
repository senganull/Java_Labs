package com.github.senganull.Section02;

public class VariableSample {
    public static void main(String[] args) {
        //変数の宣言と代入
        int age = 19;

        //String型の箱(文字列)
        String name = "SengaNull";

        //箱の中身を表示する
        System.out.println("名前は : " + name);
        System.out.println("年齢は : " + age);

        //変数の上書き
        age = 20;

        System.out.println("誕生日が来たので...");
        System.out.println("年齢が :" + age + "になりました。");
    }
}
