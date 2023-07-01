import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Формат сдачи: ссылка на подписанный git-проект.
//Задание
//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

public class Main {
    public static void main(String[] args) {

        List<Integer> list = CreateRndList(1, 100, 30);
        System.out.println(list);

        //1) Нужно удалить из него чётные числа
        DeleteEvenNums(list);
        System.out.println(list);

        //2) Найти минимальное значение
        System.out.println("Min: " + MinInList(list));

        //3) Найти максимальное значение
        System.out.println("Max: " + MaxInList(list));

        //4) Найти среднее значение
        System.out.println("Avr: " + AvrInList(list));
    }

    private static List<Integer> CreateRndList(int start, int end, int size) {
        List<Integer> newList = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            newList.add((int) (Math.random() * (end - start + 1) + start));
        }

        return newList;
    }
    private static void DeleteEvenNums(List<Integer> inputList){
        inputList.removeIf(item -> item % 2 == 0);
    }

    private static Integer MinInList(List<Integer> inputList){
        return Collections.min(inputList);
    }

    private static Integer MaxInList(List<Integer> inputList){
        return Collections.max(inputList);
    }

    private static Integer AvrInList(List<Integer> inputList){
        Integer sum = 0;

        Iterator<Integer> iterator = inputList.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum / inputList.size();
    }
}