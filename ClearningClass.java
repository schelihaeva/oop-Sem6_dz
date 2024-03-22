// Класс, представляющий уборку квартиры
public class ClearningClass {
    private final ClearningApart cleaning;

    // Конструктор, принимающий уборку квартиры
    public ClearningClass(ClearningApart cleaning) {
        this.cleaning = cleaning;
    }

    // Метод для уборки квартиры
    public void apartClear() {
        cleaning.dustTreatmen();
        cleaning.vacuuming();
        cleaning.floorСleaning();
        cleaning.changeOfBedLinen();
        cleaning.washingMirrors();
        cleaning.ventilation();
    }

    // Точка входа в программу
    public static void main(String[] args) {
        // Создаем экземпляр реализации уборки квартиры
    

        ClearningApart clearImplement = new ClearImplement();;

        // Создаем экземпляр класса для уборки квартиры и передаем ему порядок действий
        ClearningClass clearningClass = new ClearningClass(clearImplement);

        // Вызываем метод для убоки квартиры
        clearningClass.apartClear();
    }
}