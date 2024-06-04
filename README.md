## 框架介绍

采用SpringCloud+SpringBoot+MybatisPlus+AntDesignVue+Vite 等更多优秀组件及前沿技术开发，注释丰富，代码简洁，开箱即用！

## 快速启动

全栈工程师推荐idea

### 前端支撑
| 插件 | 版本  | 用途 |
|--- |-----| ----- |
| node.js | ≥18 |  JavaScript运行环境 |

### 启动前端

```
npm install
```
```
npm run dev
```
### 后端支撑
| 插件 | 版本        | 用途 |
| --- |-----------|  ----- |
| jdk | 17        |java环境 |
| lombok | idea内     |代码简化插件 |
| maven | 最新版       |包管理工具 |
| redis | 最新版       | 缓存库 |
| mysql | 8.0 / 5.7 | 数据库 |

### 启动后端
开发工具内配置好maven并在代码中配置数据库，按顺序以此即可启动

|         应用         |       启动类        | 端口号  |
|:------------------:|:----------------:|:----:|
|  snowy-nacos-app   |  SnowyNacosApp   | 8848 |
| snowy-actuator-app | SnowyActuatorApp | 9001 |
| snowy-sentinel-app | SnowySentinelApp | 9002 |
| snowy-gateway-app  | SnowyGatewayApp  | 9003 |
| snowy-xxl-job-app  |  SnowyXxlJobApp  | 9004 |
|   snowy-web-app   |   SnowyWebApp   | 9101 |
|   snowy-biz-app    |   SnowyBizApp    | 9102 |

## 代码结构

Snowy-Cloud3.0框架对代码以插件化的模式进行分包，使得包层级结构更加清晰合理，同时降低了耦合度，关于插件模块化开发的规范请查阅文档【SNOWY-CLOUD开源文档——前端手册or后端手册——开发规范】板块。

```
snowy-cloud
  |-snowy-admin-web == 前端
    |-public == 基础静态文件
    |-src == 前端源代码
      |-api == API接口转发
      |-assets == 静态文件
      |-components == VUE组件
      |-config == 基础配置
      |-layout == 基础布局
      |-locales == 多语言配置
      |-router == 基础路由配置
      |-store == Pinia缓存配置
      |-style == 样式风格配置
      |-utils == 工具类
      |-views == 所有视图界面
  |-snowy-base == 基础组件
    |-snowy-common == 基础通用模块
  |-snowy-modules == 应用组件
    |-snowy-biz-app == 业务应用模块
    |-snowy-web-app == 主应用模块
  |-snowy-plugin == 插件组件
    |-snowy-plugin-auth == 登录鉴权插件
        |-snowy-plugin-auth-api == 登录鉴权插件api接口
        |-snowy-plugin-auth-feign == 登录鉴权插件feign接口
        |-snowy-plugin-auth-func == 登录鉴权插件func实现
    |-snowy-plugin-biz == 业务功能插件
        |-snowy-plugin-biz-api == 业务功能插件api接口
        |-snowy-plugin-biz-func == 业务功能插件func实现
    |-snowy-plugin-client == C端功能插件
        |-snowy-plugin-client-api == C端功能插件api接口
        |-snowy-plugin-client-func == C端功能插件func实现
    |-snowy-plugin-dev == 开发工具插件
        |-snowy-plugin-dev-api == 开发工具插件api接口
        |-snowy-plugin-dev-feign == 开发工具插件feign接口
        |-snowy-plugin-dev-func == 开发工具插件func实现
    |-snowy-plugin-gen == 代码生成插件
        |-snowy-plugin-gen-api == 代码生成插件api接口
        |-snowy-plugin-gen-func == 代码生成插件func实现
    |-snowy-plugin-sys == 系统功能插件
        |-snowy-plugin-sys-api == 系统功能插件api接口
        |-snowy-plugin-sys-feign == 系统功能插件feign接口
        |-snowy-plugin-sys-func == 系统功能插件func实现
    |-snowy-plugin-mobile == 移动端管理插件
        |-snowy-plugin-mobile-api == 移动端管理插件api接口
        |-snowy-plugin-mobile-func == 移动端管理插件func实现
  |-snowy-server == 服务组件
    |-snowy-actuator-app == 监控服务模块
    |-snowy-gateway-app == 网关服务模块
    |-snowy-nacos-app == 注册中心/配置中心模块
    |-snowy-sentinel-app == 限流服务模块
    |-snowy-xxl-job-app == 分布式任务调度服务模块

```


## 分支说明

- master

稳定分支：一般会定期发布，保证稳定性，不保证运行和使用

- dev

开发分支: 用于新功能的集成开发测试

- fix/编号+名称

修复分支：用于解决bug，目前编号为当前日志，名称为功能英文

- feat/编号+名称

新功能分支：用于新功能的开发，目前编号为当前日志，名称为功能英文
