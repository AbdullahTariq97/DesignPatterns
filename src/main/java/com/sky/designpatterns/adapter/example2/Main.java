package com.sky.designpatterns.adapter.example2;

public class Main {
    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloader();
        // The downloadFileFromInternet method inside fileDownloader uses an object of type phone
        // we have no class of type phone available however we do have a class of type computer available that can also download file from the internet
        // We create an interface of the type phone and add abstract method equivalent to the method being used inside fileDownloader called off the phone
        // We create an abstract class that implements that the interface.
        // The abstract class uses the computer method that downloads file from internet inside the implemention of phone's abstract method
        // Logic from computer used inside a class of type phone which is type accepted by fileDownload
        DeviceAdaptor deviceAdaptor = new DeviceAdaptor();
        fileDownloader.setPhone(deviceAdaptor);
        File cv = fileDownloader.downloadFileFromInternet("cv.docx");
        System.out.println(cv.getData());
    }
}
