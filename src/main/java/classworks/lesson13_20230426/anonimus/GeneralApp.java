package classworks.lesson13_20230426.anonimus;

public class GeneralApp {
  public static void main(String[] args) {

    GeneralIndicatorsMonitoring generalMonitoring = new GeneralIndicatorsMonitoring();
    ErrorMonitoringModel errorMonitoringModel = new ErrorMonitoringModel();
    SecurityMonitoringModel securityMonitoringModel = new SecurityMonitoringModel();

    generalMonitoring.startMonitoring();
    errorMonitoringModel.startMonitoring();
    securityMonitoringModel.startMonitoring();

  }
}
