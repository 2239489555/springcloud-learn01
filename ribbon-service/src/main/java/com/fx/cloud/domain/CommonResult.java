package com.fx.cloud.domain;

import lombok.Data;

/**
 * @author 成东日
 * @date 2020/2/9 19:54
 */
@Data
public class CommonResult<T> {
    private T data;
    private String message;
    private Integer code;

    public CommonResult() {
    }

    public CommonResult(T data, String message, Integer code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public CommonResult(String message, Integer code) {
        this(null, message, code);
    }

    public CommonResult(T data) {
        this(data, "操作成功", 200);
    }
}
