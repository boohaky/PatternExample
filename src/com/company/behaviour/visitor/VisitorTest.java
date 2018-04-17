package com.company.behaviour.visitor;

import java.util.LinkedList;
import java.util.List;

public class VisitorTest {

    List<IComicBook> comicBooks = new LinkedList<>();
    ComicBookVisitor bookVisitor = new ComicBookVisitor();


    public void run(){
        comicBooks.add(new DCBook());
        comicBooks.add(new DCBook());
        comicBooks.add(new MarvelBook());
        comicBooks.add(new MarvelBook());

        for (IComicBook comicBook: comicBooks) {
            bookVisitor.exportBook(comicBook);
        }

    }

}
