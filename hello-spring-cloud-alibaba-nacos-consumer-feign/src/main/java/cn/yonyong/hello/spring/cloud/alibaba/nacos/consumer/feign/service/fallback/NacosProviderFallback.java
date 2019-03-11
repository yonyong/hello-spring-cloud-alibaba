package cn.yonyong.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import cn.yonyong.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

@Component
public class  NacosProviderFallback implements NacosProviderService {
    @Override
    public String echo(String message) {
        return "请求失败，请检查你的网络！";
    }
}