package hu.unideb.inf.SpringDataFX;

import hu.unideb.inf.SpringDataFX.frontend.BackendManager;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringBackendManager implements BackendManager {
    private ConfigurableApplicationContext ctx;

    @Override
    public void start() {
        ctx = SpringApplication.run(SpringDataFxApplication.class);
    }

    @Override
    public void stop() {
        ctx.close();
    }

    @Override
    public void print() {
        if ((ctx==null)||(ctx.isClosed())) return;
        ((SpringDataFxApplication)ctx
                .getBean(SpringDataFxApplication.class)).print();
    }
}
