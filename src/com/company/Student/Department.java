package com.company.Student;

import java.util.HashMap;
import java.util.List;

public class Department {
    HashMap<String, String> department = new HashMap<>();

    HashMap<String, String> setDepartment() {
        department.put("cse", "chandra");
        department.put("ece", "siva");
        return department;
    }

}