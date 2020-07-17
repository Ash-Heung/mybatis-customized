package com.isiyi.mybatis.excutor;

public interface IsiyiExecutor {
    /**
     * 执行语句
     * @param statement
     * @param param
     * @param <T>
     * @return
     */
    <T> T execute(String statement, Object param);
}
