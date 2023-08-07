package com.northwest.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class EmployeeDto {
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;
    private String profileName;
    private String profileBase64;

    public EmployeeDto(){}

    public EmployeeDto(String firstName, String lastName, LocalDate birthDate, String profileName, String profileBase64) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.profileName = profileName;
        this.profileBase64 = profileBase64;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileBase64() {
        return profileBase64;
    }

    public void setProfileBase64(String profileBase64) {
        this.profileBase64 = profileBase64;
    }
}
