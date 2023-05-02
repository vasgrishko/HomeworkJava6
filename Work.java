package HomeworkJava6;

import java.util.*;


public class Work {
    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }
    public static String userSInput(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }


    public static void main(String[] args) {
        Laptop Huawei1 = new Laptop("Huawei","8", "256", "Linux", "Black");
        Laptop Asus1 = new Laptop("Asus","8", "256", "Windows 10", "White");
        Laptop Apple1 = new Laptop("Apple", "8", "256", "Mac OS", "Red");
        Laptop Honor1 = new Laptop("Honor", "16", "512", "Windows XP", "Grey");

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(Honor1);
        laptops.add(Huawei1);
        laptops.add(Apple1);
        laptops.add(Asus1);

        int numSearch = userInput("Выберите критерии параметры сортировки:\n 1 - сортировка по марке, \n 2 - сортировка по оперативной памяти," +
                " \n 3 - сортировка по размеру SSD, \n 4 - сортировка по операционной системе, \n 5 - сортировка по цвету, \n 6 - показать весь список ");

        if (numSearch == 6){
            for (Laptop laptop: laptops) {
                laptop.printInfo();
                System.out.println();
            }
        }

        else if (numSearch == 1){
            String numParameter = userSInput("Напишите интересующий бренд");
            for (Laptop brand : laptops) {
                if (brand.getBrand().equalsIgnoreCase(numParameter)) {
                    System.out.println(brand.printInfo());
                }
            }
        }

        else if (numSearch == 2){
            String numParameter = userSInput("Напишите размер ram: ");
            for (Laptop ram : laptops) {
                if (ram.getRam().equalsIgnoreCase(numParameter)) {
                    System.out.println(ram.printInfo());
                }
            }
        }

        else if (numSearch == 3){
            String numParameter = userSInput("Напишите размер SSD: ");
            for (Laptop ssd : laptops) {
                if (ssd.getSSD().equalsIgnoreCase(numParameter)) {
                    System.out.println(ssd.printInfo());
                }
            }
        }

        else if (numSearch == 4){
            String numParameter = userSInput("Напишите интересующую операционную систему: ");
            for (Laptop os : laptops) {
                if (os.getOs().equalsIgnoreCase(numParameter)) {
                    System.out.println(os.printInfo());
                }
            }
        }

        else if (numSearch == 5){
            String numParameter = userSInput("Напишите интересующий цвет: ");
            for (Laptop color : laptops) {
                if (color.getColor().equalsIgnoreCase(numParameter)) {
                    System.out.println(color.printInfo());
                }
            }
        }

    }
} 

