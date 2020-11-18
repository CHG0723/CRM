package com.project.crm.workbench.service;

import com.project.crm.workbench.bean.Activity;
import com.project.crm.workbench.bean.ActivityQueryVo;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    List<Map<String, String>> queryAllActivity(ActivityQueryVo queryVo);

    void saveActivity(Activity activity);
}
