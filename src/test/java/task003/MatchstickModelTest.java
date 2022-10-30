package task003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatchstickModelTest {
    @Test
    public void ifTheInputIsZero() {
        int inputN = 0;
        int output = 0;
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
    }

    @Test
    public void noOptimizationsBecauseThereIsOnlyOneCube() {
        int inputN = 1;
        int output = 12; // 0+12
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                /----------/
               /|         /|
              /----------/ |
              | |        | |
              | /--------|-/
              |/         |/
              |----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesWithTwoCubes() {
        int inputN = 2;
        int output = 20; // 0+12+8
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                /----------/----------/
               /|         /|         /|
              /----------/----------/ |
              | |        | |        | |
              | /--------|-/--------|-/
              |/         |/         |/
              |----------|----------|
         */
    }

    @Test
    public void theLeastNumberOfMatchesWithThreeDice() {
        int inputN = 3;
        int output = 28; // 0+12+8+8
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                /----------/----------/
               /|         /|         /|
              /----------/----------/ |
              | |        | |        | |
              | /--------|-/--------|-/
              |/         |/|        |/|
              |----------|----------| |
                         | |        | |
                         | /--------|-/
                         |/         |/
                         |----------|
         */
    }

    @Test
    public void TheSmallestNumberOfMatchesForFourCubes() {
        int inputN = 4;
        int output = 33; // 0+12+8+8+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                /----------/----------/
               /|         /|         /|
              /----------/----------/ |
              | |        | |        | |
              | /--------|-/--------|-/
              |/|        |/|        |/|
              |----------|----------| |
              | |        | |        | |
              | /--------|-/--------|-/
              |/         |/         |/
              |----------|----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForFiveCubes() {
        int inputN = 5;
        int output = 41; // 0+12+8+8+5+8
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                    /----------/----------/
                   /|         /|         /|
                  /----------/----------/ |
                 /| |       /| |        | |
                / | /------/-|-/--------|-/
               /----------/  |/|        |/|
               |  |-------|--|----------| |
               | /| |     | /| |        | |
               |/ | /-----|/-|-/--------|-/
               |----------|  |/         |/
                  |----------|----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForSixCubes() {
        int inputN = 6;
        int output = 46; // 0+12+8+8+5+8+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                    /----------/----------/
                   /|         /|         /|
                  /----------/----------/ |
                 /| |       /| |       /| |
                / | /------/-|-/------/-|-/
               /----------/----------/  |/|
               |  |-------|--|-------|--| |
               | /| |     | /| |     | /| |
               |/ | /-----|/-|-/-----|/-|-/
               |----------|----------|  |/
                  |----------|----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForSevenCubes() {
        int inputN = 7;
        int output = 51; // 0+12+8+8+5+8+5+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                    /----------/----------/
                   /|         /|         /|
                  /----------/----------/ |
                 /| |       /| |       /| |
                / | /------/-|-/------/-|-/
               /----------/----------/  |/|
               |  |-------|--|-------|--| |
               | /| |     | /| |     | /| |
               |/ | /-----|/-|-/-----|/-|-/
               |----------|----------|  |/
               |  |-------|--|----------|
               | /        | /
               |/         |/
               |----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForEightCubes() {
        int inputN = 8;
        int output = 54; // 0+12+8+8+5+8+5+5+3
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                    /-----------/-----------/
                   /|          /|          /|
                  /-----------/-----------/ |
                 /| |        /| |        /| |
                / | /-------/-|-/-------/-|-/
               /-----------/-----------/  |/|
               |  |--------|--|--------|--| |
               | /| |      | /| |      | /| |
               |/ | /------|/-|-/------|/-|-/
               |-----------|-----------|  |/
               |  |--------|--|--------|--|
               | /         | /         | /
               |/          |/          |/
               |-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForNineCubes() {
        int inputN = 9;
        int output = 62; // 0+12+8+8+5+8+5+5+3+8
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                  /-----------/-----------/
                 /|          /|          /|
                / |         / |         / |
               /-----------/-----------/  |
              /|  |-------/|--/-------/|--/
             / | /|      / | /|      / | /|
            /-----------/-----------/  |/ |
            |  /--------|--/--------|--/-----------/
            | /|  |-----|-/|--|-----|-/|--|       /|
            |/ | /      |/ | /      |/ | /       / |
            /-----------/-----------/-----------/  |
            |  |--------|--|--------|--|--------|--|
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTenCubes() {
        int inputN = 10;
        int output = 67; // 0+12+8+8+5+8+5+5+3+8+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                  /-----------/-----------/
                 /|          /|          /|
                / |         / |         / |
               /-----------/-----------/  |
              /|  |-------/|--/-------/|--/-----------/
             / | /|      / | /|      / | /|          /|
            /-----------/-----------/  |/ |         / |
            |  /--------|--/--------|--/-----------/  |
            | /|  |-----|-/|--|-----|-/|--|-------/|--|
            |/ | /      |/ | /      |/ | /       / | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--|
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForElevenCubes() {
        int inputN = 11;
        int output = 72; // 0+12+8+8+5+8+5+5+3+8+5+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                  /-----------/-----------/-----------/
                 /|          /|          /|          /|
                / |         / |         / |         / |
               /-----------/-----------/-----------/  |
              /|  |-------/|--/-------/|--/--------|--/
             / | /|      / | /|      / | /|        | /|
            /-----------/-----------/  |/ |        |/ |
            |  /--------|--/--------|--/-----------/  |
            | /|  |-----|-/|--|-----|-/|--|-------/|--|
            |/ | /      |/ | /      |/ | /       / | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--|
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTwelveCubes() {
        int inputN = 12;
        int output = 75; // 0+12+8+8+5+8+5+5+3+8+5+5+3
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                  /-----------/-----------/-----------/
                 /|          /|          /|          /|
                / |         / |         / |         / |
               /-----------/-----------/-----------/  |
              /|  |-------/|--/-------/|--/-------/|--/
             / | /|      / | /|      / | /|      / | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--|
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForThirteenCubes() {
        int inputN = 13;
        int output = 83; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                                          /-----------/
                                         /|          /|
                                        / |         / |
                                       /-----------/  |
                  /-----------/--------|--/--------|--/
                 /|          /|        | /|        | /|
                / |         / |        |/ |        |/ |
               /-----------/-----------/-----------/  |
              /|  |-------/|--/-------/|--/-------/|--/
             / | /|      / | /|      / | /|      / | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--|
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForFourteenCubes() {
        int inputN = 14;
        int output = 88; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                              /-----------/-----------/
                             /|          /|          /|
                            / |         / |         / |
                           /-----------/-----------/  |
                  /--------|--/--------|--/--------|--/
                 /|        | /|        | /|        | /|
                / |        |/ |        |/ |        |/ |
               /-----------/-----------/-----------/  |
              /|  |-------/|--/-------/|--/-------/|--/
             / | /|      / | /|      / | /|      / | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--|
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForFifteenCubes() {
        int inputN = 15;
        int output = 93; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                              /-----------/-----------/
                             /|          /|          /|
                            / |         / |         / |
                           /-----------/-----------/  |
                  /--------|--/-------/|--/-------/|--/
                 /|        | /|      / | /|      / | /|
                / |        |/ |     /-----------/  |/ |
               /-----------/--------|--/--------|--/  |
              /|  |-------/|--/-----|-/|--/-----|-/|--/
             / | /|      / | /|     |/ | /|     |/ | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--/
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForSixteenCubes() {
        int inputN = 16;
        int output = 96; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                              /-----------/-----------/
                             /|          /|          /|
                            / |         / |         / |
                           /-----------/-----------/  |
                  /-------/|--/-------/|--/-------/|--/
                 /|      / | /|      / | /|      / | /|
                / |     /-----------/-----------/  |/ |
               /--------|--/--------|--/--------|--/  |
              /|  |-----|-/|--/-----|-/|--/-----|-/|--/
             / | /|     |/ | /|     |/ | /|     |/ | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--/
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForSeventeenCubes() {
        int inputN = 17;
        int output = 101; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                  /-----------/-----------/-----------/
                 /|          /|          /|          /|
                / |         / |         / |         / |
               /-----------/-----------/-----------/  |
               |  /-------/|--/-------/|--/-------/|--/
               | /|      / | /|      / | /|      / | /|
               |/ |     /-----------/-----------/  |/ |
               /--------|--/--------|--/--------|--/  |
              /|  |-----|-/|--/-----|-/|--/-----|-/|--/
             / | /|     |/ | /|     |/ | /|     |/ | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--/
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForEighteenCubes() {
        int inputN = 18;
        int output = 104; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                  /-----------/-----------/-----------/
                 /|          /|          /|          /|
                / |         / |         / |         / |
               /-----------/-----------/-----------/  |
              /|  /-------/|--/-------/|--/-------/|--/
             / | /|      / | /|      / | /|      / | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--/-----|-/|--/-----|-/|--/
            |/ | /|     |/ | /|     |/ | /|     |/ | /|
            /-----------/-----------/-----------/  |/ |
            |  /--------|--/--------|--/--------|--/  |
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--|
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
            |  |--------|--|--------|--|--------|--/
            | /         | /         | /         | /
            |/          |/          |/          |/
            |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForNineteenCubes() {
        int inputN = 19;
        int output = 112; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3+8
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                     /-----------/-----------/-----------/
                    /|          /|          /|          /|
                   / |         / |         / |         / |
                  /-----------/-----------/-----------/  |
                 /|  /-------/|--/-------/|--/-------/|--/
                / | /|      / | /|      / | /|      / | /|
               /-----------/-----------/-----------/  |/ |
              /|  /-------/|--/--------|--/--------|--/  |
             / | /|  |---/-|-/|--/-----|-/|--/-----|-/|--/
            /-----------/  |/ | /|     |/ | /|     |/ | /|
            |  /--------|--/-----------/-----------/  |/ |
            | /|  /-----|-/|--/--------|--/--------|--/  |
            |/ | /|  |--|/-|-/|--|-----|-/|--|-----|-/|--|
            /-----------/  |/ | /      |/ | /      |/ | /
               /-----------/-----------/-----------/  |/
               |  |--------|--|--------|--|--------|--/
               | /         | /         | /         | /
               |/          |/          |/          |/
               |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTwentyCubes() {
        int inputN = 20;
        int output = 117; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3+8+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                     /-----------/-----------/-----------/
                    /|          /|          /|          /|
                   / |         / |         / |         / |
                  /-----------/-----------/-----------/  |
                 /|  /-------/|--/-------/|--/-------/|--/
                / | /|      / | /|      / | /|      / | /|
               /-----------/-----------/-----------/  |/ |
              /|  /-------/|--/--------|--/--------|--/  |
             / | /|  |---/-|-/|--/-----|-/|--/-----|-/|--/
            /-----------/  |/ | /|     |/ | /|     |/ | /|
            |  /--------|--/-----------/-----------/  |/ |
            | /|  /-----|-/|--/--------|--/--------|--/  |
            |/ | /|  |--|/-|-/|--|-----|-/|--|-----|-/|--|
            /-----------/  |/ | /      |/ | /      |/ | /
            |  /--------|--/-----------/-----------/  |/
            | /|  |-----|-/|--|--------|--|--------|--/
            |/ | /      |/ | /         | /         | /
            /-----------/  |/          |/          |/
               |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTwentyOneCubes() {
        int inputN = 21;
        int output = 122; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3+8+5+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                     /-----------/-----------/-----------/
                    /|          /|          /|          /|
                   / |         / |         / |         / |
                  /-----------/-----------/-----------/  |
                 /|  /-------/|--/-------/|--/-------/|--/
                / | /|      / | /|      / | /|      / | /|
               /-----------/-----------/-----------/  |/ |
              /|  /-------/|--/-------/|--/--------|--/  |
             / | /|  |---/-|-/|--/---/-|-/|--/-----|-/|--/
            /-----------/-----------/  |/ | /|     |/ | /|
            |  /--------|--/--------|--/-----------/  |/ |
            | /|  /-----|-/|--/-----|-/|--/--------|--/  |
            |/ | /|  |--|/-|-/|--|--|/-|-/|--|-----|-/|--|
            /-----------/-----------|  |/ | /      |/ | /
            |  /--------|--/-----------/-----------/  |/
            | /|  |-----|-/|--|--------|--|--------|--/
            |/ | /      |/ | /         | /         | /
            /-----------/  |/          |/          |/
               |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTwentyTwoCubes() {
        int inputN = 22;
        int output = 125; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3+8+5+5+3
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                     /-----------/-----------/-----------/
                    /|          /|          /|          /|
                   / |         / |         / |         / |
                  /-----------/-----------/-----------/  |
                 /|  /-------/|--/-------/|--/-------/|--/
                / | /|      / | /|      / | /|      / | /|
               /-----------/-----------/-----------/  |/ |
              /|  /-------/|--/-------/|--/--------|--/  |
             / | /|  |---/-|-/|--/---/-|-/|--/-----|-/|--/
            /-----------/-----------/  |/ | /|     |/ | /|
            |  /--------|--/--------|--/-----------/  |/ |
            | /|  /-----|-/|--/-----|-/|--/--------|--/  |
            |/ | /|  |--|/-|-/|--|--|/-|-/|--|-----|-/|--|
            /-----------/-----------|  |/ | /      |/ | /
            |  /--------|--/--------|--/-----------/  |/
            | /|  |-----|-/|--|-----|-/|--|--------|--/
            |/ | /      |/ | /      |/ | /         | /
            /-----------/-----------|  |/          |/
               |-----------|-----------|-----------|
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTwentyThreeCubes() {
        int inputN = 23;
        int output = 130; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3+8+5+5+3+5
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                     /-----------/-----------/-----------/
                    /|          /|          /|          /|
                   / |         / |         / |         / |
                  /-----------/-----------/-----------/  |
                 /|  /-------/|--/-------/|--/-------/|--/
                / | /|      / | /|      / | /|      / | /|
               /-----------/-----------/-----------/  |/ |
              /|  /-------/|--/-------/|--/-------/|--/  |
             / | /|  |---/-|-/|--/---/-|-/|--/---/-|-/|--/
            /-----------/-----------/-----------/  |/ | /|
            |  /--------|--/--------|--/--------|--/  |/ |
            | /|  /-----|-/|--/-----|-/|--/-----|-/|--/  |
            |/ | /|  |--|/-|-/|--|--|/-|-/|--|--|/-|-/|--|
            /-----------/-----------/-----------/  |/ | /
            |  /--------|--/--------|--/-----------/  |/
            | /|  |-----|-/|--|-----|-/|--|--------|--/
            |/ | /      |/ | /      |/ | /         | /
            /-----------/-----------/  |/          |/
               /-----------/-----------/-----------/
         */
    }

    @Test
    public void theSmallestNumberOfMatchesForTwentyFourCubes() {
        int inputN = 24;
        int output = 133; // 0+12+8+8+5+8+5+5+3+8+5+5+3+8+5+5+3+5+3+8+5+5+3+5+3
        Assertions.assertEquals(output, new MatchstickModel().theMinimumNumberOfMatchesToImplementNCubes(inputN));
        /*
                     /-----------/-----------/-----------/
                    /|          /|          /|          /|
                   / |         / |         / |         / |
                  /-----------/-----------/-----------/  |
                 /|  /-------/|--/-------/|--/-------/|--/
                / | /|      / | /|      / | /|      / | /|
               /-----------/-----------/-----------/  |/ |
              /|  /-------/|--/-------/|--/-------/|--/  |
             / | /|  |---/-|-/|--/---/-|-/|--/---/-|-/|--/
            /-----------/-----------/-----------/  |/ | /|
            |  /--------|--/--------|--/--------|--/  |/ |
            | /|  /-----|-/|--/-----|-/|--/-----|-/|--/  |
            |/ | /|  |--|/-|-/|--|--|/-|-/|--|--|/-|-/|--|
            /-----------/-----------/-----------/  |/ | /
            |  /--------|--/--------|--/--------|--/  |/
            | /|  |-----|-/|--|-----|-/|--|-----|-/|--/
            |/ | /      |/ | /      |/ | /      |/ | /
            /-----------/-----------/-----------/  |/
               /-----------/-----------/-----------/
         */
    }
}