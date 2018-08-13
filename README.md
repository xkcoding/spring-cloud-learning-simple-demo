# Spring cloud 整合 demo 示例

> 这仅仅是一个简单的整合项目 ☺

## 目录结构

```bash
.
├── LICENSE                 开源协议
├── README.md               项目介绍
├── common                  通用部分
├── config-server           config 配置中心
├── doc                     文档/PPT
├── order-service           订单服务
├── proxy                   zuul 网关
├── registry                eureka 注册中心
└── user-service            用户服务
```

## 启动顺序

1. 启动注册中心服务
2. 启动配置中心
3. 启动用户、订单服务
4. 启动zuul网关
5. enjoy ~