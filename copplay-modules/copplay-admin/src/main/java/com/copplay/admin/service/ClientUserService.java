package com.copplay.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.copplay.admin.domain.ClientUser;
import com.copplay.admin.web.param.ClientUserAddParam;
import com.copplay.admin.web.param.ClientUserEditParam;
import com.copplay.admin.web.param.ClientUserIdParam;
import com.copplay.admin.web.param.ClientUserPageParam;
import com.copplay.admin.web.result.ClientLoginUser;

import java.util.List;

/**
 * C端用户Service接口
 *
 * @author xuyuxiang
 * @date 2022/4/21 18:35
 **/
public interface ClientUserService extends IService<ClientUser> {

    /**
     * 根据id获取用户信息，查不到则返回null
     *
     * @author xuyuxiang
     * @date 2022/4/27 21:38
     */
    ClientLoginUser getUserById(String id);

    /**
     * 根据账户获取用户信息，查不到则返回null
     *
     * @author xuyuxiang
     * @date 2022/4/27 21:38
     */
    ClientLoginUser getUserByAccount(String account);

    /**
     * 根据手机号获取用户信息，查不到则返回null
     *
     * @author xuyuxiang
     * @date 2022/4/27 21:38
     */
    ClientLoginUser getUserByPhone(String phone);

    /**
     * 根据邮箱获取用户信息，查不到则返回null
     *
     * @author xuyuxiang
     * @date 2022/4/27 21:38
     */
    ClientLoginUser getUserByEmail(String email);

    /**
     * 获取C端用户分页
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:08
     */
    Page<ClientUser> page(ClientUserPageParam clientUserPageParam);

    /**
     * 添加C端用户
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:48
     */
    void add(ClientUserAddParam clientUserAddParam);

    /**
     * 编辑C端用户
     *
     * @author xuyuxiang
     * @date 2022/4/24 21:13
     */
    void edit(ClientUserEditParam clientUserEditParam);

    /**
     * 删除C端用户
     *
     * @author xuyuxiang
     * @date 2022/4/24 21:18
     */
    void delete(List<ClientUserIdParam> clientUserIdParamList);

    /**
     * 获取C端用户详情
     *
     * @author xuyuxiang
     * @date 2022/4/24 21:18
     */
    ClientUser detail(ClientUserIdParam clientUserIdParam);

    /**
     * 更新C端用户的登录时间和登录ip等信息
     *
     * @author xuyuxiang
     * @date 2022/4/27 22:58
     */
    void updateUserLoginInfo(String userId, String device);

    /**
     * 获取C端用户详情
     *
     * @author xuyuxiang
     * @date 2022/4/24 21:18
     */
    ClientUser queryEntity(String id);
}
