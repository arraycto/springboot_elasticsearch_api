package com.borgia.es_api.interceptor;
import java.io.Serializable;
import java.util.function.Function;

@FunctionalInterface
public interface ESFunction<T,R> extends Function<T, R>,Serializable {
}
