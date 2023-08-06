package com.northwest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.northwest.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    final String path = System.getProperty("user.home") + File.separator + "files" + File.separator ;

    @Override
    public String saveEmployee(EmployeeDto employeeDto) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        byte[] decoded = Base64.getDecoder().decode(employeeDto.getProfileBase64().getBytes(StandardCharsets.UTF_8));
        Files.write(Path.of(path + employeeDto.getProfileName()),decoded);
        return "profile saved sucessfully at: " + path.toString() +  employeeDto.getProfileName();
    }
}
