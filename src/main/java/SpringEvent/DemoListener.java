package SpringEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by menghu on 2017/7/2.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();
        System.out.println("收到消息" + msg);
    }
}
