package clients;

import processes.GeneralManufactringProcess;
import processes.SmartPhoneManufactoringProcess;

public class DeviceFactory {
  public static void main(String args[]) {
	GeneralManufactringProcess manufacture =  new SmartPhoneManufactoringProcess("Iphone");
	manufacture.lauchProcess();
  }
}
