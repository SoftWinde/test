package SpringEvent;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by menghu on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EventConfig.class)
public class EventTest {
    @Autowired
    DemoPublisher demoPublisher;

    @Test
    public void testPublish(){
        demoPublisher.publish("hello world!");
    }
}
