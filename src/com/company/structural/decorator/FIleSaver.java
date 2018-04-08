package com.company.structural.decorator;

import com.sun.istack.internal.NotNull;

import java.io.File;

public class FIleSaver implements IFileSaver {

    private final File file;

    public FIleSaver(@NotNull File file) {
        this.file = file;
    }

    @Override
    public void save() {
        System.out.println("Ratata file is saved: " + file.getName());
    }
}
