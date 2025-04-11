package com.dao;

import com.entity.LingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangView;

/**
 * 流浪动物领养 Dao 接口
 *
 * @author 
 */
public interface LingyangDao extends BaseMapper<LingyangEntity> {

   List<LingyangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
