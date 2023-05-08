package classworks.lesson13_20230426.anonimus;

public class GeneralAppAC {
  public static void main(String[] args) {
    MonitoringSystem generalModule = new MonitoringSystem() {
      @Override
      public void startMonitoring() {
        System.out.println("Monitoring general running");
      }
    };

    MonitoringSystem errorModule = new MonitoringSystem() {
      @Override
      public void startMonitoring() {
        System.out.println("Monitoring Error Running");
      }
    };

    MonitoringSystem securityModule = new MonitoringSystem() {
      @Override
      public void startMonitoring() {
        System.out.println("Security Monitor running");
      }
    };

    generalModule.startMonitoring();
    errorModule.startMonitoring();
    securityModule.startMonitoring();
  }
}
