package cn.pluss.platform.base.coding.srobot.inf;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.model.vo.CodingRuleVo;

/**
 * 
 * @author liys
 * 2021-02-14 15:25
 *
 */
public interface CodingRobotService {

	Result coding(CodingRuleVo codingRuleVo);

}
