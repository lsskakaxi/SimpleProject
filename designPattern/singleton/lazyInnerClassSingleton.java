package singleton;

/**
 * @Auther: lss
 * @Date: 2020/5/30 08:40
 * @Description: (只有使用时才加载，线程安全的)
 */
public class lazyInnerClassSingleton {

    private  lazyInnerClassSingleton(){}

    private  static class innerClass{
        private static lazyInnerClassSingleton INSTANCE  = new lazyInnerClassSingleton();
    }

    public static lazyInnerClassSingleton getInstance(){
        return  innerClass.INSTANCE;
    }
}
