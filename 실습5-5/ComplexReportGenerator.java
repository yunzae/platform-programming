package org.report;

import java.util.List;

public class ComplexReportGenerator extends AbstractReportGenerator{
    protected  boolean customerReportCondition(Customer customer){
        return customer.getPoint()>100;
    }

    protected String getReportHeader(List<Customer> customers){
        return "고객의 수: "+customers.size()+" 명 입니다\n";
    }

    protected String getReportForCustomer(Customer customer){
        return customer.getPoint()+": "+customer.getName()+"\n";
    }

    protected String getReportFooter(List<Customer> customers){
        int sum= 0;
        for(Customer c : customers){
            sum+=c.getPoint();
        }
        return "점수 합계: "+sum;
    }

}
