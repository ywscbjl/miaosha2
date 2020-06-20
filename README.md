# miaosha2
秒杀系统2.0版

缓存，异步，批处理。

在原版功能上进行性能优化。

使用nginx反向代理进行分布式扩展。

使用redis集中式缓存，本地热点数据(guava)缓存，nginx shared dic共享内存字典缓存等多级缓存来优化查询操作

将动态页面静态化，路由到cdn内

使用redis缓存库存，解决交易问题。使用rocketmq异步化事务型消息，保证最终一致性。

引入秒杀令牌，秒杀大闸，队列泄洪实现流量削峰。

使用验证码技术，限流防刷技术来保护系统免于过载

