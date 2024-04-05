package org.metacog.simplepost;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Book {
    private final String title;
    private final String author;

    public static void main(String[] args) {
        Book book = new Book("Romeo and Juliet", "Shakespeare");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}
