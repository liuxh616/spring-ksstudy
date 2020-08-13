## 常用依赖
'''xml
 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.8.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
        </dependency>
'''
##注解说明
- @Autowried:自动装配通过类型、名字
  如果Autowried不能唯一自动装配上属性，则需要通过@Qualifier(value="***")
- @Nullable :字段表示了这个注解，说明这个字段可以为null;
- @Resource: 自动装配通过名称、类型
- @Component:组件，放在类上的注解，说明这个类被Spring管理了，就是一个bean
 