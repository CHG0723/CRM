package com.project.crm.workbench.service;

import com.project.crm.workbench.bean.TranQueryVo;
import com.project.crm.workbench.bean.Transaction;
import com.project.crm.workbench.bean.TransactionEchartsResultVo;

import java.util.List;
import java.util.Map;

public interface TranService {
    List<Map<String, String>> queryAllTran(TranQueryVo queryVo);

    Transaction queryTranDetailById(String id, Map<String,String> stage2PossibilityMap);

    List<String> queryCustomerName(String customerName);

    void saveTransaction(Transaction transaction,String company);

    String queryCustomerByName(String name);

    List<Map<String, ? extends Object>> stageList(String name,Integer index,String tranId,Map<String,String> map);

    TransactionEchartsResultVo queryTransactionEcharts();
}
