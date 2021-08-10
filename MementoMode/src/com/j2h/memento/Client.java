package com.j2h.memento;

public class Client {
    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String args[]) {
        Chessman chess = new Chessman("��", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }

    //���壬ͬʱ���汸��¼
    public static void play(Chessman chess) {
        mc.addMemento(chess.save());
        index++;
        chess.show();
    }

    //���壬��������һ������¼
    public static void undo(Chessman chess, int i) {
        System.out.println("******����******");
        index--;
        chess.restore(mc.getMemento(i - 1));
        chess.show();
    }

    //�������壬�ָ�����һ������¼
    public static void redo(Chessman chess, int i) {
        System.out.println("******��������******");
        index++;
        chess.restore(mc.getMemento(i + 1));
        chess.show();
    }
}
