package com.company.behaviour.visitor;

public class ComicBookVisitor {

    public void exportDCBook() {
        System.out.println("Export Batman");
    }


    public void exportMarvelBook() {
        System.out.println("Export Spider-man");
    }

    public void exportBook(IComicBook comicBook) {
        if (comicBook instanceof DCBook) {
            exportDCBook();
        } else if (comicBook instanceof MarvelBook) {
            exportMarvelBook();
        }
    }
}
