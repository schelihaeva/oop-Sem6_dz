// Реализация уборки квартиры
public class ClearImplement implements ClearningApart {
    @Override
    public void dustTreatmen() {
        System.out.println("Влажная уборка поверхностей от пыли, грязи, пятен ");
    }

    @Override
    public void vacuuming() {
        System.out.println("Пылесосим ворсистые поверхности квартиры ");
    }

    @Override
    public void floorСleaning() {
        System.out.println("Делаем влажную уборку пола");
    }

    @Override
    public void changeOfBedLinen() {
        System.out.println("Производим замену постельного белья, полотенец");
    }

    @Override
    public void washingMirrors() {
        System.out.println("Протираем стекла, зеркала");
    }
    @Override
    public void ventilation() {
        System.out.println("Проветриваем квартиру");
    }
}