package kr.or.ddit.fanalysis.repository;

import kr.or.ddit.fanalysis.model.MyMaxMrrecListVo;
import kr.or.ddit.farm.model.FhistoryVo;
import kr.or.ddit.farm.model.MsrrecVo;

public interface FanalysisDao {
	// 20210304_KJH 내 시설 관측정보 조회
	MyMaxMrrecListVo myfanalysisInfo(MyMaxMrrecListVo mymaxmrreclistVo);
	
//	 20210305_KJH 내 시설 실시간 관측 조회
	MyMaxMrrecListVo mymaxmsrrecList(FhistoryVo fhistoryVo);

}
