package com.j2h.flyweight;

import java.util.HashMap;

/**
 * 享元工厂：图形工厂=》根据颜色生产，已存在的直接返回
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> map = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);
        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
