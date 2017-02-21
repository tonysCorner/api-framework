package com.godmn.framework.service;


import com.godmn.framework.common.PageBean;
import com.godmn.framework.common.PageResult;
import com.godmn.framework.entity.Sale;
import com.godmn.framework.entity.SaleRecord;
import com.godmn.framework.entity.SaleUrl;
import com.godmn.framework.exception.SrvException;

public interface SaleService {

    PageResult<Sale> listSaleInfo(Sale sale, PageBean pageBean) throws SrvException;

    int addSaleInfo(Sale sale) throws SrvException;

    int updateSaleInfo(Sale sale) throws SrvException;

    PageResult<SaleUrl> listSaleUrlInfo(Long saleId, PageBean pageBean) throws SrvException;

    int addSaleUrlInfo(SaleUrl saleUrl) throws SrvException;

    int updateSaleUrlInfo(SaleUrl saleUrl) throws SrvException;

    Sale getSaleBySaleId(Long saleId) throws SrvException;

    Sale getSaleByCode(String code) throws SrvException;

    SaleRecord insertSaleRecord(SaleRecord record) throws SrvException;

    SaleRecord getSaleRecordById(Long id) throws SrvException;

    int updateSaleRecord(SaleRecord record) throws SrvException;

    SaleUrl getSaleUrlBySaleIdAndBatchId(Long saleId, int batchId) throws SrvException;
}
