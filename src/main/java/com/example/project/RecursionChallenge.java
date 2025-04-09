    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if(n == 1){
                    return 2;
                }else{
                    return 2 + bunnyEars(n-1);
                }
            }
        
            public static int factorial(int n){
                if(n==1){
                    return n;
                } else{
                    return n * factorial(n - 1);
                }
            }

            public static int sumNumbers(int n){
                if(n== 1){
                    return 1;
                }else{
                    return n + sumNumbers(n-1);
                }
            }

            public static String countDown(int n){
                String result = "";
                if(n == 0){
                    result += "Blast Off!";
                }else{
                    result += n + countDown(n-1);
                }
                return result;
            }

            public static int power(int x, int n){
                if(x == 1){
                    return 1;
                }
                if(n == 1){
                    return x;
                } else{
                    return x * power(x, n-1);
                }
            }

            public static int fib(int n){
                if(n < 2){
                    return n;
                } else{
                    return fib(n-1) + fib(n-2);
                }
            }

            public static int countX(String s){
                if(s.length() > 1){
                    return countX(s.substring(0, (s.length() /2))) + countX(s.substring((int)(s.length()) / 2));
                } else{
                    return s.equals("x") ? 1 : 0;
                }
            }
            
            public static String changePi(String s){
                if(s.length() <= 1){
                    return s;
                } else if(s.length() > 1 && s.substring(0,2).equals("pi")){
                    return "3.14" + changePi(s.substring(2));
                }else{
                    return s.substring(0,1) + changePi(s.substring(1));
                }
            }


            public static String reverse(String s){
                if(s.length()> 1){
                    System.out.println(s.substring((s.length())/2));
                    return reverse(s.substring((s.length())/2)) + reverse(s.substring(0, (s.length())/2));
                }else{
                    return s;
                }
            }

            public static Boolean isPalindrome(String s){
                if(s.length() <=1){
                    return true;
                }else{
                    return (s.substring(0, 1).equals(s.substring(s.length() - 1)) && isPalindrome(s.substring(1, s.length() - 1)));
                }
            }

    }