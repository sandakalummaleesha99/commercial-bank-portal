package commercial_bank_portal.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
    }

    @Bean(name = "bankTransfer")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setPortTypeName("bankTransfer");
        defaultWsdl11Definition.setLocationUri("/ws");
        defaultWsdl11Definition.setTargetNamespace("http://www.commercialbankportal.com/bankTransfer");
        defaultWsdl11Definition.setSchema(schema);
        return defaultWsdl11Definition;

    }

    @Bean
    public XsdSchema schema() {
        return new SimpleXsdSchema(new ClassPathResource("bankTransfer.xsd"));
    }
}
