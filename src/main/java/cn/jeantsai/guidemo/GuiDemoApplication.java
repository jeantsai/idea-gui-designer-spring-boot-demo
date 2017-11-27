package cn.jeantsai.guidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;
import javax.swing.*;

@SpringBootApplication
public class GuiDemoApplication {

	public static void main(String[] args) {
        new SpringApplicationBuilder(GuiDemoApplication.class).headless(false).run(args);
//        SpringApplication.run(GuiDemoApplication.class, args);
	}

    @PostConstruct
    public void startGUI() {
        MainForm.start();
    }
}
