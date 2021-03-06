package com.monkeyzi.mcloud.common.core.enums;

import lombok.Getter;

/**
 * @author: 高yg
 * @date: 2018/10/11 22:17
 * @qq:854152531@qq.com
 * @blog http://www.monkeyzi.xin
 * @description:
 */
@Getter
public enum ErrorCodeEnum {
    /**
     * 全局
     */
    GL500(500,"系统异常"),
    GL400(400,"Bad request"),
    GL404(404,"资源不存在"),
    GL405(405,"请求方法不支持"),
    GL415(415,"不支持媒体类型"),
    GL401(401,"请登录认证"),
    GL403(403,"抱歉，您没有权限！"),
    GL10001(10001, "参数异常");

    private int code;
    private String msg;
    ErrorCodeEnum(int code, String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 根据code获取枚举
     * @param code
     * @return
     */
   public static ErrorCodeEnum getEnum(int code){
        for (ErrorCodeEnum em:ErrorCodeEnum.values()){
            if (em.code==code){
                return em;
            }
        }
        return null;
   }

}
