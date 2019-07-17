package com.tamboot.cloud.admin.systemapp;

import com.tamboot.cloud.admin.security.core.RoleBasedPermissionInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableFeignClients
@EnableTransactionManagement
@MapperScan("com.tamboot.cloud.admin.systemapp.*.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.addListeners(new RoleBasedPermissionInitializer());
        app.run();
    }
}
