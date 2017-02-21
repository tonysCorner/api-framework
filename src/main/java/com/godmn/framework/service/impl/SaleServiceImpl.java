package com.godmn.framework.service.impl;


import com.godmn.framework.common.PageBean;
import com.godmn.framework.common.PageResult;
import com.godmn.framework.dao.saleMapper.SaleDao;
import com.godmn.framework.entity.Sale;
import com.godmn.framework.entity.SaleRecord;
import com.godmn.framework.entity.SaleUrl;
import com.godmn.framework.exception.CodeMsgDef;
import com.godmn.framework.exception.FrameworkException;
import com.godmn.framework.exception.SrvException;
import com.godmn.framework.service.SaleService;
import com.weyao.common.JsonHelper2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = "saleService")
public class SaleServiceImpl implements SaleService {
    private static final Log logger = LogFactory.getLog(SaleServiceImpl.class);

    private static final List<Integer> insuranceStatusList = new ArrayList<Integer>();
    static {
        insuranceStatusList.add(1);
        insuranceStatusList.add(2);
        insuranceStatusList.add(3);
        insuranceStatusList.add(4);
        insuranceStatusList.add(5);
        insuranceStatusList.add(6);
        insuranceStatusList.add(7);
        insuranceStatusList.add(8);
        insuranceStatusList.add(9);
        insuranceStatusList.add(11);
        insuranceStatusList.add(20);
    }

    @Autowired
    SaleDao saleDao;

    @Override
    public PageResult<Sale> listSaleInfo(Sale sale, PageBean pageBean) throws SrvException {

        PageResult<Sale> result=new PageResult<>();
        Map<String, Object> param=new HashMap<>();
        param.put("params", sale);
        param.put("pageBean", pageBean);
        try {
            List<Sale> listSale = saleDao.listSale(param);

            result.setBeanList(listSale);
            int totalSize=saleDao.countSale(param);
            pageBean.setTotalSize(totalSize);
            result.setPageBean(pageBean);
        } catch (Exception e) {
            logger.error("listSaleInfo(" + JsonHelper2.toJson(sale) + ") error", e);
            throw new FrameworkException(CodeMsgDef.LIST_SALE_ERROR, e);
        }

        return result;
    }

    @Override
    public int addSaleInfo(Sale sale) throws SrvException {

        try {
            return saleDao.insertSale(sale);
        } catch (Exception e) {
            logger.error("addSaleInfo(" + JsonHelper2.toJson(sale) + ") error", e);
            throw new FrameworkException(CodeMsgDef.ADD_SALE_ERROR, e);
        }
    }

    @Override
    public int updateSaleInfo(Sale sale) throws SrvException {
        try {
            return saleDao.updateSale(sale);
        } catch (Exception e) {
            logger.error("updateSale(" + JsonHelper2.toJson(sale) + ") error", e);
            throw new FrameworkException(CodeMsgDef.UPDATE_SALE_ERROR, e);
        }
    }

    @Override
    public PageResult<SaleUrl> listSaleUrlInfo(Long saleId, PageBean pageBean) throws SrvException {

        PageResult<SaleUrl> result=new PageResult<>();
        Map<String, Object> param=new HashMap<>();
        param.put("params", saleId);
        param.put("pageBean", pageBean);
        try {
            List<SaleUrl> listSaleUrl = saleDao.listSaleUrlBySaleId(param);

            result.setBeanList(listSaleUrl);

            int totalSize=saleDao.countSale(param);
            pageBean.setTotalSize(totalSize);
            result.setPageBean(pageBean);
        } catch (Exception e) {
            logger.error("listSaleUrlInfo(" + saleId + ") error", e);
            throw new FrameworkException(CodeMsgDef.LIST_SALE_URL_ERROR, e);
        }

        return result;
    }

    @Override
    public int addSaleUrlInfo(SaleUrl saleUrl) throws SrvException {
        try {
            return saleDao.insertSaleUrl(saleUrl);
        } catch (Exception e) {
            logger.error("addSaleUrlInfo(" + JsonHelper2.toJson(saleUrl) + ") error", e);
            throw new FrameworkException(CodeMsgDef.ADD_SALE_URL_ERROR, e);
        }
    }

    @Override
    public int updateSaleUrlInfo(SaleUrl saleUrl) throws SrvException {
        try {
            return saleDao.updateSaleUrl(saleUrl);
        } catch (Exception e) {
            logger.error("updateSaleUrlInfo(" + JsonHelper2.toJson(saleUrl) + ") error", e);
            throw new FrameworkException(CodeMsgDef.UPDATE_SALE_URL_ERROR, e);
        }
    }

    @Override
    public Sale getSaleBySaleId(Long saleId) throws SrvException {
        try {
            return saleDao.getSaleBySaleId(saleId);
        } catch (Exception e) {
            logger.error("getSaleBySaleId(" + saleId + ") error", e);
            throw new FrameworkException(CodeMsgDef.GET_SALE_URL_ERROR, e);
        }
    }

    @Override
    public Sale getSaleByCode(String code) throws SrvException {
        try {
            return saleDao.getSaleByCode(code);
        } catch (Exception e) {
            logger.error("getSaleByCode(" + code + ") error", e);
            throw new FrameworkException(CodeMsgDef.GET_SALE_ERROR, e);
        }
    }

    @Override
    public SaleRecord insertSaleRecord(SaleRecord record) throws SrvException {
        try {
            saleDao.insertSaleRecord(record);
            return record;
        } catch (Exception e) {
            logger.error("insertSaleResult(" + JsonHelper2.toJson(record) + ") error", e);
            throw new FrameworkException(CodeMsgDef.ADD_SALE_RECORD_ERROR, e);
        }
    }

    @Override
    public SaleRecord getSaleRecordById(Long id) throws SrvException {
        try {
            return saleDao.getSaleRecordById(id);
        } catch (Exception e) {
            logger.error("getSaleRecordById(" + id + ") error", e);
            throw new FrameworkException(CodeMsgDef.GET_SALE_RECORD_ERROR, e);
        }
    }

    @Override
    public int updateSaleRecord(SaleRecord record) throws SrvException {
        try {
            return saleDao.updateSaleRecord(record);
        } catch (Exception e) {
            logger.error("updateSaleRecord(" + JsonHelper2.toJson(record) + ") error", e);
            throw new FrameworkException(CodeMsgDef.BIND_CID_TO_SALE_RECORD_ERROR, e);
        }

    }

    @Override
    public SaleUrl getSaleUrlBySaleIdAndBatchId(Long saleId, int batchId) throws SrvException {
        try {
            return saleDao.getSaleUrlBySaleIdAndBatchId(saleId, batchId);
        } catch (Exception e) {
            logger.error("getSaleUrlBySaleIdAndBatchId(" + saleId + ","  + batchId + ") error", e);
            throw new FrameworkException(CodeMsgDef.GET_SALE_URL_ERROR, e);
        }
    }
}
