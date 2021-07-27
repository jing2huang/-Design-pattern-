# 工厂方法模式
工厂方法模式是对简单工厂模式的进一步抽象化，其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。  

## 模式的结构
* 工厂方法模式的主要角色  
抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。  
具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。  
抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。  
具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。  

## 简单工厂、工厂方法、抽象工厂的区别  
* 简单工厂  
简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例  
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/factory/SimpleFactory.jpg)
* 工厂方法  
工厂方法是针对每一种产品提供一个工厂类。通过不同的工厂实例来创建不同的产品实例（例：手机工厂MIPhoneFactory负责生产小米手机，华为HWPhoneFactory负责生产华为手机）  
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/factory/FactoryMethod.jpg)
* 抽象工厂  
用来生产不同产品族的全部产品(例如：小米的工厂MIFactory可以生产小米产品族的所有产品[手机、电脑、平板]，华为的工厂HWFactory可以生产华为产品族内的所有产品)    
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/factory/AbstractFactory.jpg)