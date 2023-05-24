package classworks.lesson19_20230522.requestResponseModel.DTO;

public class ResponseData {
  String response;

  boolean isCorrect;

  String status; // код ошибки

  public ResponseData(String response, boolean isCorrect, String status) {
    this.response = response;
    this.isCorrect = isCorrect;
    this.status = status;
  }
}