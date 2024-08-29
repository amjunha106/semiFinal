package htproject.mvc.Controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import htproject.mvc.Service.A01_Service;
import htproject.z01_vo.Mem;
import htproject.z01_vo.T_info;

@Controller
public class A01_Controller {
    @Autowired(required = false)
    private A01_Service service;

    // http://localhost:7080/htproject/mem.do		?mem_id=junha
    @RequestMapping("mem.do")
    public String mem(@RequestParam("m_id") String m_id, Model d) {
        d.addAttribute("mem",service.getMem(m_id));
        return "WEB-INF\\views\\mvc\\a01_MyPage.jsp";
    }
    

    
    
 // http://localhost:7080/htproject/train.do		?mem_id=junha
    @RequestMapping("train.do")
    public String train(@RequestParam("m_id") String m_id, Model d) {
        d.addAttribute("mem",service.getTrain(m_id));
        return "WEB-INF\\views\\mvc\\a04_tview.jsp";
    }
    
    // http://localhost:7080/htproject/t_info100.do	?train_depart=서울&train_arrive=부산
    @RequestMapping("t_info100.do")
    public String t_info(T_info sch,Model d) {
    	d.addAttribute("t_info",service.trainList(sch));
    	return "WEB-INF\\views\\mvc\\a05_t_list.jsp";
    }

    // http://localhost:7080/htproject/memInsertForm100.do
 	@RequestMapping("memInsertForm100.do")
 	public String memInsertForm100() {
 		return "WEB-INF\\views\\mvc\\a02_memInsertForm.jsp";
 	}

 	@RequestMapping("memInsert100.do")
 	public String memInsert100(Mem ins, Model d) {
 	d.addAttribute("result", service.insertMem(ins));
 	return "WEB-INF\\views\\mvc\\a02_memInsertForm.jsp";
 	}

    // http://localhost:7080/htproject/memUpdate100.do
    @RequestMapping("memUpdate100.do")
    public String memUpdate(Mem upt, Model d) {
    d.addAttribute("msg", service.updateMem(upt));
    d.addAttribute("mem", service.getMem(upt.getM_id())); 
        return "WEB-INF\\views\\mvc\\a03_MemDetail.jsp";
    }

    // http://localhost:7080/htproject/memDelete100.do
    @RequestMapping("memDelete100.do")
    public String memDelete(@RequestParam("m_id") String m_id, Model d) {
    d.addAttribute("msg", service.deleteMem(m_id));
    d.addAttribute("proc", "삭제");
    return "WEB-INF\\views\\mvc\\a03_MemDetail.jsp";
    }

    
    // http://localhost:7080/htproject/mem02.do?mem_id=junha
    @RequestMapping("mem02.do")
    public String mem02(@RequestParam("m_id") String m_id, Model d) {
    d.addAttribute("mem", service.getMem(m_id));
    return "WEB-INF\\views\\mvc\\a03_MemDetail.jsp";
    }
    
    
 // http://localhost:7080/htproject/login.do
 	@GetMapping("login.do")
 	public String loginFrm() {
 		return "WEB-INF\\views\\mvc\\a01_login_form.jsp";
 	}
 	@PostMapping("login.do")
    public String login(@RequestParam String m_id, @RequestParam String m_pwd, HttpSession session, Model d) {
        String msg = "로그인 실패";

        // 간단한 사용자 인증 로직 (실제로는 데이터베이스 조회 등)
        if ("junha".equals(m_id) && "hwang".equals(m_pwd)) {
            msg = "로그인 성공";
            session.setAttribute("m_id", m_id);
            return "redirect:/semi-final/MainHome.jsp";
        }

        d.addAttribute("msg", msg);
        return "WEB-INF\\views\\mvc\\a01_login_form.jsp";
    }
 	
 	 @GetMapping("/logout.do")
     public String logout(HttpSession session) {
         session.invalidate(); // 세션 무효화
         return "redirect:/semi-final/MainHome.jsp"; // 메인 홈 페이지로 리다이렉트
     }
    
}
