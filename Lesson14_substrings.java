import java.util.Scanner;

public class Lesson14_substrings {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        if(email.contains("@")) {
//            String email = "carson@gmail.com";
            String username = email.substring(0, email.indexOf('@')); // end argument is exclusive
            String domain = email.substring(email.indexOf('@') + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Emails must contain @");
        }

        sc.close();
    }
}
