package demo.springboot.microservicerestendpoints.endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component
@Path("/helloworld")
public class HelloWorld {

    @Value("${server.user.name}")
    private String userName;

    @GET
    @Path("/")
    public Response sayHello() {
        return Response.ok("Hello World!!" + userName).build();
    }
}
