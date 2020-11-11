package by.epam.taskTen.main;


import by.epam.taskTen.entity.Data;
import by.epam.taskTen.report.DataReport;
import by.epam.taskTen.service.DataService;

//10.	Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
// Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй
// - соответствующие значения функции.
//
public class Main {
    public static void main(String[] args) {
        Data data = new Data(1,10,0.5);
        DataService service = new DataService();
        DataReport report = new DataReport();
        report.print(service.calculateFunction(data));
    }
}


