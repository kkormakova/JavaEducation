package org.example;

import java.util.*;

/**
 * Класс хранящий множество объектов и обрабатывающий поисковые запросы
 */
public class Base {
    Notebook note1 = new Notebook("HUAWEI", "MateBook D 14", "Intel Core i5 1155G7", 6, 8, 512, "Intel Iris Xe Graphics", 4, "Windows 11 Home", "серебристый", 39000);
    Notebook note2 = new Notebook("Acer", "Nitro 5 AN515-45", "AMD Ryzen 5 5600H", 4, 8, 512, "NVIDIA GeForce GTX 1650", 4, "DOS", "черный", 48000);
    Notebook note3 = new Notebook("ASUS", "X515EA-BQ1185W", "Intel Core i5 1135G7", 4, 16, 1024, "Intel Iris Xe Graphics", 4, "Windows 11 Home", "черный", 45000);
    Notebook note4 = new Notebook("HP", "OMEN 16-b1017ci", "Intel Core i7-12700H", 8, 16, 1024, "NVIDIA GeForce RTX 3070", 8, "Windows 11 Home", "серый", 65000);
    Notebook note5 = new Notebook("HONOR", "MagicBook 15", "AMD Ryzen 5 5500U", 6, 8, 512, "AMD Radeon Graphics", 4, "без ОС", "серебристый", 57000);
    public List<Notebook> notebookList = new ArrayList<>(Arrays.asList(note1, note2, note3, note4, note5));

    /**
     * Предлагает пользователю список для поиска с выбором числового значения (меню поисковика)
     *
     * @param mapList лист для выбора
     * @return выбор пользователя с типом int
     */
    public static int findChoice(Map<Integer, String> mapList) {
        int choice = -1;
        printMap(mapList);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        while (choice < 1 || choice > mapList.size()) {
            if (sc.hasNextInt()) choice = sc.nextInt();
            if (!(choice > 0 && choice < mapList.size() + 1)) {
                System.out.println("Не корректный ввод!");
                System.out.print("Введите цифру: ");
                sc.nextLine();
            }
        }
        return choice;
    }

    /**
     * Фильтрация множества объектов
     *
     * @param n выбор пользователя в меню
     */
    public void filterList(Integer n) {
        int count = 1;
        int choice;
        Map<Integer, String> findList = new HashMap<>();
        switch (n) {
            case (1):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(el.getBrand())) {
                        findList.put(count, el.getBrand());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (el.getBrand().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (2):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(el.getCpuName())) {
                        findList.put(count, el.getCpuName());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (el.getCpuName().toString().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (3):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(Integer.toString(el.getRam()))) {
                        findList.put(count, Integer.toString(el.getRam()));
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (Integer.toString(el.getRam()).equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (4):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(el.getVideoName())) {
                        findList.put(count, el.getVideoName());
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (el.getVideoName().equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (5):
                for (Notebook el : notebookList) {
                    if (!findList.values().contains(Integer.toString(el.getSsd()))) {
                        findList.put(count, Integer.toString(el.getSsd()));
                        count++;
                    }
                }
                choice = findChoice(findList);
                for (Notebook el : notebookList) {
                    if (Integer.toString(el.getSsd()).equals(findList.get(choice))) {
                        System.out.println(el);
                    }
                }
                break;
            case (6):
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите минимальную сумму: ");
                int minPrice = scanner.nextInt();
                System.out.print("Введите максимальную сумму: ");
                int maxPrice = scanner.nextInt();
                List<Notebook> fList = new ArrayList<>();
                for (Notebook el : notebookList) {
                    if (el.getPrice() >= minPrice && el.getPrice() <= maxPrice) {
                        fList.add(el);
                    }
                }
                for (Notebook el : fList) {
                    el.toString();
                }
                break;
        }
    }

    /**
     * Печать Map в консоль
     *
     * @param map
     */
    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("%d - %s;%n", item.getKey(), item.getValue());
        }
    }
}
