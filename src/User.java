import java.util.Objects;
import java.util.List;


public class User <User>{
    //A class "User" for Tasks 1-3.

    String Name;
    String Surname;
    Integer Age;
    String Email;

    public User(String name, String surname, Integer age, String email) {
        Name = name;
        Surname = surname;
        Age = age;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Name, user.Name) && Objects.equals(Surname, user.Surname) && Objects.equals(Age, user.Age) && Objects.equals(Email, user.Email);
    }
*/

   public Integer getYearOfBirth(){
        //This is a method for task 3, which will allow to know a year of birth
       // (approximately, because I didn't use a Date() method, and I did not use exact dates of birth)
      Integer yearToday = 2023;
      Integer yearOfBirth = yearToday - Age;
      return yearOfBirth;
  }

  public Integer emailLength(){
      //This is a method for task 3, which will allow to know a length of email.
       return getEmail().length();
  }

    public Integer surnameLength(){
        //This is a method for task 2, which will allow to know a length of surname.
        return getSurname().length();
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, Age, Email);
    }

    @Override
    public String toString() {
        return "Here is a User. " +
                "Name: " + Name + "," + '\n' +
                "Surname: " + Surname + "," + '\n' +
                "Age: " + Age + "," + '\n' +
                "Email: " + Email + "." ;
    }
}
