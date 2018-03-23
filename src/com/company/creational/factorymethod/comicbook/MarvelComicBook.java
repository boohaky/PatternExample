package com.company.creational.factorymethod.comicbook;

import com.company.creational.factorymethod.ComicTwist;

public class MarvelComicBook extends ComicBook {

    @Override
    public ComicTwist makeTwistAtTheEnd() {
        final ComicTwist comicTwist = new ComicTwist();
        comicTwist.setText("Oh, shit, this is Thanos");
        return comicTwist;
    }
}
