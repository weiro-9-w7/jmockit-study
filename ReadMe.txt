
The project will show jmockit some features.

We will show following features :

    1. Mock method, you can refer to com.study.jmockit.cae1.
    2. How to mock static method
    3. How to mock constructor
    4. How to mock constructor with param
    5. How to mock static block
    6. How to mock different return value for a method
    7. How to mock interface without implements (undo)
    8. How to mock exception (undo)
    ...


1.1 常用注解
@Mocked：被修饰的对象将会被Mock，对应的类和实例都会受影响（同一个测试用例中）
@Injectable：仅Mock被修饰的对象
@Capturing：可以mock接口以及其所有的实现类
@Mock：MockUp模式中，指定被Fake的方法

1.2 常用的类
Expectations：期望，指定的方法必须被调用
StrictExpectations：严格的期望，指定方法必须按照顺序调用
NonStrictExpectations：非严格的期望，是否调用和顺序不作要求
Verifications：验证，一般配合NonStrictExpectations来使用
Invocation：工具类，可以获取调用信息
Delegate：自己指定返回值，适合那种需要参数决定返回值的场景，只需指定匿名子类就可以。
MockUp：模拟函数实现
Deencapsulation：反射工具类

Notice:
    Now, There is only jmockit version is 1.7 in inner repository, but the version is older.
When you use the version, some test case can't passed.

    You can download the latest version jar & Using the following command install in local(you can use pom.xml specified version);
        Command:
        mvn install:install-file -DgroupId=thirdparty_lib -DartifactId=jmockit -Dversion=1.36.1 -Dpackaging=jar -Dfile=jmockit-1.36.1.jar
