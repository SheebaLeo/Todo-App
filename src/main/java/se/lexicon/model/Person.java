package se.lexicon.model;

public class Person {

    private int id;

    private String fristName;

    private String lastName;

    private String email;

    public Person(int id, String fristName, String lastName, String email) {
        if (fristName == null || fristName.isEmpty()) {
            throw new IllegalArgumentException("fristName cannot be null or empty");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("fristName cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("fristName cannot be null or empty");
        }
        this.id = id;
        this.fristName = fristName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        if (fristName == null || fristName.isEmpty()) {
            throw new IllegalArgumentException("fristName cannot be null or empty");
        }
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("lastName cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("email cannot be null or empty");
        }
        this.email = email;
    }

    public String getSummary() {
        return "Id: " + id + ", " + "Name" + fristName + " " + lastName + ", " + "Email: " + email;
    }
}
