package by.tms.lesson8.calculation;

public class Main {
    public static void main(String[] args) {
        Bot scannerForFirstFigure = new Bot();
        Bot scannerForSecondFigure = new Bot();

        int firstSquareFigure = FigureCalculation.square(scannerForFirstFigure.acceptFirstSideFromConsole(), scannerForFirstFigure.acceptSecondSideFromConsole(),
                                                        scannerForFirstFigure.acceptThirdSideFromConsole(), scannerForFirstFigure.acceptFourthSideFromConsole());
        System.out.println(firstSquareFigure);
        int secondSquareFigure = FigureCalculation.square(scannerForSecondFigure.acceptFirstSideFromConsole(), scannerForSecondFigure.acceptSecondSideFromConsole(),
                                                        scannerForSecondFigure.acceptThirdSideFromConsole(), scannerForSecondFigure.acceptFourthSideFromConsole());
        System.out.println(secondSquareFigure);
        FigureCalculation.areaComparson(firstSquareFigure, secondSquareFigure);
    }
}
