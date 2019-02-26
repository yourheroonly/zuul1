# zuul1
zuul1+eureka+ribbon
spring cloud在使用zuul+eureka+ribbon时，有很多的CSDN介绍，但是大多初学者难以自己形成理解并搭建出来 这个简单的小项目可以帮助进行理解

测试：
1.启动eureka（端口：8761）
2.启动client（端口：8800）
3.启动zuul（端口：8400）
启动后打开浏览器
输入：http://localhost:8400/provider/service/1
输出：hello word！

解释：服务提供在client（名字有点问题），普通访问为：http://localhost:8800/provider/service/1
通过在zuul的resource下的application.yml文件中routes配置中进行了设置进行了代理
以此：访问8400端口地址，zuul会通过ribbon客户端代理请求到8800端口对应服务
