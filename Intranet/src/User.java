import java.util.Date;

public abstract class User {
    private String id;
    private Gender gender;
    private String username;
    private String lastname;
    private String firstname;
    private String password;
    private Date dateOfRegistration;
    private String telNumber;
    private String email;

    public User(){}

    public User(String id, Gender gender, String username, String lastname, String firstname, String password, Date dateOfRegistration, String telNumber, String email){
        this.id = id;
        this.gender = gender;
        this.username = username;
        this.lastname = lastname;
        this.firstname = firstname;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.telNumber = telNumber;
        this.email = email;
    }

    public String getId() { return id; }

    public Gender getGender() { return gender; }

    public String getUsername() { return username; }

    public String getLastname() { return lastname; }

    public String getFirstname() { return firstname; }

    public String getPassword() { return password; }

    public Date getDateOfRegistration() { return dateOfRegistration; }

    public String getTelNumber() { return telNumber; }

    public String getEmail() { return email; }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            User u = (User) obj;
            return username.equals(u.username) && firstname.equals(u.firstname) && lastname.equals(u.lastname);
        }
        return false;
    }

    @Override
    public String toString() {
        return lastname + " " + firstname + " " + email;
    }
}
