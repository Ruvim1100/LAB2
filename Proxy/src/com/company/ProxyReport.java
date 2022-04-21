package com.company;

public class ProxyReport implements Report{
    String data;
    private  realReport report;

    public ProxyReport(String data){
        this.data = data;
    }

    @Override
    public void send() {
        if (report == null){
            report = new realReport(data);
        }
        report.send();
    }

}
