package com.example.architecturemvvm.model;

public class User {
   public String email;
   public String password;
    // constructeur pour initialiser
// les variables
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    // méthodes getter et setter
// pour la variable email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    // méthodes getter et setter
// pour la variable password
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
