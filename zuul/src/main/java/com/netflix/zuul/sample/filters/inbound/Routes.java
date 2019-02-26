package com.netflix.zuul.sample.filters.inbound;

import com.netflix.zuul.context.SessionContext;
import com.netflix.zuul.filters.http.HttpInboundSyncFilter;
import com.netflix.zuul.message.http.HttpRequestMessage;
import com.netflix.zuul.netty.filter.ZuulEndPointRunner;

public class Routes extends HttpInboundSyncFilter {
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter(HttpRequestMessage httpRequestMessage) {
        return true;
    }

    @Override
    public HttpRequestMessage apply(HttpRequestMessage request) {
        SessionContext context = request.getContext();
        context.setEndpoint(ZuulEndPointRunner.PROXY_ENDPOINT_FILTER_NAME);
//        context.set(CommonContextKeys.USE_FULL_VIP_NAME, true);
        // https://github.com/Netflix/zuul/issues/444
        context.setRouteVIP("api");
        System.out.println("clientRoutes---12312312");
        return request;
    }

}
