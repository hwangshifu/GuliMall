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

### 三、引入`spring-cloud-starter-alicloud-oss`后启动报错

**问题**

控制台输出：

```Java
Error creating bean with name 'ossClient' defined in class path resource [com/alibaba/alicloud/context/oss/OssContextAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.aliyun.oss.OSS]: Factory method 'ossClient' threw exception; nested exception is java.lang.IllegalArgumentException: Oss endpoint can't be empty.
```

网上找了一大圈，发现不管用。

**解决**

首先 `dependencyManagement` 中引入：

```Java
            <!--oss依赖-->
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>aliyun-spring-boot-dependencies</artifactId>
                <version>1.0.0</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
```

然后点开`spring-cloud-starter-alicloud-oss` ，看看里面`spring-cloud-alicloud-oss`是不是错，是的话需要在外面的`starter`依赖中把他排除掉。

```Java
<!--oss-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alicloud-oss</artifactId>
            <version>2.2.0.RELEASE</version>
            <exclusions>
                <!--解决oss启动报错 把这个排除掉-->
                <exclusion>
                    <groupId>com.alibaba.cloud</groupId>
                    <artifactId>spring-cloud-alicloud-oss</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
```
### 四、在引入`aliyun-spring-boot-dependencies`后启动报错
**解决**

启动报 `Unsatisfied dependency expressed through field 'ossClient'` 

**解决**

将第三步引入的 `aliyun-spring-boot-dependencies` 注释掉，并且把之前的 `exclusion` 的也注释掉。【问就是不知道 怎么回事】








