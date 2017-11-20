package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Springfox Swagger configuration. This class would be auto-detected (because of the @Configuration) and
 * configures Swagger 2 basic settings.
 * Take care about the root-scan package for Swagger annotations in customImplementation() -> apis(...).
 *
 * Have a look at @{@link de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.swagger.Swagger2SpringBoot} - this is the main boot
 * class.
 */
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("QAcoffee API")
            .description("API for evaluating coffee at QAware.")
            .version("1.0.0")
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo());
    }

}
