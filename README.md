本周作业


##### 修复本程序 org.geektimes.reactive.streams 包下

调整了以下代码
`DefaultPublisher.publish``
```
            // 判断当前 subscriber 是否 cancel 数据发送
            if (subscription.isCanceled()) {
                System.err.println("本次数据发布已忽略，数据为：" + data);
                return;
            }

            // 继续发送
            subscriber.onNext(data);

            if (subscription.isCanceled()) {
                System.err.println("本次数据发布已忽略，数据为：" + data);
            }
```



##### 继续完善 my-rest-client POST 方法

增加了 `HttpPostInvocation` 类

`RestClientDemo.main`
中增加测试
```
        // post
        Client client2 = ClientBuilder.newClient();
        Response response2 = client
                .target("http://127.0.0.1:8080/hello")      // WebTarget
                .request() // Invocation.Builder
                .post(Entity.entity("{\"q1\":1,\"q2\":2}",
                        new Variant(new MediaType("text", "plain"), "en", "UTF-8")));                                     //  Response
        String content2 = response2.readEntity(String.class);
        System.out.println(content2);
```

user-web 增加了 `HelloPostController` 类，接收返回post请求













