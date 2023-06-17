package exceptions.lesson_3;

public class Task4 {
    public static void main(String[] args) {
        String[][] array = {{"1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1"}};
        try {
            int sum = calculateSum(array);
            System.out.println(sum);
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

    }
    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length!=4 || array[0].length != 4){
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try {
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("РќРµРІРµСЂРЅС‹Рµ РґР°РЅРЅС‹Рµ РІ СЏС‡РµР№РєРµ ["+i+ "]["+ j+"]");
                }
            }
        }
        return sum;
    }

}
class MyArraySizeException extends Exception {
    public MyArraySizeException () {
        super("РќРµРІРµСЂРЅС‹Р№ СЂР°Р·РјРµСЂ РјР°СЃСЃРёРІР°, РґРѕР»Р¶РµРЅ Р±С‹С‚СЊ 4x4!");
    }
}
class MyArrayDataException extends Exception {
    public MyArrayDataException (String message) {
        super(message);
    }
}
