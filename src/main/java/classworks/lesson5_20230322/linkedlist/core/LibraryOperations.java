package classworks.lesson5_20230322.linkedlist.core;

import classworks.lesson5_20230322.linkedlist.entity.Book;
import classworks.lesson5_20230322.linkedlist.service.InputData;
import classworks.lesson5_20230322.linkedlist.service.OutputData;

import java.util.List;

public class LibraryOperations {

    LibraryUtil lu = new LibraryUtil();
    InputData inputData = new InputData();
    OutputData outputData = new OutputData();

    List<Book> ourLibrary;

    public void run(){
      int sizeOfOurLibrary = inputData.inputNumberOfElements();
      List<Book> ourLibrary = lu.createLibrary();
      lu.fillLibrary(ourLibrary, sizeOfOurLibrary, inputData, false);
      outputData.printOurLibrary("Our library: ", ourLibrary);

      lu.fillLibrary(ourLibrary, 1, inputData, true);
      lu.fillLibrary(ourLibrary, 1, inputData, false);
      outputData.printOurLibrary("Our library, after second addition: ", ourLibrary);

      System.out.println("---------------------------------------------------------");
      Book bookAfterSearch = lu.searchBook(ourLibrary, inputData.inputSearchCriteria());
      System.out.println(inputData.inputSearchCriteria());
      lu.deleteBook(ourLibrary, bookAfterSearch);
      outputData.printOurLibrary("Our library after search: ", ourLibrary);
    }

}
