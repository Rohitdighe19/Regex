import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration <pattern, matcher, result> {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome to USER REGISTRATION PROBLEM");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = s.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("First Name is Valid");
        else
            System.out.println("First Name is not valid");


        //validating last name
        System.out.println("Enter Last Name: ");
        String lastName = s.next();
        matcher = pattern.matcher(lastName);
        result = matcher.matches();
        if (result == true)
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is not valid");


        //validating email
        System.out.println("Enter Email : ");
        String Email = s.next();
        pattern = Pattern.compile("^([A-Z|a-z|0-9](\\.|_){0,1})+[A-Z|a-z|0-9]\\@([A-Z|a-z|0-9])+((\\.){0,1}[A-Z|a-z|0-9]){2}\\.[a-z]{2,3}$", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(Email);
        result = matcher.matches();
        if (result == true)
            System.out.println("Email is valid");
        else
            System.out.println("Email is not valid");



    //validate mobile format
        System.out.println("Enter mobile number : ");
        String Mobile = s.next();
        pattern =Pattern.compile("(?!:\\A|\\s)(?!(\\d{1,6}\\s+\\D)|((\\d{1,2}\\s+){2,2}))(((\\+\\d{1,3})|(\\(\\+\\d{1,3}\\)))\\s*)?((\\d{1,6})|(\\(\\d{1,6}\\)))\\/?(([ -.]?)\\d{1,5}){1,5}((\\s*(#|x|(ext))\\.?\\s*)\\d{1,5})?(?!:(\\Z|\\w|\\b\\s))",Pattern.CASE_INSENSITIVE);
        matcher =pattern.matcher(Mobile);
        result =matcher.matches();
        if(result ==true)
            System.out.println("Mobile number is valid");
        else
                System.out.println("Mobile number is not valid");


        //validating password
        //Rule one minimum 8 characters
        System.out.println("Enter Password: ");
        String password = s.next();
        pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{8,64})",Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(password);
        result = matcher.matches();
        if(result == true)
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");

    }
}