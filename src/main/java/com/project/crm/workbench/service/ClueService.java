package com.project.crm.workbench.service;

import com.project.crm.workbench.bean.*;

import java.util.List;
import java.util.Map;

public interface ClueService {
    List<Map<String, String>> queryAllClue(ClueQueryVo queryVo);

    Clue queryClueDetailById(String id);

    void saveClue(Clue clue);

    void updateClueRemark(ClueRemark clueRemark);

    void saveClueRemark(ClueRemark clueRemark);

    void deleteClueRemark(String id);

    Clue queryClueById(String id);

    void updateClue(Clue clue);

    void deleteBind(ClueActivityRelation clueActivityRelation);

    void deleteManyBind(String clueId, String activityIds);

    List<Activity> queryActivityExculdeNow(String clueId, String activityName);

    void saveBind(String clueId, String activityIds);

    List<Activity> queryClueActivity(String clueId);

    void convert(Transaction transaction,String clueId,String username,String isCreateTransaction);

    List<Activity> queryActivityIncludeNow(String clueId, String activityName);

    TransactionEchartsResultVo queryClueEcharts();
}
