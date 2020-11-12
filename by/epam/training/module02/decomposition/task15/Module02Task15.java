package by.epam.training.module02.decomposition.task15;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Module02Task15 {

    public static void main(String[] args) {
        int maxNumber = 1000;

        findStrictlyIncreasingNum(0, " ", 4);
    }

    private static void findStrictlyIncreasingNum(int start, String out, int n)
    {
        if (n == 0)
        {
            System.out.println(out + " ");
            return;
        }

        for (int i = start; i <= 9; i++)
        {
            String str = out + Integer.toString(i);

            findStrictlyIncreasingNum(i + 1, str, n - 1);
        }
    }
}

