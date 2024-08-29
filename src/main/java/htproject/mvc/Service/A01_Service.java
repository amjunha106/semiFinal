package htproject.mvc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import htproject.mvc.Dao.A01_Dao;
import htproject.z01_vo.Mem;
import htproject.z01_vo.T_info;
import htproject.z01_vo.Train;

@Service
public class A01_Service{
	@Autowired(required=false)
	private A01_Dao dao;
	
	public Mem getMem(String m_id) {
		return dao.getMem(m_id);
	}
	
	public Train getTrain(String m_id) {
		return dao.getTrain(m_id);
	}
	
	public List<T_info> trainList(T_info sch) {
		
		return dao.trainList(sch);
	}
	
	public 	String insertMem(Mem ins) {
		return dao.insertMem(ins)>0?"등록성공":"등록실패";
	}
	
	public String updateMem(Mem upt) {
		return dao.updateMem(upt)>0?"수정성공":"수정실패";
	}
	
	public String deleteMem(String m_id) {
		return dao.deleteMem(m_id)>0?"탈퇴성공":"탈퇴실패";
	}
	
	
	public Mem login(Mem mem) {
		return dao.login(mem);
	}
	
}
