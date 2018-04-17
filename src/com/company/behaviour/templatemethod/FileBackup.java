package com.company.behaviour.templatemethod;

public class FileBackup extends Backup {

    @Override
    void encode() {
        System.out.println("File encode");
    }

    @Override
    void backup() {
        System.out.println("File backup");
    }
}
