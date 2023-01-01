package com.bridgelabz.employeepayrollservice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeePayrollServiceTest {
    @Test
    public void whenThreeEmployeeAddedShouldReturnCountOfEmployees() {
        EmployeePayrollData[] employeeList = { new EmployeePayrollData(1, "Rama", 50000),
                new EmployeePayrollData(2, "Shyam", 50000), new EmployeePayrollData(3, "Krishna", 50000) };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(employeeList));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries();
        assertEquals(3, entries);
    }
}
