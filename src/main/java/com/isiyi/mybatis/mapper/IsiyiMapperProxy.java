package com.isiyi.mybatis.mapper;

import com.isiyi.mybatis.session.IsiyiSqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * maper的代理对象
 */
public class IsiyiMapperProxy<T> implements InvocationHandler {
    /**
     * 为什么final: 因为赋值一次，希望以后不被改变
     * @param isiyiSqlSession
     * @param clazz
     * @param <T>
     */
    private final IsiyiSqlSession isiyiSqlSession;
    private final Class<T> clazz;
    public IsiyiMapperProxy(IsiyiSqlSession isiyiSqlSession, Class<T> clazz) {
        this.isiyiSqlSession = isiyiSqlSession;
        this.clazz = clazz;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
