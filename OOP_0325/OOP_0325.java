package ch01.OOP_0325;

//JAVA中存在就近原则,未触发机制时就近原则，触发机制时优先机制（多态高于就近原则）！！！
//遥控器与电视机理论

//OOP——抽象、继承与多态
// 1、抽象类 -- 部分设计工具
// （1）public abstract class classname{
//  abstract void benchmark();      //不需要写函数体
// 当然其中也可以写有函数体的方法，并用final来决定其是否可以再继承
// }
// 在实现类中，名称一半叫 Impl ，
// e.g        pubilc class StudentImpl extends 抽象类名 { 类体 }


// 2、接口 Interface
// 有Compareable Cloneable等常用接口，用来表示该类有什么属性，是纯设计工具
// 接口内的方法必须在该类中被实现，因为在接口中只有声明
// 多重继承有歧义而多重实现没有歧义。
// e.g public class Person implements Cloneable <Person>{
// ...
// }


// 3、继承 extends
//      1）子类的构造方法中，super(x1,x2,x3)，使用父类的构造函数构造。super需显式调用并需要在构造函数第一行；
//若父类存在默认构造方法，则super可以显式调用
//      2）Overriding覆盖，与Overloading重载不同。
//覆盖指派生类覆盖基类，重载是同一个类中定义函数名相同但签名不同的方法
//覆盖时要求派生类中的函数签名与父类中完全相同，覆盖后想要使用父类方法的方法为super.test()
//      3）java中 返回类型只能缩小 权限大小只能大于父类（父类private 子类public 这不是覆盖，而是一个新的方法）
//      4）子类中成员变量与父类的重名是隐藏不会被覆盖，但重名（函数签名）是覆盖的，只能在类中super访问父类的方法
//      5)Java中的接口也支持继承，利用extend关键字

// 4、多态————方法才会触发多态，而成员变量不会触发多态
//      1）分类：静态多态与动态多态
//      2）接口多态  将部分属性包含在接口中而不是父类中
//  声明一个对象为接口：  Interface t= new InterfaceImpl()   可以简化项目中类的结构
//      3）方法被覆盖后将触发多态，利用电视机（运行期）的内容而不是遥控器（声明期），并符合就近原则！