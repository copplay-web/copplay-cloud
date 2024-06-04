package vip.xiaonuo.auth.modular.sso.service.impl;

import org.springframework.stereotype.Service;
import vip.xiaonuo.auth.modular.login.service.AuthService;
import vip.xiaonuo.auth.modular.sso.param.AuthSsoTicketLoginParam;
import vip.xiaonuo.auth.modular.sso.service.AuthSsoService;

import jakarta.annotation.Resource;

/**
 * 单点登录Service接口实现类
 *
 * @author xuyuxiang
 * @date 2022/8/30 9:21
 **/
@Service
public class AuthSsoServiceImpl implements AuthSsoService {

    @Resource
    private AuthService authService;

    @Override
    public String doLogin(AuthSsoTicketLoginParam authAccountPasswordLoginParam, String device) {
        return null;
    }
}
