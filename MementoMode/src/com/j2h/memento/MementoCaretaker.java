package com.j2h.memento;

import java.util.ArrayList;

//�����߽�ɫ
public class MementoCaretaker {

	//����һ���������洢����¼
    private ArrayList<ChessmanMemento> mementolist = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
