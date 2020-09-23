package by.epam.training.module01.cycles.task08;

// Даны два числа. Определить цифры,
// входящие в запись как первого так и второго числа.

public class Module01Task08 {

    public static void main(String[] args) {

        int a = 2938;
        int b = 2389;

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        System.out.println("И там, и тут есть цифры: ");

        while (absA > 0) {
            int numb = absA % 10;
            absA = absA / 10;
            while (absB > 0) {
                if ((absB % 10) == numb) {
                    System.out.print(numb + ", ");
                }
                absB = absB / 10;
            }
            absB = Math.abs(b);
        }
    }
}