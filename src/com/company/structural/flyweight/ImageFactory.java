package com.company.structural.flyweight;

import sun.awt.image.SunVolatileImage;

import java.applet.Applet;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImageFactory {

    private Map<Class<? extends Unit>, Image> unitMap = new HashMap<>();

    private static ImageFactory sImageFactory;

    public synchronized static ImageFactory getInstance() {
        if (sImageFactory == null) {
            sImageFactory = new ImageFactory();
        }
        return sImageFactory;
    }

    public Image getImage(Class<? extends Unit> key) {
        if (!unitMap.containsKey(key)) {
            unitMap.put(key, new SunVolatileImage(new Applet(), 0, 0));
        }
        return unitMap.get(key);
    }
}
