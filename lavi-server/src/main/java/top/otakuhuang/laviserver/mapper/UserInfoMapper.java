package top.otakuhuang.laviserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.apache.ibatis.annotations.Mapper;
import top.otakuhuang.laviserver.entity.UserInfo;

/**
 * @author otakuhuang
 * @date 2023/11/28 上午1:21
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    default UserInfo selectByUsername(String username) {
        return selectOne(
                Wrappers.<UserInfo>lambdaQuery()
                        .eq(UserInfo::getUsername, username)
                        .last("LIMIT 1")
        );
    }
}
