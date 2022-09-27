import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please type inn the task ( 1 - 3 ) you want to try out: ");
        int task = read.nextInt();
        if(task == 1){
            oppgave1();
        }else if(task == 2){
            oppgave2();
        }else if(task == 3){
            oppgave3();
        }

    }
    public static void oppgave1(){
        System.out.println("please type in your annual salary");
        int annualSalary = read.nextInt();
        if(annualSalary <= 164100){
            System.out.println("your tax is 0%");
        } else if (annualSalary <= 230950){
            System.out.println("your tax is 1,7%");
            System.out.printf("with you sallary as %s$ \nit comes to %s$ in taxes\nThat leaves you with %s",annualSalary,(annualSalary*0.017),(annualSalary-(annualSalary*0.017)));
        }else if (annualSalary <= 580650){
            System.out.println("your tax is 4%");
            System.out.printf("with you sallary as %s$ \nit comes to %s$ in taxes\nThat leaves you with %s",annualSalary,(annualSalary*0.04),(annualSalary-(annualSalary*0.04)));
        }else if (annualSalary <= 934050){
            System.out.println("your tax is 13,4%");
            System.out.printf("with you sallary as %s$ \nit comes to %s$ in taxes\nThat leaves you with %s",annualSalary,(annualSalary*0.134),(annualSalary-(annualSalary*0.134)));
        }else if (annualSalary <= 1999999){
            System.out.println("your tax is 16,4%");
            System.out.printf("with you sallary as %s$ \nit comes to %s$ in taxes\nThat leaves you with %s",annualSalary,(annualSalary*0.164),(annualSalary-(annualSalary*0.164)));
        } else {
            System.out.println("your tax is 17,4%");
            System.out.printf("with you sallary as %s$ \nit comes to %s$ in taxes\nThat leaves you with %s",annualSalary,(annualSalary*0.174),(annualSalary-(annualSalary*0.174)));
        }

    }
    public static void oppgave2(){
        for(int i = 1; i <= 10; i++){
            System.out.printf("hello person %s. \nPlease type in your score \n", i);
            int score = read.nextInt();

            if(score >= 0 && score <= 100){

                if(score <= 39){
                    System.out.printf("Person %s got a F\n",i);
                }else if(score <= 49){
                    System.out.printf("Person %s got a E\n",i);
                }else if(score <= 59){
                    System.out.printf("Person %s got a D\n",i);
                }else if(score <= 79){
                    System.out.printf("Person %s got a C\n",i);
                }else if(score <= 89){
                    System.out.printf("Person %s got a B\n",i);
                }else {
                    System.out.printf("Person %s got a A\n",i);
                }
            } else {
                System.out.println("not a valid score \nTry again");
                i--;
            }
        }
    }
    public static void oppgave3(){
        System.out.print("Please type in a number: ");
        int n = read.nextInt();
        long resultat = 1;
        for(int i = 0; i < n; i++){
            if((n-i) == 1){
                System.out.print(n-i);

                System.out.printf(" = %s",resultat);
            }else{
                System.out.printf("%s * ", (n-i));
            }
            resultat = resultat * (n-i);
        }
        System.out.println();
        System.out.printf("%s! = %s",n,resultat);
    }
}