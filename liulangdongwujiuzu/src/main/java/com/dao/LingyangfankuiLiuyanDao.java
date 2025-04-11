package com.dao;

import com.entity.LingyangfankuiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangfankuiLiuyanView;

/**
 * 领养反馈留言 Dao 接口
 *
 * @author 
 */
public interface LingyangfankuiLiuyanDao extends BaseMapper<LingyangfankuiLiuyanEntity> {

   List<LingyangfankuiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
