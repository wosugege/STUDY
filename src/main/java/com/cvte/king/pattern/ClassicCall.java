package com.cvte.king.pattern;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 经典调用方式
 *
 * @author AKing
 * @date 2020年07月27日 19:34
 */
public class ClassicCall {

    public static String king = "Life is a journey, not the destination, but the scenery along the should be and the mood  at the view。";
    public static void main(String[] args) {
        ClassicCall classicCall = new ClassicCall();
//        classicCall.classicCall();
//        classicCall.stringMatch();
        classicCall.stringMethods();

    }

    /**
     * 经典调用方式
     */
    public void classicCall() {
        //经典调用方式，可多次重复使用，线程不安全
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaa");
        boolean matches = matcher.matches();
        //经典调用方式，仅使用一次,线程安全
        boolean aaaa = Pattern.matches("a*b", "aaaa");
        System.out.println(aaaa);
        System.out.println(matches);
    }

    /**
     * String内置的匹配方式
     */
    public void stringMatch() {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-\\d+"));
        System.out.println("+12321".matches("-\\d+"));
        System.out.println("+12321".matches("(-|\\+)?\\d+"));
        System.out.println("+12321".split("(-|\\+)?\\d+"));

    }


    /**
     * String的一些方法
     */
    public void stringMethods() {
        //spilt分割
        System.out.println("spilt分割:");
        System.out.println(Arrays.toString(king.split(" ")));
        System.out.println(Arrays.toString(king.split("\\W")));
        System.out.println(Arrays.toString(king.split("\\W+")));
        //replace替换
        System.out.println("replace替换:");
        System.out.println(king.replaceFirst("L\\w+","生命"));
        System.out.println(king.replaceAll("Life|journey|destination|scenery","XXX"));
//        检查一个句子是否以大写字母开头并以句号结尾
        System.out.println("检查一个句子是否以大写字母开头并以句号结尾:");
        System.out.println(king.matches("[A-Z].*。"));
        System.out.println("abccad".matches(".*[ab].*"));
    }
}
