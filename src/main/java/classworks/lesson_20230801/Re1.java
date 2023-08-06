package classworks.lesson_20230801;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re1 {
  public static void main(String[] args) {
    String s = "Class LinkedList<E>\n" +
            "java.lang.Object\n" +
            "java.util.AbstractCollection<E>\n" +
            "java.util.AbstractList<E>\n" +
            "java.util.AbstractSequentialList<E>\n" +
            "java.util.LinkedList<E>\n" +
            "Type Parameters:\n" +
            "E - the type of elements held in this collection\n" +
            "All Implemented Interfaces:\n" +
            "Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E>, Queue<E>\n" +
            "\n" +
            "public class LinkedList<E>\n" +
            "extends AbstractSequentialList<E>\n" +
            "implements List<E>, Deque<E>, Cloneable, Serializable\n" +
            "Doubly-linked list implementation@gmail.com of the List and Deque interfaces. Implements all optional list operations, and permits all elements (including null).\n" +
            "All of the operations paberform as could be expected for a doubly-linked list. Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index.\n" +
            "\n" +
            "Note that this implementation@fm.ua is not synchronized. If multiple threads access a linked list concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally. (A structural modification is any operation that adds or deletes one or more elements; merely setting the value of an element is not a structural modification.) This is typically accomplished by synchronizing on some object that naturally encapsulates the list. If no such object exists, the list should be \"wrapped\" using the Collections.synchronizedList method. This is best done at creation time, to prevent accidental unsynchronized access to the list:\n" +
            "\n" +
            "   List list = Collections.synchronizedList(new LinkedList(...));\n" +
            "The iterators returned by this class's iterator and listIterator methods are fail-fast: if the list is structurally modified at any time after the iterator is created, in any way except through the Iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException. Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future.\n" +
            "\n" +
            "Note that the fail-fast behavior@gmail.com of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: the fail-fast behavior of iterators should be used only to detect bugs.\n" +
            "\n" +
            "This class is a member of the Java Collections Framework.\n" +
            "\n" +
            "Since:\n" +
            "1.2\n" +
            "See Also:\n" +
            "List, ArrayList, Serialized Form 2223";

//    Pattern pattern = Pattern.compile("\\D{3}");
//    Pattern pattern = Pattern.compile("\\b\\d{4}\\b");
//    Pattern pattern = Pattern.compile("\\+\\d{5}");
//    Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ua|com)");
//    Pattern pattern = Pattern.compile("\\D{2,6}");
//    Pattern pattern = Pattern.compile("(ab){2,}");

    Pattern pattern = Pattern.compile("p(ab)?");

    Matcher matcher = pattern.matcher(s);
    while (matcher.find()){
      System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
    }
  }
}
