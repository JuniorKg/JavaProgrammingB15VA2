package day63_last_day;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {
    public static void main(String[] args) {
        //declare list of Map<String, String>
        List<Map<String, String>> employees = new ArrayList<>();

        Map<String, String> emp1Data = new HashMap<>();
        emp1Data.put("EmpID", "123");
        emp1Data.put("EmpName", "John Doe");
        emp1Data.put("JobTitle", "SDET");
        emp1Data.put("Salary", "103000");

        Map<String, String> emp2Data = new HashMap<>();
        emp2Data.put("EmpID", "124");
        emp2Data.put("EmpName", "Ahmed Toran");
        emp2Data.put("JobTitle", "Developer");
        emp2Data.put("Salary", "250000");

        System.out.println(employees.add(emp1Data));
        System.out.println(employees.add(emp2Data));

        System.out.println(employees.toString());
        System.out.println(employees.size());


        System.out.println(employees.get(0).get("EmpName"));
        System.out.println(employees.get(1).get("EmpName"));

        System.out.println(employees.get(0));
        System.out.println(employees.get(1));

        //Using for each loop.print job title for each employee

        for(Map<String, String> empMap: employees) {
            System.out.println(empMap.get("JobTitle"));
        }
            int totalSalary = 0;
            for(Map each : employees){
                System.out.println(each.get("JobTitle"));
                //add each employees salary to this variable, then print out after loop
                totalSalary+= Integer.parseInt((String) each.get("Salary"));
            }
            System.out.println("totalSalary = "+totalSalary);

        }



    }
