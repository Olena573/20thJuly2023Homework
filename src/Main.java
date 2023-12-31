import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
      //  for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
         //   System.out.println("i = " + i);

        //Task 1.

       List<User> someUsers = List.of(
               new User("Illya", "Radchenko", 24, "Radchenko123@ukr.net"),
               new User("Taras", "Myronenko", 37, "myrontaras@gmail.com"),
               new User ("Arkadiy", "Moskalenko", 32, "arkadyfrompoltava@gmail.com"),
               new User("Larysa", "Popova", 25, "larysa_237@gmail.com"),
               new User ("Valeriya", "Humenyuk", 36, "lerochka-valeriya@gmail.com"),
               new User("Karyna", "Radchenko", 27, "radchenkokarynna@gmail.com"),
               new User ("Dmytro", "Myronenko", 21, "cyberdmytro@ukr.net"),
               new User ("Larysa", "Matviyenko", 25, "panimatviyenko@gmail.com"),
               new User ("Ilona", "Moskalenko", 29, "Ilona2000@ukr.net"));
       //Here a new List of users was created and filled with data.
        System.out.println("Here is a list of distinct surnames for task 1: ");
        someUsers.stream().filter(age -> age.getAge()>25)
                //here we filter users by age: all users older than 25 years will be used further
                .map(User::getSurname)
                //here we noted that only surnames will be used.
                .distinct()
                //here we use distinct () method to print out only distinct data;
                .forEach(System.out::println);
        //Here we "print" them on the screen.
        // So a list of distinct surnames for users older than 25 years is printed out.

        // Task 2 (which requires to use Optional by definition).
        System.out.println("Here is a result for task 2: ");
        Optional<Object> filteredNames = Optional.ofNullable(someUsers.stream()
                .filter(surname -> surname.surnameLength() < 8)
                //Here we get users with surnames shorter than 8 symbols;
                .map(User::getName)
                .collect(Collectors.toList()));
                //here we take only names of users;
                // I had to use a collector, so the output worked fine.

        try {
            System.out.println(filteredNames.orElseThrow(() -> new RuntimeException("0 users have surnames shorter than 8 symbols.")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //Here is a method with the Exception for the case of 0 results;

        System.out.println("A list of names of users with surnames shorter than 8 symbols.");

        // Task 3
        System.out.println("Here is a list of sorted years of births for task 3: ");
        Optional<Object> filteredYears = Optional.ofNullable(someUsers.stream()
                .filter(email -> email.emailLength()>19)
                //here we filtered users who have email length more than 19.
                .skip (3)
                //Here we skipped first 3 results;
                .map(User::getYearOfBirth)
                //Here only a year of birth will be printed out;
                .sorted()
                //Here we sorted results. As we sort Integer values, a simple "sorted()" method is used.
                //In other cases, comparators or comparable should be used.
                //I did'n add a "distinct()" method, so names of users will be repeated.
                .collect(Collectors.toList()));
                //Here we created a new list.
        try {
            System.out.println(filteredYears.orElseThrow(() -> new RuntimeException(
                    "We skipped all users, or all emails are shorter than 19 symbols.")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //listOfYears.stream().forEach(System.out::println);
        // Here we printed out this new list;

        //So here is a sorted list of years of birth for users, whose email is longer than 19 symbols.
        System.out.println("Emails of these users are longed than 19 symbols; first 3 users were skipped.");










        // Task 4. Рекурсія - це функція, яка викликає саму себе.
        // Наприклад, звичайна функція може підраховувати int anc = (int an - 1);
        //A функція в рекурсії зможе підрахувати факторіал числа від якогось додатнього числа до одиниці,
        // раз по разу віднімаючи 1. І для цього вона викликатиме саму себе. Головне - прописати умову виходу
        // з рекурсії. Інакше вона так і рахуватиме, весь час щось множачи або віднімаючи.
        // Різниця Optional і Stream полягає в тому, що Optional працює з exceptions, а Stream - ні.
        // Також у Optional можна викликати методи Stream.
        // Через відсутність у стрімах роботи з exceptions, краще робити Optional, що викликатимуть за потреби стріми
        // і методи стрімів. Методи Optional це: get (), orElse (), orElseGet (), orElseThrow (), isPresent ().
        //Optional - це підвид Stream, і інші методи в нього такі ж як в Stream.
        //orElseThrow дозволяє викинути Exception.


        //In this homework I've used Optionals for tasks 2 and 3, because it has Exceptions.
        // In task 1 was specified that it should be done with Streams.
        // So I left it with a Stream, without creating an Optional.





        }
    }
