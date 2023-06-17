package exceptions.lesson_3;

public class Task2 {
    public static void main(String[] args) throws Exception {
        try (Counter1 counter = new Counter1()){
            System.out.println(counter);
            counter.add();
            System.out.println(counter);
        }
        Counter1 counter = new Counter1();
        System.out.println(counter);
        counter.add();
        System.out.println(counter);
        counter.close();
        counter.add();
    }
}

class Counter1 implements AutoCloseable{
    private int counter;
    private boolean isCloseable;

    public Counter1() {
        this.counter = 1;
        this.isCloseable = false;
    }

    public void add(){
        if (isCloseable) throw new RuntimeException();
        counter++;
    }

    @Override
    public void close() throws Exception {
        this.isCloseable = true;
    }
}
