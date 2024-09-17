
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GroupController controller1 = new GroupController();
        controller1.creaStudent("Лукошкина", "Ирина", "Викторовна");
        controller1.creaStudent("Петров", "Игорь", "Федорович");
        controller1.creaStudent("Завитушки", "Петр", "Семеныч");
        controller1.creaStudent("Бондаренко", "Мария", "Изольдовна");
        controller1.creaTeacher("Петраков", "Мануил", "Генадьевич");
        controller1.creaGroup();



    }
}