package com.company.behaviour.templatemethod;

public class CloudBackup extends Backup {


    @Override
    void encode() {
        System.out.println("Cloud encode");
    }

    @Override
    void backup() {
        System.out.println("Backup");
    }

    @Override
    void upload() {
        System.out.println("Upload");
    }
}
