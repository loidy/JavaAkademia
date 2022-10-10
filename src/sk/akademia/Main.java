package sk.akademia;

import sk.akademia.persons.Employee;
import sk.akademia.persons.Person;

public class Main {
    public static void main(String[] args) {
        //int number = 5;
        //float[] strings = new float[5];
//        Person person = new Person("Ferko", 56);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//
//        Employee employee = new Employee(
//                "Anicka",
//                22,
//                "Java Developer"
//        );
//        System.out.println(employee.getName());
//        System.out.println(employee.getAge());
//        System.out.println(employee.getJobTitle());

        Line line = new Line(5);
        line.print();

        Line square = new Line('r', 6);
        square.print();
    }
}
