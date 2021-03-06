/** 
* Copyright (c) 2011-2013  上海宜豪健康信息咨询有限公司 版权所有 
* Shanghai eHealth Technology Company. All rights reserved. 

* This software is the confidential and proprietary 
* information of Shanghai eHealth Technology Company. 
* ("Confidential Information"). You shall not disclose 
* such Confidential Information and shall use it only 
* in accordance with the terms of the contract agreement 
* you entered into with Shanghai eHealth Technology Company. 
*/
package com.souyibao.pipe.keyword;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeywordPartTF {
	private String docId = null;
	private Map<String, PartCount> partCountMap = new HashMap<String, PartCount>();
	private int totalCount = -1;
//	private String isNotice = null;
	
	public class PartCount {
		private String part = null;
		private short count = 0;

		public String getPart() {
			return part;
		}

		public void setPart(String part) {
			this.part = part;
		}

		public short getCount() {
			return count;
		}

		public void setCount(short count) {
			this.count = count;
		}
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}
	
	public Map getPartCountMap() {
		return partCountMap;
	}
	
//	public String getIsNotice() {
//		return isNotice;
//	}
//
//	public void setIsNotice(String isNotice) {
//		this.isNotice = isNotice;
//	}

	public void addPartCount(String part, short count) {
		PartCount partCount = new PartCount();
		partCount.setCount(count);
		partCount.setPart(part);
		
		partCountMap.put(part, partCount);
	}
	
	public short getCount(String part) {
		PartCount pageCount = this.partCountMap.get(part);
		
		return (pageCount == null)? 0: pageCount.getCount();
	}
	
	public int getTotalCount() {
		if (totalCount != -1) {
			return totalCount;
		}
		Set<String> keys = partCountMap.keySet();
				
		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();){
			totalCount = totalCount + partCountMap.get(iterator.next()).getCount();
		}
		
		return totalCount;
	}
}


