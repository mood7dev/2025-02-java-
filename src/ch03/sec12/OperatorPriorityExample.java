package ch03.sec12;

public class OperatorPriorityExample {
    public static void main(String[] args) {
int a, b, c;
a = b = c = 5;
System.out.println("a: " + a);
System.out.println("b: " + b);
System.out.println("c: " + c);

int var1 = 1, var2 = 3, var3 = 2;
int result = var1 + var2 * var3;
System.out.println("result: " + result);
        int result2 = (var1 + var2) * var3;
        System.out.println("result2: " + result2);
    }
    }
    /*
    연산 우선순위
    (x > 0 && y < 0)의 연산 순서는
    1. x > 0
    2. y < 0
    3. 결과 불린 값 && 결과불린값

(100 * 2 / 3 % 5)의 연산 순서는
1.100 * 2
2. 1의 결과값 / 3
3. 1의 결과값 % 5

a=b=c=5;
1. c = 5
2. b = c
3. a = b
     */