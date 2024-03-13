package com.potato.ucenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author potato
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -8609710706649202955L;

    private String userAccount;

    private String userPassword;
}
