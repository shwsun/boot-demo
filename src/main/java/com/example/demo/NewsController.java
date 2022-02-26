package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

// 
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {

    @RequestMapping("/") 
    public String index() { return "index"; }

	@RequestMapping("/gr")
	public String greeting() {
		return "greeting";
	}

	@GetMapping("/greeting")
	public String greeting2(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

    // @RequestMapping("/json") 
    // public @ResponseBody NewsVO show() { 
    //     NewsVO vo = new NewsVO(); 
    //     vo.setTitle("뉴욕증시 안도 랠리···S&P500 이틀째 최고치 마감"); 
    //     vo.setContent("나스닥 4주연속 상승세·S&P도 3주째 올라\r\n" 
    //     + "존슨앤드존슨 백신 폐기로 1%이상 떨어져\r\n" 
    //     + "맥도날드는 고객정보 유출에도 1%대 상승"); 
    //     vo.setCategory("STOCK"); 
    //     return vo; 
    // }

    // @RequestMapping("/map") 
    // public @ResponseBody Map<String, Object> show2() { 
    //     Map<String, Object> map = new HashMap<> (); 
    //     map.put("title", "뉴욕증시 안도 랠리···S&P500 이틀째 최고치 마감"); 
    //     map.put("content", "나스닥 4주연속 상승세·S&P도 3주째 올라\r\n" 
    //     + "존슨앤드존슨 백신 폐기로 1%이상 떨어져\r\n" + "맥도날드는 고객정보 유출에도 1%대 상승"); 
    //     map.put("category", "STOCK"); 
    //     return map; 
    // }
}
