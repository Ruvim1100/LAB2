package com.company;

public class realReport implements Report{
    String data;

    public realReport(String data){
        this.data = data;
        loadData();
    }

    void loadData(){
        System.out.println("Идёт загрузка данных о сотрудниках");
    }

    @Override
    public void send(){
        System.out.println("Отчёт о сотрудниках отправлен");

    }
}
