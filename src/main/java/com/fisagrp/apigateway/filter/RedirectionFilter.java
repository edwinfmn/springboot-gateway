package com.fisagrp.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class RedirectionFilter extends AbstractGatewayFilterFactory<RedirectionFilter.RedirectionFilterConfig> {

    final Logger logger = LoggerFactory.getLogger(RedirectionFilter.class);

    @Override
    public GatewayFilter apply(RedirectionFilterConfig config) {
        logger.info("Inside Redirection Filter - Config: " + config);
        return null;
    }

    @Override
    public GatewayFilter apply(String routeId, RedirectionFilterConfig config) {
        logger.info("Inside Redirection Filter - RouteID: " + routeId);
        return super.apply(routeId, config);
    }

    public static class RedirectionFilterConfig {

    }
}
