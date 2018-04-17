package com.company.behaviour.templatemethod;

public abstract class Backup {

    void startBackup(boolean encodeFirst) {
        if (encodeFirst) {
            encode();
        }
        backup();
        archive();
        upload();
    }

    abstract void encode();

    abstract void backup();

    void archive() {

    }

    void upload() {

    }

}
