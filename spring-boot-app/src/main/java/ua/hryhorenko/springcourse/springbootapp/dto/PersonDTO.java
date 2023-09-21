package ua.hryhorenko.springcourse.springbootapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PersonDTO {
  @NotEmpty(message = "Name should be not empty")
  @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
  private String name;

  @Min(value = 0, message = "Age should be greater than 0")
  private int age;

  @Email
  @NotEmpty(message = "Email should be not empty")
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}