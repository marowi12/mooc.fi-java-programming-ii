//Write a program that reads user input for books and their age recommendations.
//The program asks for new books until the user gives an empty String (only presses enter). 
//After this, the program will print the number of books, their names, and their recommended ages.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int bookAge = Integer.valueOf(scanner.nextLine());
            list.add(new Book(bookName, bookAge));

            System.out.println();
        }

        System.out.println("");

        System.out.println(list.size() + " books in total. \n");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getBookAge)
                .thenComparing(Book::getBookName);

        Collections.sort(list, comparator);

        list.stream()
                .forEach(System.out::println);
    }

}
