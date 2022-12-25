public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        
        for (String s : tokens) {
            if (!"*/+-".contains(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();

                int result = 0;

                switch (s) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num2 - num1;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num2 / num1;
                        break;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }
