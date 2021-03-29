package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;
import org.geektimes.web.mvc.controller.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloPostController implements RestController {

    @POST
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "{\"a\":1, \"b\":2}";
    }
}
