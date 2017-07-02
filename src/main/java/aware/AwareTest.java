package aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import prepost.JSR250BeanWayService;

/**
 * Created by menghu on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= Config.class)
public class AwareTest {

    @Autowired
    private AwareService awareService;

    @Test
    public void sayHello(){
        awareService.outputResult();
    }
}
