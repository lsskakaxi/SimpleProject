package singleton;

import java.util.Objects;

/**
 * @Auther: lss
 * @Date: 2020/5/30 08:33
 * @Description: 饿汉式单例(线程不安全)
 */
public class lazySingleton {

    private lazySingleton(){}

    private static  lazySingleton INSTANCE = null;

    public static lazySingleton getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new lazySingleton();
        }
        return INSTANCE;
    }
}
