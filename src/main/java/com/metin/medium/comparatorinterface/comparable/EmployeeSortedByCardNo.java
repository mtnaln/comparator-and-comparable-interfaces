package com.metin.medium.comparatorinterface.comparable;

import com.metin.medium.comparatorinterface.model.Employee;

import java.util.Comparator;

public class EmployeeSortedByCardNo implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getCardNo() - employee2.getCardNo();
    }
}
