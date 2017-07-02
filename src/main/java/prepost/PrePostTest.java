package prepost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by menghu on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PrePostConfig.class)
public class PrePostTest {

    @Autowired
    private BeanWayService beanWayService;

    @Autowired
    private JSR250BeanWayService jsr250BeanWayService;

    @Test
    public void sayHello(){
        System.out.println("hello");
    }
}
