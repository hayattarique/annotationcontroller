package com.pcw.controller;

import com.pcw.dto.TicketDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.util.Map;

@Controller
public class TicketController {
//        @RequestMapping("/getPNRStatus.htm")
//    public ModelAndView getTicketStatus(HttpServletRequest request) {
//        String pnrNo = request.getParameter("pnrNo");
//        TicketDto ticketDto = TicketDto.builder().pnrNo(pnrNo).passengerName("Shahan").
//                source("Gaya").destination("New Delhi").coach("2A").berth(27).travelDate(LocalDate.now()).status("CNF").build();
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("ticket-details");
//        modelAndView.addObject("ticket", ticketDto);
//
//        return modelAndView;
//    }
//    @RequestMapping("/getPNRStatus.htm")
//    public ModelAndView getTicketStatus(WebRequest request) {
//        String pnrNo = request.getParameter("pnrNo");
//        TicketDto ticketDto = TicketDto.builder().pnrNo(pnrNo).passengerName("Shahan").
//                source("Gaya").destination("New Delhi").coach("2A").berth(27).travelDate(LocalDate.now()).status("CNF").build();
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("ticket-details");
//        modelAndView.addObject("ticket", ticketDto);
//
//        return modelAndView;
//    }
    @RequestMapping("/getPNRStatus.htm")
    public String getTicketStatus(WebRequest request, Map<String, Object> modelMap) {
        String pnrNo = request.getParameter("pnrNo");
        TicketDto ticketDto = TicketDto.builder().pnrNo(pnrNo).passengerName("Shahan").
                source("Gaya").destination("New Delhi").coach("2A").berth(27).travelDate(LocalDate.now()).status("CNF").build();

        modelMap.put("ticket", ticketDto);
        return "ticket-details";
    }
}
