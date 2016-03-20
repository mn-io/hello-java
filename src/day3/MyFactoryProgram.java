package day3;

public class MyFactoryProgram {
    public static void main(String[] args) {

        INamedListSorter sorter = getNamedListSorter();
        fillSorter(sorter);

        System.out.println("Ausgabe sortiert:");
        sorter.printAllSorted();
    }

    private static void fillSorter(INamedListSorter sorter) {
        String lastInput;
        do {
            lastInput = day2.ListInput.readInput("Bitte eine Zahl Eingaben (Leere Eingabe=Ende): ");
            try {
                Integer asInt = Integer.valueOf(lastInput);
                sorter.add(asInt);
            } catch (NumberFormatException e) {
                if (!lastInput.isEmpty()) {
                    System.out.println("Zahl nicht erkannt.");

                }
            }
        } while (!lastInput.isEmpty());
    }

    private static INamedListSorter getNamedListSorter() {
        String lastInput;
        INamedListSorter sorter = null;

        do {
            lastInput = day2.ListInput.readInput("Bitte Algorithmus angeben: ");
            try {
                sorter = new SortFactory().getAlgorithm(lastInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Eingabe nicht verstanden. Bitte nochmal probieren.");
            }
        } while (sorter == null);
        return sorter;
    }
}
