/**
 * @Auther: lss
 * @Date: 2020/11/6 14:04
 * @Description: jdk针对枚举做了特殊的优化，可以避免反射和序列化获取实例
 */
public class enumSingletonClass {

    private enumSingletonClass(){

    }

    enum  instance{
        INSTANCE;

        private enumSingletonClass singletonInstance;

        instance(){
            singletonInstance = new enumSingletonClass();
        }

        public enumSingletonClass getInstance(){
            return singletonInstance;
        }

    }

    public static enumSingletonClass getSingletonInstance(){
        return  instance.INSTANCE.getInstance();
    }
}
