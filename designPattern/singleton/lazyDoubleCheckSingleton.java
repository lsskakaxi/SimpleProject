package singleton;

import java.util.Objects;

/**
 * @Auther: lss
 * @Date: 2020/5/30 08:33
 * @Description: 饿汉式单例(双重校验锁)
 * 问题：无法解决序列化和反射的问题
 */
public class lazyDoubleCheckSingleton {

    private lazyDoubleCheckSingleton(){}

    private static lazyDoubleCheckSingleton INSTANCE = null;

    public static  lazyDoubleCheckSingleton getInstance(){
        //避免多线程访问时阻塞
        if(Objects.isNull(INSTANCE)){
            synchronized (lazyDoubleCheckSingleton.class){
                //避免创建多个实例
                if(Objects.isNull(INSTANCE)){
                    INSTANCE = new lazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
