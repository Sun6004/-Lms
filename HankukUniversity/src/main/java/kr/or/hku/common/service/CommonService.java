package kr.or.hku.common.service;

import java.util.List;

import kr.or.hku.admin.vo.FacilityVO;
import kr.or.hku.common.vo.CommonVO;
import kr.or.hku.student.vo.StudentVO;


public interface CommonService {
	public List<CommonVO> getAllCommonData();
	public StudentVO myAllInfo(String stdNo);
	public List<FacilityVO> floorListFlct(String flctNo);
}
