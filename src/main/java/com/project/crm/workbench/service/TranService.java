package com.project.crm.workbench.service;

import com.project.crm.workbench.bean.TranQueryVo;
import com.project.crm.workbench.bean.Transaction;

import java.util.List;
import java.util.Map;

public interface TranService {
    List<Map<String, String>> queryAllTran(TranQueryVo queryVo);

    Transaction queryTranDetailById(String id, Map<String,String> stage2PossibilityMap);

    List<String> queryCustomerName(String customerName);

    void saveTransaction(Transaction transaction,String company);

    String queryCustomerByName(String name);
}
