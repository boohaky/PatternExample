package com.company.creational.factorymethod;

import com.company.Test;
import com.company.creational.factorymethod.comicbook.ComicBook;

public class FactoryMethodTest implements Test<ComicBook> {

    public void run(ComicBook comicBook) {
        int pageCount = comicBook.getPageCount();
        ComicTwist twist = comicBook.makeTwistAtTheEnd();
        System.out.println(twist.getText());
    }
}
