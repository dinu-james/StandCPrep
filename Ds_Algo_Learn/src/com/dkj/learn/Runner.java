package com.dkj.learn;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //Dynamic array
        Array number = new Array(3);
        number.insert(5);
        number.insert(5);
        number.insert(3);
        number.insert(15);
        number.insert(15);
        number.insert(15);
        number.removeAt(2);
        number.print();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Object[] arr = new Object[list.size()];
        arr=list.toArray();
        System.out.println(Arrays.toString(arr));

        //Linked List Implementation
        MyLinkedList myList = new MyLinkedList();
        myList.insert(7);
        myList.insert(8);
        myList.insert(9);
        myList.insertAt(100,2);
        myList.print();
        System.out.println("Index = "+myList.indexOf(90));

        //Java 8 Learnings
        System.out.println("Java 8 learnings");
        List<Employee> empList= new ArrayList<Employee>(){{
            add( new Employee(){{
                setAge(16);
                setEmpId("a78");
                setName("Insider");
                setSalary(9500);
            }});
        }};
        Employee emp1= new Employee(){{
           setAge(18);
           setEmpId("a79");
           setName("John");
           setSalary(6500);
        }};
        Employee emp2= new Employee(){{
            setAge(18);
            setEmpId("a80");
            setName("Geo");
            setSalary(7500);
        }};
        Employee emp3= new Employee(){{
            setAge(19);
            setEmpId("a81");
            setName("Rohan");
            setSalary(3500);
        }};
        Employee emp4= new Employee(){{
            setAge(50);
            setEmpId("a82");
            setName("Arch");
            setSalary(4000);
        }};
        Employee emp5= new Employee(){{
            setAge(70);
            setEmpId("a83");
            setName("Kelvin");
            setSalary(8500);
        }};
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("** Employee List **");
        empList.forEach(employee -> {
            System.out.println("Name = "+employee.getName() );
            System.out.println("Empl Id = "+employee.getEmpId() );
            System.out.println("Age = "+employee.getAge() );
            System.out.println("Salary = "+employee.getSalary() );
            System.out.println();
        });

        System.out.println("** Employees with salary > 6000**");
        empList.stream().filter(employee -> employee.getSalary()>6000).forEach(employee -> {
            System.out.println("Name = "+employee.getName() );
            System.out.println("Salary = "+employee.getSalary() );
        });

      System.out.println(" Count of Employees with salary between 3000 and 6000 = " +empList.stream().filter(employee -> employee.getSalary()<6000 && employee.getSalary()>3000).count());

      System.out.println(" Avg Salary = "+ empList.stream().collect(Collectors.averagingInt(Employee::getSalary)));

      System.out.println(" Highest Salary = "+  empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get().getName());

        System.out.println("Names sorted as per Age ");
      empList.stream().sorted(Comparator.comparing(Employee::getAge)).map(employee -> employee.getName()).forEach(
                System.out::println
        );

        System.out.println("Names sorted as per Age in reverse order ");
        empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).map(employee -> employee.getName()).forEach(
                System.out::println
        );

        System.out.println("Oldest employee name : ");
        empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).map(employee -> employee.getName()).findFirst().ifPresent(System.out::println);

        System.out.println("Youngest Employee = "+  empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get().getName());

        System.out.println("Avg. Age of Employees = "+ empList.stream().collect(Collectors.averagingInt(Employee::getAge)));

    }
}
