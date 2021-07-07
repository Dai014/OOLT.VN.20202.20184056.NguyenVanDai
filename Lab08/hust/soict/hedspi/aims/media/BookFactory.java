package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFactory implements AbstractItemFactory{

    @Override
    public Media createItemFromConsole() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: "); book.setTitle(sc.nextLine());
        System.out.print("Enter category: "); book.setCategory(sc.nextLine());
        System.out.print("Enter Cost: "); book.setCost(sc.nextFloat());
        sc.nextLine();
        List<String> authors = new ArrayList<>();
        System.out.println("Enter Author: ");
        int i = 0;
        while (true){
            System.out.print("author" + (i+1) + ":");
            authors.add(sc.nextLine());
            System.out.print("Continue?(y/n) ");
            if(sc.nextLine().compareTo("y") != 0) break;
            i++;
        }
        book.setAuthors(authors);
        return book;
    }
}
