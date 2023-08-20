package com.metin.medium.comparatorinterface;

import com.metin.medium.comparatorinterface.comparable.EmployeeSortedByCardNo;
import com.metin.medium.comparatorinterface.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorInterfaceApplication {

    public static void main(String[] args) {
        System.out.println("------------NUMBERS------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(11);
        numbers.add(19);
        numbers.add(12);
        numbers.add(10);

        System.out.println(numbers);

        System.out.println("------------------------");

        List<Integer> numbersSorted = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(numbersSorted);

        System.out.println("------------------------");

        List<Integer> numbersSortedReverseOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(numbersSortedReverseOrder);

        System.out.println("------------STRINGS------------");

        List<String> names = new ArrayList<>();
        names.add("Fikri");
        names.add("Ahmet");
        names.add("Barış");

        System.out.println(names);

        System.out.println("------------------------");

        List<String> namesSorted = names.stream().sorted().collect(Collectors.toList());

        System.out.println(namesSorted);

        System.out.println("------------------------");

        List<String> names2 = new ArrayList<>();
        names2.add("ahmet");
        names2.add("Fikri");
        names2.add("Ahmet");
        names2.add("fikri");
        names2.add("Barış");

        System.out.println(names2);

        System.out.println("------------------------");

        List<String> namesSorted2 = names.stream().sorted().collect(Collectors.toList());

        System.out.println(namesSorted2);

        System.out.println("------------USER DEFINED CLASSES------------");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(4, 102, "Metin", "Alnıaçık", 4500));
        employees.add(new Employee(3, 94, "Ahmet", "Acar", 9900));
        employees.add(new Employee(5, 46, "Can", "Kara", 3500));
        employees.add(new Employee(2, 56, "Ayşe", "Nur", 5500));

        System.out.println(employees);

        System.out.println("------------------------");

        List<Employee> employeesSorted = employees.stream().sorted().collect(Collectors.toList());

        System.out.println(employeesSorted);

        System.out.println("------------------------");

        List<Employee> employeesSortedByCardNo = employees.stream().sorted(new EmployeeSortedByCardNo()).collect(Collectors.toList());

        System.out.println(employeesSortedByCardNo);
    }
}
