package vp.organization;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.SerializationConfig;
import org.glassfish.jersey.server.ResourceConfig;
import vp.profile.KeyData;

/**
 * Created by mrahman on 2/16/16.
 */
public class CompanyApplication extends ResourceConfig {

    public CompanyApplication(KeyData keyData) {
        JacksonJsonProvider json = new JacksonJsonProvider().
                configure(SerializationConfig.Feature.AUTO_DETECT_GETTERS.WRITE_DATES_AS_TIMESTAMPS, false);
        packages("vp.profile");
        register(KeyData.class);
        register(json);
    }

}
