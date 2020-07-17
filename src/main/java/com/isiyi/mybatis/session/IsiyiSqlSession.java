package com.isiyi.mybatis.session;

import com.isiyi.mybatis.config.IsiyiConfiguration;
import com.isiyi.mybatis.excutor.IsiyiExecutor;
import com.isiyi.mybatis.mapper.IsiyiMapperProxy;

import java.lang.reflect.Proxy;

public class IsiyiSqlSession {

    private IsiyiConfiguration configuration;

    private IsiyiExecutor executor;

    //关联配置和操作DB的executor
    public IsiyiSqlSession(IsiyiConfiguration configuration, IsiyiExecutor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T getMapper(Class<T> clazz){
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                new IsiyiMapperProxy(this, clazz));
    }

    public <T> T selectOne(String statement, Object param){
        return executor.execute(statement, param);
    }
}
