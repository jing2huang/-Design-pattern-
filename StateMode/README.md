# 状态模式
对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。  
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/state/state.jpg)

## 模式的结构
* 状态模式包含以下主要角色。  
1、环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。  
2、抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。  
3、具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。  

## 状态模式:设计一个多线程的状态转换程序
多线程存在 5种状态，分别为新建状态、就绪状态、运行状态、阻塞状态和死亡状态，各个状态当遇到相关方法调用或事件触发时会转换到其他状态，其状态转换如图所示(示例来源于C语言编程网设计模式):   
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/state/thread_state_change.jpg)
线程状态转换程序的结构图:  
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/state/state_exapmle.jpg)