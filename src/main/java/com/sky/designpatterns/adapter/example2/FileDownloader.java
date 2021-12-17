package com.sky.designpatterns.adapter.example2;

public class FileDownloader {

    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public File downloadFileFromInternet(String fileName){
        return phone.downloadFileUsingInternet(fileName);
    }
}
