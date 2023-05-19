package pro.sky.homework_2_12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_2_12.service.CalcServiceImpl;

@RestController
@RequestMapping(path = "/calculator")
public class CalcController {

    private final CalcServiceImpl calcServiceImpl = new CalcServiceImpl();

    @GetMapping
    public String welcome() {
        return calcServiceImpl.welcome();
    }

    @GetMapping(path = "/plus")
    public Integer plusResults (@RequestParam ("num1") Integer a, @RequestParam ("num2") Integer b) {
        return this.calcServiceImpl.plusResults(a, b);
    }
    @GetMapping(path = "/minus")
    public Integer minusResults (@RequestParam ("num1") Integer a, @RequestParam ("num2") Integer b) {
        return this.calcServiceImpl.minusResults(a, b);
    }
    @GetMapping(path = "/multiply")
    public Integer multiplyResults (@RequestParam ("num1") Integer a, @RequestParam ("num2") Integer b) {
        return this.calcServiceImpl.multiplyResults(a, b);
    }

    @GetMapping(path = "/divide")
    public Integer divideResults(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return this.calcServiceImpl.divideResults(a, b);
    }

}
