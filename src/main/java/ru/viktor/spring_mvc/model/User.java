package ru.viktor.spring_mvc.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name can not be empty")
    @Size(min = 2, max = 15, message = "Name should be more than 2 and less than 15 characters")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Surname can not be empty")
    @Size(min = 2, max = 20, message = "Surname should be more than 2 and less than 20 characters")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be more than 0")
    private int age;

    @Column(name = "department")
    @Size(min = 2, max = 15, message = "Enter valid name of your department")
    @NotEmpty(message = "Department can not be empty")
    private String department;

    public User() {
    }

    public User(int id, String name, String surname, int age, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
