/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.auto_xlzfbzxorj.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class HrdbProcedureExecutorServiceImpl implements HrdbProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("hrdbWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}