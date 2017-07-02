package Profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by menghu on 2017/7/2.
 */
public class ProfileTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContext());

        context.close();
    }
}
