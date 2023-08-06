package com.northwest.dto;
import java.util.Date;

public class EmployeeDto {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String profileName;
    private String profileBase64;

    public EmployeeDto(){}

    public EmployeeDto(String firstName, String lastName, Date birthDate, String profileName, String profileBase64) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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
