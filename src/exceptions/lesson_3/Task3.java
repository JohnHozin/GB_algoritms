package exceptions.lesson_3;

public class Task3 {
    public class DivisionByZeroException extends Exception {
        public DivisionByZeroException () {
            super("Делить на ноль нельзя!");
        }
    }
    public class NullArrayElementException extends Exception {
        public NullArrayElementException () {
            super("Выход за переделы массива!");
        }
    }
    public class FileNotFoundException extends Exception {
        public FileNotFoundException () {
            super("Файл не найден!");
        }
    }
}
