package com.csci927.pandemicaservice2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
@Controller
@RequestMapping("/vaccine-feedback")
public class FeedbackController {
    //    TODO: check if this autowiring is correct
    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping
    public String renderVaccineFeedbackPage(Model model){
        model.addAttribute("feedback", new FeedbackModel());
        return "vaccine-feedback";
    }

    @PostMapping("/submit")
    public String submitforFeedback(@Valid FeedbackModel feedbackModel, BindingResult result, Model model){
        if (result.hasErrors()) {
            model.addAttribute("feedback", new FeedbackModel());
            return "vaccine-feedback";
        }
        feedbackRepository.save(feedbackModel);
        return "feedback-done";
    }

}
