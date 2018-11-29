package com.company.structural.decorator;


import java.io.File;

public class FileSaver implements IFileSaver {

    private final File file;

    public FileSaver(File file) {
        this.file = file;
    }

    @Override
    public void save() {
        System.out.println("Ratata file is saved: " + file.getName());
    }
}
