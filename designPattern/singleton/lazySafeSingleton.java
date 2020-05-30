package singleton;

import java.util.Objects;

/**
 * @Auther: lss
 * @Date: 2020/5/30 08:33
 * @Description: 饿汉式单例(线程安全，但是多并发时效率低)
 */
public class lazySafeSingleton {

    private lazySafeSingleton(){}

    private static lazySafeSingleton INSTANCE = null;

    public static synchronized lazySafeSingleton getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new lazySafeSingleton();
        }
        return INSTANCE;
    }
}
