package com.metin.medium.comparatorinterface.model;

public class Employee implements Comparable<Employee> {
    private int no;
    private int cardNo;
    private String name;
    private String surname;
    private int salary;

    public Employee(int no, int cardNo, String name, String surname, int salary) {
        this.no = no;
        this.cardNo = cardNo;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", cardNo=" + cardNo +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' +
                '\n';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.no - employee.no;
    }
}
