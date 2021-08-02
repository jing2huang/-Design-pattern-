package com.j2h.observer.other_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//目标类（主题）：事件源
public class BellEventSource {
	//监听器容器
	private List<BellEventListener> listeners;

	public BellEventSource() {
		listeners = new ArrayList<>();
	}

	//事件源绑定监听器
	public void registerEventListener(BellEventListener listener) {
		listeners.add(listener);
	}

	//事件触发器
    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        //通知注册在该事件源上的所有监听器
        notifies(event);
    }

    protected void notifies(RingEvent e) {
        BellEventListener listener = null;
        Iterator<BellEventListener> iterator = listeners.iterator();
        while (iterator.hasNext()) {
        	listener = iterator.next();
        	listener.heardBell(e);
        }
    }
}