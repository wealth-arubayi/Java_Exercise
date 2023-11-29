package ecobank;

public class Student {
    String name;
    long id;
    String email;

    // Student (long Id, String Name, String Email) {
    //     this.id = Id;
    //     this.name = Name;
    //     this.email = Email;
    // }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
