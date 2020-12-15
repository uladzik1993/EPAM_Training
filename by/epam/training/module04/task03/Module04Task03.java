package by.epam.training.module04.task03;

// Создайте класс с именем Student, содержащий поля:
// фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.ArrayList;

public class Module04Task03 {

    public static void main(String[] args) {
        ArrayList<Student> university = new ArrayList<>();

        Student petrov = new Student();
        university.add(petrov);
        petrov.setSurname("Petrov");
        petrov.setInitials("A.V.");
        petrov.setGroup(1);
        petrov.setMark(9, 7, 8, 5, 7);

        Student ivanov = new Student();
        university.add(ivanov);
        ivanov.setSurname("Ivanov");
        ivanov.setInitials("D.K.");
        ivanov.setGroup(3);
        ivanov.setMark(9, 9, 10, 9, 10);

        Student sidorov = new Student();
        university.add(sidorov);
        sidorov.setSurname("Sidorov");
        sidorov.setInitials("A.M.");
        sidorov.setGroup(6);
        sidorov.setMark(10, 10, 10, 9, 9);

        Student dubrov = new Student();
        university.add(dubrov);
        dubrov.setSurname("Dubrov");
        dubrov.setInitials("V.A.");
        dubrov.setGroup(3);
        dubrov.setMark(3, 4, 10, 7, 8);

        Student kozlov = new Student();
        university.add(kozlov);
        kozlov.setSurname("Kozlov");
        kozlov.setInitials("S.M.");
        kozlov.setGroup(3);
        kozlov.setMark(6, 8, 4, 2, 6);

        Student sokolova = new Student();
        university.add(sokolova);
        sokolova.setSurname("Sokolova");
        sokolova.setInitials("E.A.");
        sokolova.setGroup(1);
        sokolova.setMark(10, 10, 10, 9, 10);

        Student latushko = new Student();
        university.add(latushko);
        latushko.setSurname("Latushko");
        latushko.setInitials("S.M.");
        latushko.setGroup(4);
        latushko.setMark(9, 9, 10, 10, 9);

        Student ivaschenko = new Student();
        university.add(ivaschenko);
        ivaschenko.setSurname("Ivaschenko");
        ivaschenko.setInitials("A.E.");
        ivaschenko.setGroup(3);
        ivaschenko.setMark(5, 6, 2, 7, 8);

        Student mihailov = new Student();
        university.add(mihailov);
        mihailov.setSurname("Mihailov");
        mihailov.setInitials("D.P.");
        mihailov.setGroup(3);
        mihailov.setMark(9, 9, 9, 9, 10);

        Student rubanov = new Student();
        university.add(rubanov);
        rubanov.setSurname("Rubanov");
        rubanov.setInitials("V.D.");
        rubanov.setGroup(1);
        rubanov.setMark(10, 10, 10, 10, 10);

        System.out.println("List of excellent students: ");
        printexcellentStudent(university);




    }
    public static void printexcellentStudent (ArrayList<Student> strList) {

        for (int y = 0; y < strList.size(); y++) {
            if (excellentStudent(strList.get(y).getMark())) {
                System.out.println("\nSurname: " + strList.get(y).getSurname());
                System.out.println("Group number: " + strList.get(y).getGroup());
            }
        }

    }


    public static boolean excellentStudent(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 9) {
                count++;
            }
        }
        return count == arr.length;
    }
}
