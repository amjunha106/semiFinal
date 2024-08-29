package htproject.mvc.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import htproject.z01_vo.Mem;
import htproject.z01_vo.T_info;
import htproject.z01_vo.Train;





public interface A01_Dao {
	
	@Select("select *\r\n"
			+ "	from mem\r\n"
			+ "	where m_id = #{m_id}")
	Mem getMem(@Param("m_id") String m_id);
	
	@Select("select *\r\n"
			+ "	from traininfo\r\n"
			+ "	where m_id = #{m_id}")
	Train getTrain(@Param("m_id") String m_id);
	
	@Select("SELECT * " +
	        "FROM t_info " +
	        "WHERE train_depart like #{train_depart} " +
	        "AND train_arrive like #{train_arrive}")
	List<T_info> trainList(T_info sch);
	
	@Insert("INSERT INTO mem values(#{m_id}, #{m_pwd},#{m_name},#{m_email}, \r\n"
			+ "	#{m_number}, #{m_age})")
	int insertMem(Mem ins);
	
	@Update("UPDATE mem " +
            "SET m_pwd = #{m_pwd}, " +
            "    m_name = #{m_name}, " +
            "    m_email = #{m_email}, " +
            "    m_number = #{m_number}, " +
            "    m_age = #{m_age} " +
            "WHERE m_id = #{m_id}")
    int updateMem(Mem upt);
	
	@Delete("DELETE \r\n"
			+ "FROM mem\r\n"
			+ "WHERE m_id = #{m_id}")
	int deleteMem(@Param("m_id") String m_id);

	
	@Select("select *\r\n"
			+ "	from mem\r\n"
			+ "	where m_id = #{m_id}")
	Mem login(Mem mem);
}
