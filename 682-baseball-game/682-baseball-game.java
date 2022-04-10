class Solution {
  public int calPoints(String[] ops) {
    ArrayDeque < Integer > stack = new ArrayDeque < > ();
    int sum = 0;
    for (String op: ops) {
      switch (op) {
      case "+":
        int num1 = stack.pop();
        int num2 = stack.peek();

        stack.push(num1);
        stack.push(num1 + num2);

        break;
      case "D":
        stack.push(stack.peek() * 2);
        break;

      case "C":
        stack.pop();
        break;

      default:
        stack.push(Integer.valueOf(op));
      }
    }

    for (int n: stack) {
      sum += n;
    }

    return sum;

  }
}