package se.iths.Uppgifter.Vecka2.Uppgift7;

import java.util.Arrays;

public class Uppgift7 {
    public static void main(String[] args) {
        TextBook book = new TextBook(10);
        book.addPage("Titel: adfgdfgeng");
        book.addPage("Sida 2");
        book.addPage("Sida 3");
        book.addPage("Sida 4");
        book.addPage("Sida 5");
        book.addPage("Sida 6");
        book.addPage("Sida 7");
        book.addPage("Sida 8");
        System.out.println(book.count());
        System.out.println(book.getPage(0));
        String[] strArr = book.getPages(1,6);
        String[] strArr2 = book.getPages();
        String[] strArr3 = book.getPages(4);

        String[] strArr4 = book.getPages(1,book.count()+1);

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArr2));
        System.out.println(Arrays.toString(strArr3));
        System.out.println(Arrays.toString(strArr4));

    }
}
