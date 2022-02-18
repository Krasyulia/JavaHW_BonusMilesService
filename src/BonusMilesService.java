public class BonusMilesService {
    public static int calculate(int cost) {
        int bonus = 20; //количество рублей для одной мили
        return (cost / bonus); //возврат рассчитанного бонуса
    }
}
