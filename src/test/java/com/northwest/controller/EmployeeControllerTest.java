package com.northwest.controller;


import com.northwest.dto.EmployeeDto;
import com.northwest.service.EmployeeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {
    String birthDate = "10/09/1977";

    @Mock
    private EmployeeService employeeService;

    @Test
    public void uploadEmployee() throws IOException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse("10/09/1977",fmt);
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setFirstName("Bruno");
        employeeDto.setLastName("Calcagno");
        employeeDto.setBirthDate(birthDate);
        employeeDto.setProfileName("brunocalcagnoprofile.pdf");
        employeeDto.setProfileBase64("anyStringBase64");
        Mockito.when(employeeService.saveEmployee(employeeDto));
    }

}
