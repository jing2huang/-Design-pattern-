package com.j2h.command;

//调用者/请求者（Invoker）角色：键盘发送命令
public class Keypad {
	private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;
    
    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play(){
        playCommand.execute();
    }

    public void rewind(){
        rewindCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }
}
