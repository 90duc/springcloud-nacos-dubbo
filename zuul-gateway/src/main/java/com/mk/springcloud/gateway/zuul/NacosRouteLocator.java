package com.mk.springcloud.gateway.zuul;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class NacosRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {


    public NacosRouteLocator(ServerProperties serverProperties, ZuulProperties properties) {
        super(serverProperties.getServlet().getContextPath(), properties);
    }

    @Override
    public void refresh() {
        doRefresh();
    }
    @Override
    protected Map<String, ZuulProperties.ZuulRoute> locateRoutes() {

        //默认从配置文件中加载路由信息
        //return super.locateRoutes());

        //定制路由, 可以使用nacos的配置管理进行路由
        Map<String, ZuulProperties.ZuulRoute> routesMap = new LinkedHashMap<>();
        ZuulProperties.ZuulRoute zuulRoute = new ZuulProperties.ZuulRoute();
        zuulRoute.setId("micro-service");
        zuulRoute.setPath("/micro-service/**");
        zuulRoute.setServiceId("micro-service");
        routesMap.put(zuulRoute.getPath(), zuulRoute);

        return routesMap;
    }



}
