package codingon_kdt.spring_boot_default.controller._02_restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class RestController {

    // ======= Template 랜더링 ======
    @GetMapping("/")
    public String getReq() { return "_02_restapi/req"; }

    // ======= GET 요청 ======
    @GetMapping("/get/res1")
    public String getRes1(@RequestParam(value="name") String name,
                          @RequestParam(value="age") int age, Model model) {
        // @RequestParam 어노테이션
        // - HTTP 요청 파라미터를 메서드 매개변수에 바인딩
        // - required=true 가 기본 값이므로 요청 URL 에서 key 를 필수로 보내야 함
        //      주의. Spring 은 빈 문자열을 유효한 값으로 하므로 name 의 경우, 빈 값을 보내도 에러 발생 x
        System.out.println("[GET] request query string (name) = " + name);
        System.out.println("[GET] request query string (age) = " + age);

        // 뷰에 전달할 데이터를 Model 객체 추가
        model.addAttribute("name", name);
        model.addAttribute("age", age);

        // 응답 결과로 보여줄 뷰 이름
        return "_02_restapi/res";
    }

    @GetMapping("/get/res2")
    public String getRes2(@RequestParam(value="name", required = false) String name, Model model) {
        System.out.println("[GET] request query string (name) = " + name); // null

        model.addAttribute("name", name);

        return "_02_restapi/res";
    }

    @GetMapping("/get/res3/{param1}/{param2}")
    public String getRes3(@PathVariable(value="param1") String param1,
                          @PathVariable(value="param2") int age, Model model) {
        // @PathVariable 어노테이션
        // - URL path variable 을 사용할 때 필요
        // - 기본적으로 path variable 은 값을 가져야 함. (즉, 값이 없다면 404 에러 발생)

        // 참고. URL 의 path variable 과 해당 메서드의 매개변수명을 다르게 사용하고 싶다면 다음과 같이 사용
        // ㄴ ex. @PathVariable(value="param2") int age

        System.out.println("[GET] request path variable (name) = " + param1);
        System.out.println("[GET] request path variable (age) = " + age);

        model.addAttribute("name", param1);
        model.addAttribute("age", age);

        return "_02_restapi/res";
    }

    // 선택적으로 받아오는 path variable 이 있다면 (age), {} 안에 경로 여러개 선언
    @GetMapping({"/get/res4/{name}/{age}", "/get/res4/{name}"})
    public String getRes4(@PathVariable(value = "name")String name,
                          @PathVariable(value = "age", required = false) Integer age, Model model) {
        // path variable 중에서 name (필수), age (선택) 이라면?
        // - required = false 사용
        // - (중요) optional 한 변수가 맨 뒤에 오도록 설정

        // 참고. age 변수에 Integer 타입 지정한 이유
        // - age 는 optional 한 값으로 null 가능함.
        // - 따라서, primitive type (int) 이 아닌 reference type 인 wrapper 객체 사용

        System.out.println("[GET] request path variable (name) = " + name);
        System.out.println("[GET] request path variable (age) = " + age);

        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "_02_restapi/res";
    }
    /// ========= POST 요청 ===========
    @PostMapping("/post/res1")
    public String postRes1(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age, Model model){
        System.out.println("[POST] request query string (name) = " + name);
        System.out.println("[POST] request query string (age) = " + age);

        model.addAttribute("name",name);
        model.addAttribute("age",age);

        return "_02_restapi/res";
    }

    //#6
    @PostMapping("/post/res2")
    public String postRes2(@RequestParam(value = "name") String name,
                           @RequestParam(value = "age",required = false) Integer age, Model model){
        System.out.println("[POST] request query string (name) = " + name);
        System.out.println("[POST] request query string (age) = " + age);

        model.addAttribute("name",name);
        model.addAttribute("age",age);

        return "_02_restapi/res";
    }

    //#7
    @PostMapping("/post/res3")
    @ResponseBody
    public String postRes3(@RequestParam(value="name") String name, @RequestParam(value = "age")int age){
        System.out.println("[POST] request query string (name) = " + name);
        System.out.println("[POST] request query string (age) = " + age);

        return name + " " + age;
    }
}