package org.report;

import java.util.List;

public class SimpleReportGenerator extends AbstractReportGenerator{
    protected  boolean customerReportCondition(Customer customer){
        return true;
    }

    protected String getReportHeader(List<Customer> customers){
        return "고객의 수: "+customers.size()+" 명\n";
    }

    protected String getReportForCustomer(Customer customer){
        return customer.getName()+": "+customer.getPoint()+"\n";
    }

    protected String getReportFooter(List<Customer> customers){
        return "";
    }
}
