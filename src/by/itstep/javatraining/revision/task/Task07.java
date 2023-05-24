package by.itstep.javatraining.revision.task;

/*	Task 07. The Double Max [вторая максимальная цифра]
 *
 *	Дано целое число. Необходимо определить вторую по величине цифру данного числа,
 *	т.е. цифру, которая будет наибольшим, если из числа удалить наибольшую цифру.
 *	Если нет такой цифры, то должно быть возвращено число -1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 12345
 *	[output 1]: 4
 *
 *	[ input 2]: -56789
 *	[output 2]: 8
 *
 *	[ input 3]: 11111
 *	[output 3]: -1
 *
 *	[ input 4]: 0
 *	[output 4]: -1
 */

public class Task07 {
    public static int task07(long number) {
        if (number < 0) {
            number = -number;
        }
        int max = (int) (number % 10);
        int preMax = -1;
        while (number > 0) {
            long temp = number % 10;
            if (temp > max) {
                preMax = max;
                max = (int) temp;
            } else if (temp > preMax && temp < max) {
                preMax = (int) temp;
            }
            number /= 10;
        }
        return preMax;
    }

    public static void main(String[] args) {
        System.out.println(task07(1276));
    }
}
