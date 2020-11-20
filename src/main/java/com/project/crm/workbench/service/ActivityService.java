package com.project.crm.workbench.service;

import com.project.crm.workbench.bean.Activity;
import com.project.crm.workbench.bean.ActivityQueryVo;
import com.project.crm.workbench.bean.ActivityRemark;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    List<Map<String, String>> queryAllActivity(ActivityQueryVo queryVo);

    void saveActivity(Activity activity);

    Activity queryActivityById(String id);

    void updateActivity(Activity activity);

    void deleteActivity(String id);

    Activity queryActivityDetailById(String id);

    void updateActivityRemark(ActivityRemark activityRemark);

    void deleteActivityRemark(String id);

    void saveActivityRemark(ActivityRemark activityRemark);
}
