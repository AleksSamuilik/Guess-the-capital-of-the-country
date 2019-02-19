package Game;


public class Main  {
        public static void main(String[] args) throws Exception {
            System.out.println("Добро пожаловать!");
            System.out.println("В этой игре вам необходимо отгадать название столицы." + "\nКомпьютер случайным образом " +
                    "выбирает из списка страну.");
            System.out.println("Если вы дали правильный ответ, вам начислят 5 очков.\nЕсли нет, у вас будет " +
                    "возможность попробовать угадать еще раз, пока вам не наскучит.");
            IQ print = new IQ();
            print.openGame();
                        }
        }

