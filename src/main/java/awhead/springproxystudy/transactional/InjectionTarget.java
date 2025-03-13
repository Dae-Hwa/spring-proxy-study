package awhead.springproxystudy.transactional;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class InjectionTarget {

    public static String name = "InjectionTarget";

    @PostConstruct
    protected void postConstruct() {
        name = "InjectionTarget PostConstructed";
    }
}
