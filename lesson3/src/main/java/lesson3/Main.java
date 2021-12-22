package lesson3;

import java.util.*;


public class Main {
    public static void main (String[] args) {

//      Задание №1

        String[] arr = {"Яблоко", "Апельсин", "Мандарин", "Груша", "Яблоко", "Манго", "Манго", "Виноград", "Айва", "Яблоко"};

        Set<String> hs = new HashSet<>(Arrays.asList(arr));
        System.out.println(hs);

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer count = hm.getOrDefault(arr[i],0);
            hm.put(arr[i],count + 1);
        }

        System.out.println(hm);


//      Задание №2

        PhoneBook[] arr2 = new PhoneBook[3];
        arr2[0] = new PhoneBook("Иванов", "+79521382123");
        arr2[1] = new PhoneBook("Петров", "+79521382124");
        arr2[2] = new PhoneBook("Сидоров", "+79521382125");

        List<PhoneBook> lPB = new ArrayList<>();
        lPB.addAll(Arrays.asList(arr2));
        lPB.add(new PhoneBook("Калиткин", "+79522345678"));
        lPB.add(new PhoneBook("Калиткин", "+79522345679"));



        for (int i = 0; i < lPB.size(); i++) {
            System.out.println(lPB.get(i));
        }

    }

    public void get (PhoneBook pB, String lastName) {

        if (pB.getLastName().equals(lastName)) {
            System.out.println();
        }
        System.out.println("Нет такой фамилии в справочнике");
    }
}
