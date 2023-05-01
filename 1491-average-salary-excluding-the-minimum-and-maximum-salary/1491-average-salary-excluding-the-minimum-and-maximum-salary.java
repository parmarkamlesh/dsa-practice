class Solution {
    public double average(int[] salary) {
        int minSalary = salary[0];
        int maxSalary = salary[0];
        int totalSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            int s = salary[i];
            if (s < minSalary) {
                minSalary = s;
            } else if (s > maxSalary) {
                maxSalary = s;
            }
            totalSalary += s;
        }
        return (double)(totalSalary - minSalary - maxSalary) / (salary.length - 2);

    }
}