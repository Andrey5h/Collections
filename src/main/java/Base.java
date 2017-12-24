import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;

public class Base {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Test");
        Scanner scanner = new Scanner(file);
        ArrayList list = new ArrayList();

        //Читаем файл, все слова добавляем в массив ArrayList.
        while (scanner.hasNext()) {
            String word = scanner.next();
            list.add(word);
        }
        //Выводим все эелементы из файла
        System.out.println("В файле есть такие слова: " + list);


        //сортируем элементы по алфавиту и делаем подсчет слов из файле
        Set<String> sortedSet = new TreeSet<>();
        Map<String, Integer> statistics = new HashMap<>();


        String max[];
        max = new String[1];

        //Сначала преобразуем массив ArrayList в TreeSet для сортировки записей.

        int k = 0;
        String d;

        for (int i = 0; i < list.size(); i++) {
            //добавляем записи из массива ArrayList в TreeSet
            d = (String) list.get(i);
            sortedSet.add(d);

            // Сразу делаем подсчет слова из файла и записыаем их Мап.

            Integer count = statistics.get(d);
            if (count == null) {
                count = 0;
            }
            //Запись в Мап
            statistics.put(d, ++count);

            //Находим слово с максимальным повторением

            if (count > k) {
                k = count;
                max[0] = d;

            }
        }

        System.out.println("Сортируем по алфавиту: = " + sortedSet);
        System.out.println("Подсчет: = " + statistics);
        System.out.println("Наибольшее: = " + max[0]+ " Колличество повторений = " +k);
    }
}
