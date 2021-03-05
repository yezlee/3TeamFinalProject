package kr.or.ddit.fsurpport.repository;

import java.util.List;

import kr.or.ddit.common.model.CodesVo;
import kr.or.ddit.common.model.FilesVo;
import kr.or.ddit.farm.model.FarmdiaryVo;
import kr.or.ddit.farm.model.FcltmngVo;
import kr.or.ddit.farm.model.MsrequipVo;
import kr.or.ddit.farm.model.MsrrecVo;
import kr.or.ddit.farm.model.MySimpleCodeVo;

public interface FsurpportDao {

	// ggy_20210303: 등록된 품목 리스트 조회
	List<FarmdiaryVo> selectAllFsurpportList();

	// ggy_20210303: 등록된 품목 조회
	List<CodesVo> selectAllItem_codeList();

	// ggy_20210303 : 등록된 작업단계 조회
	List<CodesVo> selectAllWstep_codeList();
	
	// ggy_20210305 : 등록된 사업유형 조회
	List<CodesVo> selectAllBtype_codeList();
	
	// ggy_20210305 : 등록한 나만의 영농일지-간편등록 목록 조회
	List<MySimpleCodeVo> selectMySimpleCodeList(String user_id);

	// ggy_20210305 : 등록한 나만의 영농일지-나의 간편등록 조회 해서 배치
	MySimpleCodeVo selectMySimpleCodeInfo(MySimpleCodeVo mySimpleCodeVo);

	// ggy_20210303 : 등록된 일지 조건 검색
	List<FarmdiaryVo> searchAllFarmdiaryList(FarmdiaryVo farmdiaryVo);
	
	// ggy_20210305 : 해당 일지 정보 조회
	FarmdiaryVo selectFarmdiaryInfo(int fdiary_no);
	
	// ggy_20210305 : 일지 등록때 파일 있으면 파일 등록
	int registFiles(FilesVo filesVo);
	
	// ggy_20210305 : 일지 등록을 위한 등록된 파일 정보 가져오기
	FilesVo selectFilesInfo(String file_nm);

	// ggy_20210305 : 일지 등록
	int registFarmdiary(FarmdiaryVo farmdiaryVo);
	
	/* 시설관리 영역 */
	// 20210302_KJH 시설리스트 조회
	List<FcltmngVo> myfcltmngList();

	// 20210302_KJH 시설 상세조회
	FcltmngVo fcltmngInfo(String str);
	
	// 20210304_KJH 시설 최근 측정정보 조회
	MsrrecVo latelyData(String msr_code);
	
	// 20210304_KJH 보유 장비 조회
	List<MsrequipVo> msrequipList(String owner); 

	// 등록된 시설 카운트 03/04 (경찬)
	int fcltmngCount(String user_id);
	
	// 등록된 일지 카운트 03/04 (경찬)
	int fsurCount(String user_id);

}
