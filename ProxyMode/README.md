# 代理模式
给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。  
举个例子说明：假如说我现在想买一辆二手车，虽然我可以自己去找车源，做质量检测等一系列的车辆过户流程，但是这确实太浪费我得时间和精力了。我只是想买一辆车而已为什么我还要额外做这么多事呢？
于是我就通过中介公司来买车，他们来给我找车源，帮我办理车辆过户流程，我只是负责选择自己喜欢的车，然后付钱就可以了。  
注：引入cglib的jar包（https://github.com/cglib/cglib/releases）  

## 静态代理&动态代理
* 静态代理：由程序员创建或特定工具自动生成源代码，再对其编译。在程序运行之前，代理类.class文件就已经被创建
* 动态代理：在程序运行时通过反射机制动态创建代理类。

## JDK动态代理&CGLIB动态代理
* JDK动态代理：基于接口的代理
JDK动态代理中我们不再需要再手动的创建代理类，我们只需要编写一个动态处理器。真正的代理对象由JDK再运行时为我们动态的来创建。  
JDK动态处理器JDKProxyHandler实现InvocationHandler接口  
Proxy.newProxyInstance()是创建代理对象的方法，方法接收三个参数：  
1、ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的   
2、Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型  
3、InvocationHandler:指定动态处理器（JDKProxyHandler），执行目标对象的方法时,会触发事件处理器的方法  

* CGLIB动态代理：基于类的代理（字节类增强的类代理）
GLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。但因为采用的是继承，所以不能对final修饰的类进行代理。    
//Cglib字节码增强器  
Enhancer enhancer = new Enhancer();  
//继承被代理类  
enhancer.setSuperclass(被代理类class);  
//设置回调:回调类CglibProxy实现MethodInterceptor接口  
enhancer.setCallback(new CglibProxy());  
//创建代理类对象  
enhancer.create();  