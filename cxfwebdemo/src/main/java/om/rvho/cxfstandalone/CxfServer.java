package om.rvho.cxfstandalone;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.rvho.cxfstandalone.ws.HelloWS;
import com.rvho.cxfstandalone.ws.impl.HelloWSImpl;

public class CxfServer {

    public static void main(String[] args) {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWS.class);
        //服务发布的地址
        factory.setAddress("http://localhost:8081/services/hello");
        factory.setServiceBean(new HelloWSImpl());
        factory.create();
    }

}
