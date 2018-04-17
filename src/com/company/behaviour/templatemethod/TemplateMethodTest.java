package com.company.behaviour.templatemethod;

public class TemplateMethodTest {

    public void run() {
        FileBackup fileBackup = new FileBackup();
        fileBackup.startBackup(true);

        CloudBackup cloudBackup = new CloudBackup();
        fileBackup.startBackup(false);
    }
}
