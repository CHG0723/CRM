package com.project.crm.workbench.mapper;

import com.project.crm.workbench.bean.Activity;
import com.project.crm.workbench.bean.ActivityQueryVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ActivityMapper extends Mapper<Activity> {
    List<Map<String, String>> queryAllActivity(ActivityQueryVo queryVo);

    Activity queryActivityDetailById(@Param("id") String id);
}
