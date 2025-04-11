package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.LiulangdongwuLiuyanDao;
import com.entity.LiulangdongwuLiuyanEntity;
import com.service.LiulangdongwuLiuyanService;
import com.entity.view.LiulangdongwuLiuyanView;

/**
 * 流浪动物留言 服务实现类
 */
@Service("liulangdongwuLiuyanService")
@Transactional
public class LiulangdongwuLiuyanServiceImpl extends ServiceImpl<LiulangdongwuLiuyanDao, LiulangdongwuLiuyanEntity> implements LiulangdongwuLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<LiulangdongwuLiuyanView> page =new Query<LiulangdongwuLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
