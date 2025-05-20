package model.entity;

import java.sql.Date;

public class User {
    Integer id;
    String name;
    String cpf;
    String email;
    String phone;
    String password;
    Date birthDate;


    public User(){

    }

    public User(String name, String cpf, String email, String telefone, String password, Date birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = telefone;
        this.password = password;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telefone) {
        this.phone = telefone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
