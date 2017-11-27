package demo.springboot.microservicerestendpoints.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;

@Component
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig{
    private ApplicationContext applicationContext;

    @Autowired
    public JerseyConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void setUp() {
        this.applicationContext.getBeansWithAnnotation(Path.class)
                .forEach((beanName, bean) -> register(bean));
    }
}
