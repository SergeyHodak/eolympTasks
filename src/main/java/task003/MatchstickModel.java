package task003;

import java.util.List;

public class MatchstickModel {
    public int theMinimumNumberOfMatchesToImplementNCubes(int n) {
        List<Integer> onWhichCubeItIsAdvisableToUseFiveMatches = List.of(4, 6, 7, 10, 11, 14, 15, 17, 20, 21, 23, 25);
        List<Integer> onWhichCubeItIsAdvisableToUseThreeMatches = List.of(8, 12, 16, 18, 22, 24, 26, 27);
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                result += 12;
            } else if (onWhichCubeItIsAdvisableToUseFiveMatches.contains(i)) {
                result += 5;
            } else if (onWhichCubeItIsAdvisableToUseThreeMatches.contains(i)) {
                result += 3;
            } else {
                result += 8;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
    /* Профессор Самоделкин решил изготовить объемную модель кубиков из спичек, используя спички для рёбер кубиков.
       Длина ребра каждого кубика равна одной спичке.

       Для построения модели трех кубиков он использовал 28 спичек.

           /---------/---------/---------/
          /|        /|        /|        /|
         /---------/---------/---------/ |
         | |-------|-|-------|-|-------|-|
         | /       | /       | /       | /
         |/        |/        |/        |/
         |---------|---------|---------|

       Какое наименьшее количество спичек нужно Самоделкину для построения модели из n кубиков?

       Все числа в задаче не превышают 2·10^9.

       Входные данные
       Одно число n – количество кубиков в модели.

       Выходные данные
       Выведите наименьшее количество спичек необходимое для построения модели из n кубиков.
    */
}