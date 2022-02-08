package com.galinachitakV;

public class Lesson12String {

    public static void main(String[] args) {
        /*2*) Задана строка из английских слов через пробел. Написать метод который возвращает
         те же слова в обратном порядке. При этом слова изменены так что в каждом слове первая
         буква большая а остальные маленькие.*/


        String original = "I want to eat, not write a program";
        System.out.println(original);
        System.out.println(Lesson12String.reversOriginal(original));
    }

    public static String reversOriginal(String string) {
        String[] text = string.split("\\s");
        StringBuilder reverseString = new StringBuilder();

        for (int i = text.length - 1; i >= 0; i--) {
            reverseString.append(text[i]).append(" ");

        }
        return capitalLetter(reverseString.toString());
    }

    public static String capitalLetter(String string) {
        String[] text = string.split("\\s");
        StringBuilder output = new StringBuilder();

        for (String word : text) {
            output.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        return output.toString();
    }
}

