package com.talentLMS.DB.tst;

import com.talentLMS.DB.utils.DBConnection;
import com.talentLMS.UI.dataProviders.ConfigReader;
import org.testng.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;
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


//        Salaries.getColumnsNames("salaries").forEach(System.out::println);
//        for (String e : Salaries.getColumnsNames("salaries")) {
//            System.out.println(e);
//        }

        System.out.println("\tAll column names in 'Salary' table:");
        Salaries.getColumnsNames("salaries").forEach(System.out::println);

    }

}
