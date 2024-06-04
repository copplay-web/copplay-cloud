package com.copplay.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.copplay.admin.domain.GenConfig;
import com.copplay.admin.web.param.GenConfigEditParam;
import com.copplay.admin.web.param.GenConfigIdParam;
import com.copplay.admin.web.param.GenConfigListParam;

import java.util.List;

/**
 * 代码生成详细配置配置Service接口
 *
 * @author yubaoshan
 * @date 2022/10/25 22:33
 **/
public interface GenConfigService extends IService<GenConfig> {

    /**
     * 查询代码生成详细配置列表
     *
     * @author yubaoshan
     * @date 2022/10/25 22:33
     */
    List<GenConfig> list(GenConfigListParam genConfigListParam);

    /**
     * 编辑代码生成详细配置
     *
     * @author yubaoshan
     * @date 2022/10/25 22:33
     */
    void edit(GenConfigEditParam genConfigEditParam);

    /**
     * 删除代码生成详细配置
     *
     * @author yubaoshan
     * @date 2022/10/25 22:33
     */
    void delete(List<GenConfigIdParam> genConfigIdParamList);

    /**
     * 获取代码生成详细配置详情
     *
     * @author yubaoshan
     * @date 2022/10/25 22:33
     */
    GenConfig detail(GenConfigIdParam genConfigIdParam);

    /**
     * 获取代码生成详细配置详情
     *
     * @author yubaoshan
     * @date 2022/10/25 22:33
     **/
    GenConfig queryEntity(String id);

    /**
     * 批量编辑代码生成详细配置
     *
     * @author xuyuxiang
     * @date 2022/10/28 13:49
     **/
    void editBatch(List<GenConfigEditParam> genConfigEditParamList);
}
