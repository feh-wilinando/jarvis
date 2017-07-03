package br.com.caelum.jarvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by nando on 24/06/17.
 */
@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot","br.com.caelum.jarvis"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
