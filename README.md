# myshop-cloud-alibaba
基于Spring Cloud Alibaba开发的分布式商城系统-技术学习与集成

开发坏境：
    操作系统：Win10
    开发工具：Intellij IDEA
    数据库：maql5.7.20
    java SDK :Oracle JDk 1.8
部署:
    CentOS 7
    虚拟化技术：VmWare+Docker

项目管理构建构建：
    项目构建：Maven+Nexus
    代码管理：GitHub

后后端主要技术栈：
    核心框架：SpringBoot + Spring Cloud Alibaba
    ORM框架：tkMybatis 简化 Mybatis
    数据库连接池：Alibaba Druid
    数据库缓存：Redis
    消息中间件：RocketMQ
    接口文档：Swagger2 Restful风格
    分布式系统网关：Spring Cloud GateWay
    分布式注册中心（协调）：Spring Cloud Alibaba Nacos
    分布式配置中心：Spring Cloud Config
    分布式熔断降级：Spring Cloud Sentinel
    负载均衡：Nginx
前后分离：
    前端框架：NodeJS+Vue+Axios
    前端模板：ElementUI
持续集成：GitLab
持续交付：Jenkins