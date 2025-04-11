package com.dao;

import com.entity.LingyangfankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangfankuiView;

/**
 * 领养反馈 Dao 接口
 *
 * @author 
 */
public interface LingyangfankuiDao extends BaseMapper<LingyangfankuiEntity> {

   List<LingyangfankuiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
