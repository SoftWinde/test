package el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by menghu on 2017/7/2.
 */
public class ElTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();
        context.close();
    }
}
