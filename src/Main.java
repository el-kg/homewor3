public class Main {
    public static void main(String[] args) {

        int a = 27897;
        byte b = 67;
        short c = -159;
        short c2 = 569;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной c2 с типом short равно " + c2);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);


        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEP = 30;
        int totalStudents = studentsLP + studentsAS + studentsEP;
        short totalPaper = 480;
        int paperPortion = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPortion +" листов бумаги");


        byte mashineProductivityPerMin = 16 / 2;
        int bottle20min = mashineProductivityPerMin * 20;
        System.out.println("За 20 минут машина произведет " + bottle20min + " штук бутылок");
        int bottleDay = mashineProductivityPerMin * 24 * 60;
        System.out.println("За сутки машина произведет " + bottleDay + " штук бутылок");
        int bottle3day = bottleDay * 3;
        System.out.println("За 3 дня машина произведет " + bottle3day + " штук бутылок");
        int bottleMonth = bottleDay * 31;
        System.out.println("За месяц машина произведет " + bottleMonth + " штук бутылок");

        byte totalPaint = 120;
        byte whitePaintNorm = 2;
        byte brownPaintNorm = 4;
        int paintNorm = whitePaintNorm + brownPaintNorm;
        int amountClass = totalPaint / paintNorm;
        System.out.println("В школе, где " + amountClass + " классов, нужно " + whitePaintNorm * amountClass + " банок белой краски и " + brownPaintNorm * amountClass + " банок коричневой краски");


        short bananas = 5 * 80;
        short milk = 2 * 105;
        short icecream = 2 * 100;
        short eggs = 4 * 70;
        int gainer = bananas + milk + icecream + eggs;
        float gainerKg = gainer / 1000f;
        System.out.println("Вес завтрака спортсмена " + gainer + "грамм, или " + gainerKg + " кг");

        short excessWeight = 7;
        float weightLoss1 = 0.25f;
        float weightLoss2 = 0.5f;
        float meanWeightLoss = excessWeight / ((weightLoss1 + weightLoss2) / 2);
        System.out.println("Если спортсмен будет терять 250г в день, весогонка составит " + excessWeight / weightLoss1 + " дней.");
        System.out.println("Если спортсмен будет терять 500г в день, весогонка составит " + excessWeight / weightLoss2 + " дней.");
        System.out.println("В среднем весогонка составит " + meanWeightLoss + " дней");


        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        float newMashaSalary = mashaSalary * 1.1f;
        float newDenisSalary = denisSalary * 1.1f;
        float newCristinaSalary = cristinaSalary * 1.1f;
        float newMashaAnnualIncome = (newMashaSalary - mashaSalary) * 12f;
        float newDenisAnnualIncome = (newDenisSalary - denisSalary) * 12f;
        float newCristinaAnnualIncome = (newCristinaSalary -cristinaSalary) * 12f;

        System.out.println("Маша теперь получает " + newMashaSalary + "рублей. Годовой доход вырос на " + newMashaAnnualIncome + "рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + "рублей. Годовой доход вырос на " + newDenisAnnualIncome+ " рублей");
        System.out.println("Кристина теперь получает " + newCristinaSalary +"рублей. Годовой доход вырос на " + newCristinaAnnualIncome + "рублей");


    }
}