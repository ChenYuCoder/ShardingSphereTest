package com.vichen.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author chenyu
 * @date 2021/2/22
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
