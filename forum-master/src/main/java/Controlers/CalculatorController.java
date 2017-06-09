package Controlers;

import Calc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import sun.misc.Request;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by TMS on 09.06.2017.
 */
@Controller
@RequestMapping("/calculator")
public class CalculatorController {
//
//    @Autowired
//    private SolverSqrt solver;
//    @Autowired
//    private Calculator minus;
//    private Plus plus;
//    private Delenie delenie;
//    @Autowired
//    private Calculator umnozhenie;
//    @Autowired
//    @Qualifier("minus")
//    private Calculator minus1;
//    @Resource(name="plus")
//    private Calculator plus1;



//    private ApplicationContext context;

    @RequestMapping(value="/sqrt", method= RequestMethod.POST)
    public String sqrt(HttpServletRequest request, HttpServletResponse response, @RequestParam("") int varA,@RequestParam("") int varB,@RequestParam("")int varC){
        System.out.println(varA+" "+varB+" "+varC);

////        WebApplicationContext context= WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
////        SolverSqrt sus=(SolverSqrt)context.getBean("solver");
//        String x1=solver.getX1();
//        String x2=solver.getX2();
//        System.out.println(x1);
//        System.out.println(x2);
////        SolverSqrt sus1=context.getBean(SolverSqrt.class);
////        String x3=sus1.getX1();
//        double x5=minus.getA();
//        System.out.println(x5);
//        double x6=umnozhenie.getA();
//        System.out.println(x6);
//        double x123=minus1.getA();
//        System.out.println(x123);
//        double pl=plus1.calc();
//        System.out.println(pl);

        return "/WEB-INF/pages/sqrt.jsp";


    }


//    @RequestMapping(value = "/sqrt",method = RequestMethod.GET)
//    public String sqrt1(HttpServletRequest request, HttpServletResponse response){
//        return null;
//
//    }

}
