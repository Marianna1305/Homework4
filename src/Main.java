public class Main { public static void main(String[] args) {
//Задание 1
    System.out.println("Задание 1");
    int age = 17;
    if (age >= 18) {
        System.out.println("Поздравляем с совершеннолением!");
    }
    if (age < 18) {
        System.out.println("Нужно немного подождать, возраст совершеннолетия пока не наступил.");
    }
//Задание 2
    System.out.println("Задание 2");
    int age2 = 8;
    if (age2 >= 7 && age2 < 18) {
        System.out.println("ребенок ходит в школу!");
    }
    if (age2 >= 18 && age2 < 24) {
        System.out.println("человек уже закончил школу и может отправляться в университет");
    }
    if (age2 >= 24) {
        System.out.println("человек окончил университет и ему пора искать первую работу");
    }
//Задание 3
    System.out.println("Задание 3");
    int totalCapacity = 102;
    int seatingPlaces = 60;
    int passengers = 120;
    if (passengers < seatingPlaces) {
        System.out.println("Есть сидячее место");
    }
    if (passengers < totalCapacity && passengers >= seatingPlaces) {
        System.out.println("Есть стоячее место");
    }
    if (passengers >= totalCapacity) {
        System.out.println("В вагоне нет свободных мест");
    }
//Задание 4
    System.out.println("Задание 4");
    int age3 = 19;
    if (age3 >= 18) {
        System.out.println("Поздравляем с совершеннолением!");
    } else {
        System.out.println("Нужно немного подождать, возраст совершеннолетия пока не наступил.");
    }
//Задание 5
    System.out.println("Задание 5");
    int age4 = 19;
    if (age4 >= 24) {
        System.out.println("человек окончил университет и ему пора искать первую работу");
    } else if (age4 >= 18) {
        System.out.println("человек уже закончил школу и может отправляться в университет");
    } else {
        System.out.println("ребенок ходит в школу!");
    }
//Задание 6
    System.out.println("Задание 6");
    int totalCapacity1 = 102;
    int seatingPlaces1 = 60;
    int passengers1 = 60;
    if (passengers1 >= totalCapacity1) {
        System.out.println("В вагоне нет свободных мест");
    } else if (passengers1 >= seatingPlaces1) {
        System.out.println("Есть стоячее место");
    } else {
        System.out.println("Есть сидячее место");
    }
//Задание 7
    System.out.println("Задание 7");
    int age5 = 15;
    boolean kinderGardenAge = age5 >=2 && age5 <= 6;
    boolean schoolAge = age5 >=7 && age5 <= 18;
    boolean universityAge = age5 >18 && age5 < 24;
    boolean jobAge = age5 >=24;
    if (kinderGardenAge) {
        System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");
    } else if (schoolAge) {
        System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
    } else if (universityAge) {
        System.out.println("Если возраст человека равен " + age5+ ", то ему нужно ходить в университет");
    } else if (jobAge) {
        System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
    }
//Задание 8
    System.out.println("Задание 8");
    int age6 = 15;
    boolean forbiddenAge = age6 < 5;
    boolean notAloneAge = age6 >=5 && age6 < 14;
    boolean aloneAge = age6 >= 14;
    if (forbiddenAge) {
        System.out.println("Ребенку пока нельза катеться на аттракционе");
    } else if (notAloneAge) {
        System.out.println("Ребенку можно кататься на атракционе только в сопровождении взрослого");
    } else if (aloneAge) {
        System.out.println("Ребенку можно кататься на атракционе без сопровождения взрослого");
    }
//Задание 9
    System.out.println("Задание 9");
    int one = 5;
    int two = 5;
    int three = 5;
    if (one > two) {
        if (one > three) {
            System.out.println("one большее из трех чисел");
        } else if (one == three) {
            System.out.println("one и three большие из трех чисел");
        } else {
            System.out.println("three большее из трех чисел");
        }
    } else if (one == two) {
        if (three > one) {
            System.out.println("three большее из трех чисел");
        } else if (three == one) {
            System.out.println("Все три числа равны");
        } else {
            System.out.println("one и two большие из трех чисел");
        }
    } else {
        if (two > three) {
            System.out.println("two большее из трех чисел");
        } else if (two == three) {
            System.out.println("two и three большие из трех чисел");
        } else {
            System.out.println("three большее из трех чисел");
        }
    }



    //помощью условного оператора и конструкции else напишите программу, которая вычисляет,
            //какое из трех чисел бОльшее и выводит результат в консоль.





}
}

