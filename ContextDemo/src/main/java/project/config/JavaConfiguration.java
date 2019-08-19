package project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.POJO.ListDefinition.ListItem1;
import project.POJO.ListDefinition.ListItem2;
import project.POJO.ListDefinition.MyJavaList;

@Configuration
public class JavaConfiguration {

    @Bean
    public MyJavaList getMyJavaList() {return new MyJavaList();}

    @Bean
    public ListItem1 getListItem1() {return new ListItem1();}

    @Bean
    public ListItem2 getListItem2() {return new ListItem2();}
}
