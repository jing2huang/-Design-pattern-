package com.j2h.interpreter;

//抽象表达式类
interface Expression {
    public boolean interpret(String info);
}