package com.project.crm.workbench.mapper;

import com.project.crm.workbench.bean.Clue;
import com.project.crm.workbench.bean.ClueQueryVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ClueMapper extends Mapper<Clue> {
    List<Map<String, String>> queryAllClue(ClueQueryVo queryVo);

    List<Map<String, String>> queryClueEcharts();
}
