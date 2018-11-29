package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {

    private Map<Class<? extends Unit>, Object> unitMap = new HashMap<>();

    private static ImageFactory sImageFactory;

    public synchronized static ImageFactory getInstance() {
        if (sImageFactory == null) {
            sImageFactory = new ImageFactory();
        }
        return sImageFactory;
    }

    public Object getImage(Class<? extends Unit> key) {
        if (!unitMap.containsKey(key)) {
            unitMap.put(key, new Object());
        }
        return unitMap.get(key);
    }
}
