package prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by menghu on 2017/7/2.
 */
public class JSR250BeanWayService {

    @PostConstruct
    public void myInit(){
        System.out.println("JSR250 init");
    }

    public JSR250BeanWayService(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void myDestory(){
        System.out.println("JSR250 destroy");
    }
}
