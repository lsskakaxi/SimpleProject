package singleton;

/**
 * @Auther: lss
 * @Date: 2020/5/30 08:39
 * @Description: (最好的实现方式)
 * jdk针对枚举做了特殊的优化，可以避免反射和序列化获取实例
 */
public enum enumSingleton {

    INSTANCE;

    private class innerClass{

    }
    private  innerClass innerClass =null ;

    private enumSingleton(){
        innerClass = new innerClass();
    }

    public innerClass getInnerClassInstance(){
        return innerClass;
    }
}
