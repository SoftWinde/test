package prepost;

/**
 * Created by menghu on 2017/7/2.
 */
public class BeanWayService {
    private void myInit(){
        System.out.println("init");
    }

    public BeanWayService(){
        System.out.println("初始化");
    }

    private void myDestroy(){
        System.out.println("destory");
    }
}
