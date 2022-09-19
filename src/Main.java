public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 65535;
        int total = 0;
        int i = 0;
        for(; total < 2_459_000; i++){
            total = total + total/100;
            total = total + salary;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total+ " рублей");
        }
        System.out.print(total);
        System.out.print(i);

        System.out.print("Задание 2");
            int c=0;
            for (;c<10;c++){
                System.out.println(" "+c);
                int a=10;
                for (;a>0;a--){
                    System.out.println(" "+a);

                    System.out.println("Задание 3");
                    int y=1;
                    for (;y<11;y++){
                        int populatioтСountry = 12_000_000;
                        int birth = 17;
                        int mortality = 8;
                        int growth = birth - mortality;
                        int totalGrowth = growth * (populatioтСountry/1000);
                        int populatioтСountryYear = (populatioтСountry+ totalGrowth)*y;
                        System.out.println("Год " + y + " Количество населения " + populatioтСountryYear);
                    }

                }

        }
    }

}