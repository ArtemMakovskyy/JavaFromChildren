package Shildt.PART1.S186;

import java.util.Stack;

/** https://www.youtube.com/watch?v=JKv-vCjJTVA
 * Java и структуры данных - Стек (Stack): создание стека, методы push, pop, peek, empty */
public class S174 {
    public static void main(String[] args) {
        Stack steck = new Stack();

        System.out.println("1) Проверка есть чтото? //"+steck.empty()); // 1) проверка есть чтото в стеке / буленовский метод

        steck.push("abc"); // 2) ложим вверх

        System.out.println("3) Проверяем теперь //"+steck.empty()); //3) проверяем теперь

        if(!steck.empty()){
            System.out.println("4) Что положили//"+ steck.pop()); //4) что положили pop удаляет, "peek" оставляет в стеке
        }
        System.out.println("5) Пустой или нет // "+steck.empty());//5) Пустой или нет


        System.out.println(steck.empty());

        steck.push("abc");
        steck.push(123);
        steck.push("lalala");

        System.out.println(steck.pop());
        System.out.println(steck.pop());
        System.out.println(steck.peek());
        System.out.println(steck.empty());
        System.out.println(steck.pop());

        System.out.println(steck.empty());
    }
}
