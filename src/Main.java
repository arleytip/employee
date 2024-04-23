import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        app apps = new app();

        System.out.println("What's your name? ");
        apps.name = sc.nextLine();

        System.out.println("What Gross Salary: ");
        apps.gSalary = sc.nextDouble();

        System.out.println("What Tax: ");
        apps.tax = sc.nextDouble();

        System.out.println(apps);

        System.out.println("Which percentage to increase salary? ");
        apps.percentage = sc.nextDouble();

        System.out.println("Update data: " + apps.name +" "+ apps.upSalary());
    sc.close();

    }
}