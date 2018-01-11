package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.Info;
import io.swagger.models.Swagger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Bootstrap extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Info info = new Info()
                .title("Swagger Server")
                .description("API for evaluating coffee at QAware.");

        ServletContext context = config.getServletContext();
        Swagger swagger = new Swagger().info(info);

        new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
    }
}
