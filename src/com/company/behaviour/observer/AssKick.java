package com.company.behaviour.observer;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AssKick {

    public interface AssKickingListener {

        void onAssKicked(String message);
    }

    private List<AssKickingListener> kickingListeners;

    public AssKick() {
        kickingListeners = new ArrayList<>();
    }

    public void startKickingAss() {
        System.out.print("PREPARE YOUR ASS!");
        for (AssKickingListener listener : kickingListeners) {
            listener.onAssKicked("YOUR ASS IS MINE!!");
        }
    }

    void addAssListener(@NotNull AssKickingListener listener) {
        kickingListeners.add(listener);
    }

    void removeAssListener(@NotNull AssKickingListener listener) {
        kickingListeners.remove(listener);
    }

}
