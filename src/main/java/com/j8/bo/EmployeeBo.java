package com.j8.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeBo {
    private int id;
    private String name;
    private double salary;
}
