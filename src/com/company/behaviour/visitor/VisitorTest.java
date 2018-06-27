package com.company.behaviour.visitor;

import com.company.Test;

import java.util.LinkedList;
import java.util.List;

public class VisitorTest implements Test {

    private List<IComicBook> comicBooks = new LinkedList<>();
    private ComicBookVisitor bookVisitor = new ComicBookVisitor();

    @Override
    public void run(Object type) {
        comicBooks.add(new DCBook());
        comicBooks.add(new DCBook());
        comicBooks.add(new MarvelBook());
        comicBooks.add(new MarvelBook());

        for (IComicBook comicBook: comicBooks) {
            bookVisitor.exportBook(comicBook);
        }
    }
}
