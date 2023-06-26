package classworks.lesson25_20230614.synchronized1;

public class CommonResourceThread implements Runnable{

  CommonResource resource;

  public CommonResourceThread(CommonResource resource) {
    this.resource = resource;
  }

  @Override
  public void run() {

    resource.increment();

  }
}