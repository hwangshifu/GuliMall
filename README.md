# GuliMall
## Guli Mall Note

### 一、在引入feign客户端，服务启动的时候报错决方案及解决思路

启动报错：`No Feign Client for loadBalancing defined. Did you forget to include spring-cloud-starter-loadbalanc？`

**解决**

没有loadbalanc 但是`nacos`中ribbon会造成loadbalanc包失效，在`nacos`排除关联依赖：`ribbon`，并引入：`spring-cloud-loadbalancer `依赖

```java
        <!--服务注册与发现-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <!--openFeign启动异常  -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-loadbalancer</artifactId>
            <version>3.1.3</version>
        </dependency>
```
### 二、Nacos配置中心不起作用解决方案及解决思路
**问题**

按照官方步骤新建`bootstrap.properties`，添加了`@Value`和`@RefreshScope`注解，并且也在`nacos`中按照步骤新建了配置。但是当我修改时，发现配置中心始终不起作用。

**原因**

`bootstrap.properties` 没有起作用，通过添加依赖即可。

```Java
      	<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bootstrap</artifactId>
            <version>3.0.4</version>
        </dependency>
```