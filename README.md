# springcloud-nacos-dubbo
本项目是搭建基于nacos注册中心的springcloud，集成dubbo框架，使用zuul网关和gateway网关

<br/>
1、项目结构

micro-service  服务提供者

zuul-gateway  zuul网关

springcloud-gateway  gateway网关

class-provider  duboo提供者

user-provider  duboo提供者

duboo-consumer  duboo消费者

dubbo-interface  duboo接口api

 
<br/>
2、环境

nacos 1.4.1

springboot 2.1.9

springcloud Greenwich

dubbo  2.7.6

<br/>
3、项目nacos地址

127.0.0.1:8848

<br/>
4、需要注意的地方

consumer先启动，provider后启动无法发现问题，在版本spring-cloud-starter-dubbo 2.2.4.RELEASE已经解决了。

provider重启后，consumer无法自动发现provider，官方还没有给出明确的解决时间。

所以每次重启provider，都要把consumer重启一遍才能访问，dubbo程序启动要有顺序
