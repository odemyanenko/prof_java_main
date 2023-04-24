package classworks.lesson12_20230424.queueRequests;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class RequestManager {
  Queue<Request> requests;
  private final int maxSize;

  public RequestManager(int maxSize) {
//    requests = new ConcurrentLinkedQueue<>();
    requests = new LinkedList<>();
    this.maxSize = maxSize;
  }

  public void addRequest(Request request) {
    if (requests.size() < maxSize) {
      if (!requests.contains(request)) {
        requests.add(request);
      }
    } else {
      System.out.println("Queue is full. Please try later...");
    }
  }

  public Request deleteRequest(Request request) {
    if (requests.contains(request)) {
      return requests.remove(request) ? request : null;
    }
    return null;
  }

  public void processRequest() {
    if (!requests.isEmpty()) {
      Request requestDone = requests.poll();
      System.out.println("Request us done: " + requestDone);
    } else {
      System.out.println("Queue requests is empty!");
    }
  }

}
