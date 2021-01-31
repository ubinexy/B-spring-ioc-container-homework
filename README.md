主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

答：

Spring 框架在初始化时，被 @Component 注解的类会在扫描默认路径时，
会隐式地向 IoC 容器创建和配置 Bean。

@Bean 注解在方法上，通常和 @Configuration 注解搭配。
使用时需要显示创建和配置 Bean 实例，因此更加灵活。

