package com.talentLMS.DB.tst;

import com.talentLMS.DB.utils.DBConnection;
import com.talentLMS.UI.dataProviders.ConfigReader;
import org.testng.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tst {

    public static void main(String[] args) throws SQLException {

        DBConnection.open(ConfigReader.getProperty("dbname"));

//        List<EmployeeBean> employeeBeanList = EmployeeBean.getAll();
//
//        ResultSet rs = DBConnection.query("select * from employees");
//        rs.next();
//
//        EmployeeBean.getAll().forEach(System.out::println);

        final String expectedFirstName = "Leandro";

//        EmployeeBean leandro = EmployeeBean.getBy("first_name", "Nomads");
////        Assert.assertEquals(leandro.getFirst_name(), expectedFirstName);
//        System.out.println(leandro);
//
//
//        Salaries salary = Salaries.getBy("salary", "71046");
//        System.out.println(salary);
//
//
//        System.out.println(Salaries.getCount());


//        Salaries.getColumnNames("salaries").forEach(System.out::println);

        System.out.println("\n" + Salaries.getColumnNames("employees", "titles"));
//        for (String e : Salaries.getColumnsNames("salaries")) {
//            System.out.println(e);
//        }

//        System.out.println("\tAll column names in 'Salary' table:");
//        Salaries.getColumnsNamesTable("salaries").forEach(System.out::println);

//        List<String> expSalaryList = new ArrayList<>();
//        expSalaryList.add("emp_no");
//        expSalaryList.add("salary");
//        expSalaryList.add("from_date");
//        expSalaryList.add("to_date");
//        Assert.assertEquals(Salaries.getColumnNames("employees", "salaries"), expSalaryList);

        System.out.println(Salaries.getColumnNames("employees", "departments"));

    }

}
