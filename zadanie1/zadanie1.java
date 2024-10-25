package zadanie1;

import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        HangmanGame.startGame(); // Вызов метода из класса HangmanGame
    }
}

class HangmanGame {
    public static void startGame() {
        // Список слов для игры
        String[] words = {"java", "computer", "programming", "developer", "keyboard"};

        // Случайный выбор слова
        Random rand = new Random();
        String chosenWord = words[rand.nextInt(words.length)];

        // Подготовка массива для хранения угаданных букв
        char[] guessedWord = new char[chosenWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_'; // Заполняем пустыми символами
        }

        int lives = 6; // Количество жизней
        boolean won = false; // Индикатор победы
        Scanner scanner = new Scanner(System.in);

        // Основной игровой цикл
        while (lives > 0 && !won) {
            System.out.println("\nУгаданное слово: " + String.valueOf(guessedWord));
            System.out.println("Осталось жизней: " + lives);
            System.out.print("Введите букву: ");
            char guess = scanner.nextLine().charAt(0);

            // Проверяем, есть ли буква в слове
            boolean found = false;
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                lives--; // Уменьшаем количество жизней
            }

            // Проверяем, угадал ли игрок всё слово
            if (String.valueOf(guessedWord).equals(chosenWord)) {
                won = true;
            }
        }

        // Проверка результата игры
        if (won) {
            System.out.println("\nПоздравляем! Вы угадали слово: " + chosenWord);
        } else {
            System.out.println("\nИгра окончена. Вы проиграли. Слово было: " + chosenWord);
        }
    }
}
