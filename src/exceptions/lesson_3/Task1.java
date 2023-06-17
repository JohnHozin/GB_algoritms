package exceptions.lesson_3;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        }
        catch (IOException e){
            System.out.println("ошибка");
        }
    }
    public static void doSomething() throws IOException {
        throw new IOException();
    }
}
