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
        emp.setEno(11);
        emp.setEname("annusri");
        emp.setPhone(7702462691l);
        emp.setSalary(44000.56f);
        dao=new EmployeeDAO();
        dao.save(emp);
    }
}
