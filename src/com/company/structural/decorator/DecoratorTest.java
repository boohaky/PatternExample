package com.company.structural.decorator;

import com.company.Test;

import java.io.File;

public class DecoratorTest implements Test<File> {

    @Override
    public void run(File file) {
        final FileSaver fileSaver = new FileSaver(file);
        final EncyptionDecorator decorator = new EncyptionDecorator(fileSaver);
        decorator.save();
    }
}
