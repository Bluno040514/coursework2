
    public static int[] average_grades(int[][] grades, int[] weights) {
        int[] averageGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int sum = 0; // 将 sum 重置为 0，以便为每个学生计算加权平均分
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j] * weights[j];
            }
            averageGrades[i] = sum / 100;
        }
        return averageGrades;
    }


        int[][] grades = {{51, 83, 28}, {0, 38, 95}};
        int[] weights = {30, 40, 30};
        int[] result = average_grades(grades, weights);
        for (
                int grade : result) {
            System.out.println(grade);
