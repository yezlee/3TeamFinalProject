package kr.or.ddit.test.KJH.finfo;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.farm.model.GardenguideVo;
import kr.or.ddit.finfo.service.FinfoServiceImpl;
import kr.or.ddit.test.config.ModelTestConfig;

public class Service extends ModelTestConfig{

	@Resource(name = "finfoService")
	private FinfoServiceImpl finfoService;
	
	@Test
	public void guide_codeselect() {
		/***Given***/
		
		/***When***/
		GardenguideVo vo = finfoService.guide_codeselect("배추");
		/***Then***/
		assertEquals("12", vo.getGuide_code());
	}
}
