package SpringEvent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by menghu on 2017/7/2.
 */
public class DemoEvent extends ApplicationEvent{

    private static final long serialVersionUID = 1l;

    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
