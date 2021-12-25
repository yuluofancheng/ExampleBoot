# SkyWalking 特点

- 多语言自动探针，支持 Java、.NET Code 等多种语言。
- 为多种开源项目提供了插件，为 Tomcat、 HttpClient、Spring、RabbitMQ、MySQL 等常见基础设施和组件提供了自动探针。
- 微内核 + 插件的架构，存储、集群管理、使用插件集合都可以进行自由选择。
- 支持告警。
- 优秀的可视化效果。

# 启动

## 启动SkyWalking 服务端

```bash
#数据保存在内存中， 容器重启数据会丢失。
docker run --name skywalking --restart always -d \
-e TZ=Asia/Shanghai \
-p 11800:11800  \
-p 12800:12800  \
apache/skywalking-oap-server:8.8.1
```

## 启动UI

```bash
docker run --name skywalking-ui --restart always -d \
-e TZ=Asia/Shanghai \
--link skywalking:skywalking \
-p 8080:8080 \
-e SW_OAP_ADDRESS=http://skywalking:12800 \
apache/skywalking-ui
```

> 通过浏览器访问UI, http://xxxx:8080

# 服务接入监控

下载agent , 下载地址： https://skywalking.apache.org/downloads/ 

项目启动命令中，加入agent 

- idea启动，加入VM命令：-javaagent:./example-skywalking/skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=skywalking-demo -Dskywalking.collector.backend_service=127.0.0.1:11800
- jar 命令启动，加入命令，跟上面一样。



