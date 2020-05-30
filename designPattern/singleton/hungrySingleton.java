package singleton;

/**
 * @Auther: lss
 * @Date: 2020/5/30 08:31
 * @Description: 饿汉式单例
 */
public class hungrySingleton {

    private hungrySingleton(){}

    private static final  hungrySingleton  INSTANCE = new hungrySingleton();

    public static hungrySingleton getInstance(){
        return INSTANCE;
    }

}
