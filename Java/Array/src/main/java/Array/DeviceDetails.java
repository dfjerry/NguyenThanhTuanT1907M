/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Admin
 */
public class DeviceDetails {
    private int deviceNo;
    private String deviceName, deviceType;
    private double devicePrice;
    private DeviceDetails(){
        deviceNo = 0;
        deviceName = "";
        devicePrice = 0.0;
        deviceType = "";
    }
   
    public DeviceDetails(int deviceNo, String deviceName, String deviceType, double devicePrice) {
        this.deviceNo = deviceNo;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.devicePrice = devicePrice;
    }
     public void setDeviceDetails(int No, String deviceType){
        deviceNo = No;
        deviceType = deviceType;
    }
    public void displayDetails(){
        System.out.println("Device numbers "+deviceNo);
        System.out.println("name "+deviceName);
        System.out.println("type "+deviceType);
        System.out.println("price "+devicePrice);
    }

    @Override
    public String toString() {
        return "DeviceDetails{" + "deviceNo=" + deviceNo + ", deviceName=" + deviceName + ", deviceType=" + deviceType + ", devicePrice=" + devicePrice + '}';
    }
    
    
    
    public static void main(String[] args) {
            DeviceDetails objDetails = new DeviceDetails(1, "mercedes","ahaha",0.0);
            objDetails.setDeviceDetails(1, "Mercedes");
            objDetails.displayDetails();
            System.out.println("toString "+objDetails.toString());
      
    }
}



