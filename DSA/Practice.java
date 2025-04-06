package DSA;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

  public static void filterStrings() {
    List<String> strings = List.of("sumanth", "");
    strings.forEach(string -> System.out.println(string.length()));
    List<String> nonEmpty =
        strings.stream().filter(string -> !string.isEmpty()).toList();
    System.out.println(nonEmpty);
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);
  }

  public static void main(String[] args) {
    filterStrings();
  }

}
