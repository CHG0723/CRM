package com.project.crm.workbench.mapper;

import com.project.crm.workbench.bean.TranQueryVo;
import com.project.crm.workbench.bean.Transaction;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface TransactionMapper extends Mapper<Transaction> {
    List<Map<String, String>> queryAllTran(TranQueryVo queryVo);

    List<Map<String, String>> queryTransactionEcharts();

}
