package prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by menghu on 2017/7/2.
 */
@Configuration
@ComponentScan("prepost")
public class PrePostConfig {

    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JSR250BeanWayService jsr250BeanWayService(){
        return new JSR250BeanWayService();
    }
}
