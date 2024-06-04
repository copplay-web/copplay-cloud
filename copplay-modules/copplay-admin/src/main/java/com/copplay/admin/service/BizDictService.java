package com.copplay.admin.service;

import cn.hutool.core.lang.tree.Tree;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.copplay.admin.domain.BizDict;
import com.copplay.admin.web.param.BizDictEditParam;
import com.copplay.admin.web.param.BizDictPageParam;

import java.util.List;

/**
 * 业务字典Service接口
 *
 * @author xuyuxiang
 * @date 2022/4/22 10:41
 **/
public interface BizDictService extends IService<BizDict> {

    /**
     * 获取业务字典分页
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:08
     */
    Page<BizDict> page(BizDictPageParam bizDictPageParam);

    /**
     * 获取业务字典树
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:08
     */
    List<Tree<String>> tree();

    /**
     * 获取所有字典树
     *
     * @author xuyuxiang
     * @date 2022/4/24 20:08
     */
    List<Tree<String>> treeAll();

    /**
     * 编辑业务字典
     *
     * @author xuyuxiang
     * @date 2022/4/24 21:13
     */
    void edit(BizDictEditParam bizDictEditParam);

    /**
     * 获取业务字典详情
     *
     * @author xuyuxiang
     * @date 2022/4/24 21:18
     */
    BizDict queryEntity(String id);
}
