package com.csci927.pandemicaservice1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/financial-assistance")
public class FinancialController {

//    TODO: check if this autowiring is correct
    @Autowired
    FinancialRepository financialRepository;

    @GetMapping
    public String renderFinancialAssistancePage(Model model){
        model.addAttribute("financial", new FinancialModel());
        return "financial-assistance";
    }

    @PostMapping("/apply")
    public String applyForAssistance(@Valid FinancialModel financialModel, BindingResult result){
        if (result.hasErrors()) {
            return "financial-assistance";
        }
        financialRepository.save(financialModel);
        return "redirect:financial-done";
    }

}
