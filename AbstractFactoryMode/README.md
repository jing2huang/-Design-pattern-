# 抽象工厂模式
用来生产不同产品族的全部产品(例如：小米的工厂MIFactory可以生产小米产品族的所有产品[手机、电脑、平板]，华为的工厂HWFactory可以生产华为产品族内的所有产品)    
![Image text](https://github.com/jing2huang/DesignPattern/blob/main/images/factory/AbstractFactory.jpg)

## 介绍  
抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。  这些其他工厂是具体的工厂，由他们再各自生产具体的产品。  
抽象工厂模式中存在四种角色，分别是抽象工厂角色，具体工厂角色，抽象产品角色，具体产品角色。  
个人对抽象工厂的理解就是在简单工厂的基础之上，对工厂又进行了一层抽象和扩展（单一工厂到多样化工厂），对多个简单工厂进行了统一管理  

## 反射+简单工厂模式优化抽象工厂模式    
使用简单工厂来改进抽象工厂。去除DBFactory、MySQLFactory、OracleFactory三个工厂类，用一个DBDaoFactory类代替，  简单工厂通过使用反射屏蔽了客户端需要指定具体访问的数据源  
（之前客户端这样指定：DBFactory mFactory = new MysqlFactory()）  ，现在的客户端（DBDaoFactory.createUserDao()）并不清楚最终要访问的是哪个数据源。