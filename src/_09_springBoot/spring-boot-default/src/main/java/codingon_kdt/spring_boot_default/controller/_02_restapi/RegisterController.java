package codingon_kdt.spring_boot_default.controller._02_restapi;

import codingon_kdt.spring_boot_default.vo.RegisterVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String getRegister(Model model){
        System.out.println("[GET]");
        return "_02_restapi/register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody RegisterVO registerVO){
        System.out.println("실행됨");
        System.out.println("[POST] : "+ registerVO.getName());
        System.out.println("[POST] : "+ registerVO.getYear());
        System.out.println("[POST] : "+ registerVO.getGender());
        System.out.println("[POST] : "+ registerVO.getMonth());
        System.out.println("[POST] : "+ registerVO.getHobby());
        System.out.println("[POST] : "+ registerVO.getDay());
        return "hi"+ registerVO;
    }
}
