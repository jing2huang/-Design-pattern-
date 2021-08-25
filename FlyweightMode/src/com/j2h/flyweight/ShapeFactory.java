package com.j2h.flyweight;

import java.util.HashMap;

/**
 * ��Ԫ������ͼ�ι���=��������ɫ�������Ѵ��ڵ�ֱ�ӷ���
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
