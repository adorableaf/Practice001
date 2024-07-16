import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] FirstArray = new int[3];
        System.out.println("Введите элементы массива (3): ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < FirstArray.length; i++) {
            FirstArray[i] = scanner.nextInt();
        }
        System.out.print("Элементы массива: ");
        for (int i = 0; i < FirstArray.length; i++) {
            System.out.print(FirstArray[i] + ", ");
        }
        System.out.print("Введите, что вы хотите сделать с элементами массива (+ или *): ");
        String todo = scanner.next();
        int FinalResult = operationArray(todo, FirstArray);

        System.out.println("Результат ваших действий: " + FinalResult);
    }
    public static int operationArray (String todo, int[] FirstArray) {
        int res = 0;
        switch (todo) {
            case "+" :
                for (int i = 0; i < FirstArray.length; i++) {
                    res = res + FirstArray[i];
                }
                break;
            case "*" :
                res = 1;
                for (int i = 0; i < FirstArray.length; i++) {
                    res = res * FirstArray[i];
                }
                break;
            default:
                System.out.println("Вы ввели вообще не то, что нужно");
                return 0;
        }
        return res;

    }
}