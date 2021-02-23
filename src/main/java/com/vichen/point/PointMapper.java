package com.vichen.point;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author chenyu
 * @date 2021/2/22
 */
@Mapper
@Repository
public interface PointMapper extends BaseMapper<PointDO> {

}
