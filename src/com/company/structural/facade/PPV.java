package com.company.structural.facade;

public class PPV {

    public enum ShowQuality {
        MEH,
        GOOD,
        AWEEESOME;
    }

    public PPV() {
        System.out.println("Init all stuff");
    }

    public void execute(ShowQuality quality) {
        StartShow startShow = null;
        UpperCardMatch upperCardMatch = null;
        switch (quality) {
            case MEH:
                startShow = new Show205();
                break;
            case GOOD:
                startShow = new NXTShow();
                break;
            case AWEEESOME:
                startShow = new NXTShow();
                upperCardMatch = new USETitleMath();
                break;
            default:
                throw new IllegalArgumentException("Wrong tag");
        }
        System.out.println("Init all other stuff and execute");
    }

    abstract class PreShow {
    }

    abstract class StartShow {
    }

    class Show205 extends StartShow {
    }

    class NXTShow extends StartShow {
    }

    abstract class UpperCardMatch {
    }

    class USETitleMath extends UpperCardMatch {
    }

    abstract class MainEvent {
    }

}
