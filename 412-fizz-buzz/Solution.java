class Solution {
  public List<String> fizzBuzz(int n) {

    List<String> ans = new ArrayList<String>();

    for (int num = 1; num <= n; num++) {

      boolean divisibleBy3 = (num % 3 == 0);
      boolean divisibleBy5 = (num % 5 == 0);

      if (divisibleBy3 && divisibleBy5) {
        ans.add("FizzBuzz");
      } else if (divisibleBy3) {
        ans.add("Fizz");
      } else if (divisibleBy5) {
        ans.add("Buzz");
      } else {
        ans.add(Integer.toString(num));
      }
    }

    return ans;
  }
}