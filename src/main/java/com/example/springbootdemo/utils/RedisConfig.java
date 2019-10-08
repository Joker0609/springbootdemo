package com.example.springbootdemo.utils;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.listener.PatternTopic;
//import org.springframework.data.redis.listener.RedisMessageListenerContainer;
//import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
//
//import java.util.concurrent.CountDownLatch;
//

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: redis配置
 * @packname: com.example.springbootdemo.utils
 * @author: wzp
 * @create: 2019-10-08 09:20
 */
//@Configuration
//@EnableCaching
//public class RedisConfig extends CachingConfigurerSupport {
//
//    @Bean
//    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//                                            MessageListenerAdapter listenerAdapter){
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.addMessageListener(listenerAdapter, new PatternTopic("chat"));
//        return container;
//    }
//
//    @Bean
//    MessageListenerAdapter listenerAdapter(Receiver receiver){
//        return new MessageListenerAdapter(receiver,"receiveMessge");
//    }
//
//    @Bean
//    Receiver receiver(CountDownLatch latch){
//        return new Receiver(latch);
//    }
//
//    @Bean
//    CountDownLatch latch() {
//        return new CountDownLatch(1);
//    }
//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory){
//        return new StringRedisTemplate(connectionFactory);
//    }
//
//    public class Receiver {
//
//
//        private CountDownLatch latch;
//
//        @Autowired
//        public Receiver(CountDownLatch latch) {
//            this.latch = latch;
//        }
//
//        public void receiveMessage(String message) {
//            latch.countDown();
//        }
//    }
//}
