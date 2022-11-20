package com.j8.service;

import com.j8.bo.EmployeeBo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<EmployeeBo> getSalaryDetails () {

    ArrayList<EmployeeBo> empList = new ArrayList<>();

    empList.add(new EmployeeBo(101,"aaaa",500000.0));
    empList.add(new EmployeeBo(102,"bbbb",2500000.0));
    empList.add(new EmployeeBo(103,"cccc",150000.0));
    empList.add(new EmployeeBo(104,"dddd",300000.0));

    return empList.stream().filter(e->e.getSalary()>300000).collect(Collectors.toList());

    }

}
