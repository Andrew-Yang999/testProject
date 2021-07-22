package org.andrew.testProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Andrew Yang
 * @ClassName MainApplication
 * @Description
 * @Package org.andrew.testProject
 * @Create 2021-07-14 11:29
 */
@SpringBootApplication(scanBasePackages = "org.andrew.testProject")
public class MainApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(MainApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
