package Game;
import java.io.*;
import java.util.*;


public class IQ {

    public void openGame() throws Exception{

        Scanner in = new Scanner(new FileReader("d:\\file\\game\\country.txt"));
        List<String> Country = new ArrayList<String>();
        List<String> City = new ArrayList<String>();
        while (in.hasNext()) {
            Country.add(in.next());
            City.add(in.next());
        }


        Random random = new Random();
        Scanner enter = new Scanner(System.in);
        int n = 0;
        int score=0;
        String xxx = "Да";
        String cont = "Да";
        while (cont.toLowerCase().equals(xxx.toLowerCase())) {
                n++;
                int i = random.nextInt(Country.size());
                String otvet;
                System.out.println("Раунд " + n);
                System.out.printf("Какой город является столицей %s ?", Country.get(i));
                System.out.println();
                System.out.println("Ваш ответ? ");
                otvet = enter.nextLine();
                String sravnenie;
                if (City.get(i).toLowerCase().equals(otvet.toLowerCase())){
                    score+=5;
                    sravnenie = "Правильный ответ";}
                else sravnenie = "Не правильный ответ";
                System.out.printf("Столицей %s является %s.\nУ Вас %s", Country.get(i), City.get(i), sravnenie);
                System.out.println();
                System.out.printf("У вас: %s очков",score);
                System.out.println();
                Country.remove(i);
                City.remove(i);
                System.out.println("Сыграем еще разок? ");
                xxx = enter.nextLine();
            }
            System.out.println("Спасибо за игру!");
        }
    }




