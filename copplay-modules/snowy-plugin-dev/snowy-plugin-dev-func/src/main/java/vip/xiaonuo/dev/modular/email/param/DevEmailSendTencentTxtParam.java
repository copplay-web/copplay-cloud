package vip.xiaonuo.dev.modular.email.param;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.json.JSONObject;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 邮件发送——腾讯云TXT参数
 *
 * @author xuyuxiang
 * @date 2022/6/21 15:38
 **/
@Getter
@Setter
public class DevEmailSendTencentTxtParam {

    /** 发件人邮箱 */
    @Schema(description = "管理控制台中配置的发信地址", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "sendAccount不能为空")
    private String sendAccount;

    /** 接收人 */
    @Schema(description = "接收人邮箱地址，多个逗号拼接", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "receiveAccounts不能为空")
    private String receiveAccounts;

    /** 邮件主题 */
    @Schema(description = "邮件主题", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "subject不能为空")
    private String subject;

    /** 邮件正文 */
    @Schema(description = "邮件正文", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "content不能为空")
    private String content;

    /** 发件人昵称 */
    @Schema(description = "发件人昵称")
    private String sendUser;

    /** 附件列表 */
    @Schema(description = "附件列表", hidden = true)
    List<JSONObject> attachmentList = CollectionUtil.newArrayList();
}
