package com.godmn.framework.dao.saleMapper;

import com.godmn.framework.entity.Sale;
import com.godmn.framework.entity.SaleRecord;
import com.godmn.framework.entity.SaleUrl;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface SaleDao {

	int insertSale(Sale sale);

	int updateSale(Sale sale);

	int insertSaleUrl(SaleUrl url);

	int updateSaleUrl(SaleUrl url);

	SaleUrl getSaleUrlByUrlId(Long urlId);

	SaleUrl getSaleUrlBySaleIdAndBatchId(@Param(value = "saleId") Long saleId, @Param(value = "batchId") int batchId);

	Sale getSaleBySaleId(Long saleId);

	Sale getSaleByCode(String code);

	List<Sale> listSale(Map<String, Object> param);

	int countSale(Map<String, Object> param);

	List<SaleUrl> listSaleUrlBySaleId(Map<String, Object> param);

	int insertSaleRecord(SaleRecord record);

	int updateSaleRecord(SaleRecord record);

	SaleRecord getSaleRecordById(Long id);

}
