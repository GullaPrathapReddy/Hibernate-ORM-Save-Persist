package com.pt.test;

import com.pt.dao.EmployeeDAO;
import com.pt.domain.Employee;


public class App 
{
    public static void main( String[] args )
    {
        Employee emp=null;
        EmployeeDAO dao=null;
        emp=new Employee();
        emp.setEno(10);
        emp.setEname("annu");
        emp.setPhone(7392462691l);
        emp.setSalary(40000.56f);
        dao=new EmployeeDAO();
        int no=dao.save(emp);
        System.out.println(no);
    }
}
