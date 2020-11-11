package by.epam.taskFour.main;

import by.epam.taskFour.entity.NumberArray;
import by.epam.taskFour.report.NumberReport;
import by.epam.taskFour.service.NumberService;

public class NumberMain {
  public static void main(String[] args) {
    NumberArray array = new NumberArray(33, 55, 65, 44);
    NumberService service = new NumberService();
    boolean result = service.isTwoEvenNumbers(array);
    NumberReport report = new NumberReport();
    report.printEvenReport(result, array);
  }
}
