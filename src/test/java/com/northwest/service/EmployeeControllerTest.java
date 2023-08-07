package com.northwest.service;

import com.northwest.dto.EmployeeDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
    String date = "09/10/1977";
    LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
    private EmployeeDto employeeDto = new EmployeeDto("Bruno","Calcagno",birthDate,"brunocalcagnoprofile.pdf","base64stringtest");
    @Autowired
    private EmployeeService employeeService;
    @Test
    public void testSaveEmployee() throws IOException {
        employeeService.saveEmployee(employeeDto);
    }



}
