class Answer {
    public static int convertAndSum(String[] strings) {
        int sum = 0;
        for (String s : strings) {
            try {
                int number = Integer.parseInt(s);
                sum += number;
            } catch (NumberFormatException e) {
// Перехватываем ошибку преобразования и выбрасываем снова
                throw new NumberFormatException("Ошибка преобразования строки в число: " + s);
            }
        }
        if (sum > 100) {
            throw new ArithmeticException("Превышен лимит суммы");
        }
        return sum;
    }
}

