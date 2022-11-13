package com.tom.contactus.controller;

import com.tom.contactus.dto.ContactDTO;
import com.tom.contactus.service.ContactUsService;
import com.tom.contactus.service.KindOfRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class ContactUsController {

    private final KindOfRequestService requestService;
    private final ContactUsService contactUsService;

    @GetMapping("/contact")
    public ModelAndView getContactPage() {
        ModelAndView nav = new ModelAndView("contact_form");

        nav.addObject("contact", new ContactDTO());
        nav.addObject("kindOfRequests", requestService.listKindOfRequests());
        nav.addObject("pageTitle", "Contact US");
        return nav;
    }

    @PostMapping("/contact")
    public String saveContact(@ModelAttribute("contact") @Valid ContactDTO contact,
                              BindingResult result,
                              RedirectAttributes redirectAttributes,
                              Model model) {

        if (result.hasErrors()) {
            model.addAttribute("contact", contact);
            model.addAttribute("kindOfRequests", requestService.listKindOfRequests());
            model.addAttribute("pageTitle", "Contact US");
            return "contact_form";
        }

        contactUsService.save(contact);
        redirectAttributes.addFlashAttribute("message", "The contact has been sent successfully");
        return "redirect:/contact";
    }
}
