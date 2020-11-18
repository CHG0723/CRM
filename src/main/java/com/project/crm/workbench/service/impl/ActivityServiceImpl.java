package com.project.crm.workbench.service.impl;

import com.project.crm.base.constants.CrmExceptionEnum;
import com.project.crm.base.exception.CrmException;
import com.project.crm.base.util.DateTimeUtil;
import com.project.crm.base.util.UUIDUtil;
import com.project.crm.workbench.bean.Activity;
import com.project.crm.workbench.bean.ActivityQueryVo;
import com.project.crm.workbench.mapper.ActivityMapper;
import com.project.crm.workbench.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.service.impl
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/17 20:50
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Service("/activityService")
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<Map<String, String>> queryAllActivity(ActivityQueryVo queryVo) {
        return activityMapper.queryAllActivity(queryVo);
    }

    @Override
    public void saveActivity(Activity activity) {
        //UUID主键
        activity.setId(UUIDUtil.getUUID());

        //创建时间
        activity.setCreateTime(DateTimeUtil.getSysTime());
        //更新时间
        activity.setEditTime(DateTimeUtil.getSysTime());

        //insertSelective:空值不参与插入
        int count = activityMapper.insertSelective(activity);
       //更新失败
        if (count ==0){
            throw new CrmException(CrmExceptionEnum.ACTIVITY_SAVE);
        }
    }
}
