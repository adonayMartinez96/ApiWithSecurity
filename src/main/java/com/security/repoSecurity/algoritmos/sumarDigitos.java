package com.security.repoSecurity.algoritmos;

public class sumarDigitos {
    public static void main(String [] Args){
        /*String result = numerosPrimos(79);
        System.out.println(result);*/
        //sameMod(17);

        int[] arr =new int[4];
        arr[0] = 7;
        arr[1] = 0;
        arr[2] = 3;
        arr[3] = 0;

        removeZero(arr);

    }

    public static int sumarDig(int num){
        int sum = 0;

        while( num != 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;

    }

    public static String numeroPerfecto(int num){
        int total = 0;

        for(int i=1; i<num; i++){

            if(num % i == 0 ){
                total +=  i;
            }else {
                i++;
            }

        }

        if(total == num){
            return "number perfect";
        }else{
            return "number not perfect";
        }


    }

    public static void returnDivisors(int num){
        int div = 1;
        while(div <= num){
            if(num % div == 0){
                System.out.println(div);
            }
            div++;

        }
    }

    public static String numerosPrimos(int num){
        int bandera = 0;

        if(num >0){
            if(num % num == 0 && bandera  % 1 ==0){
                bandera = 1;
            }

        }else {
            return "el numero no es mayor que 0";
        }

        for(int i = num; i >=1;i--){
            if(i != num && i != 1){
                if(num % i == 0){
                    bandera++;
                }
            }
        }

        if(bandera == 1){
            return "number prime "+ num;
        }else{
            return "numbre not prime "+ num;
        }
    }

    public static void sameMod(int num){
        int modA;
        int modB;
        for (int i = 1; i <= num ; i++) {
            modA =num %  i;
            for (int j = i+1; j <num ; j++) {
                modB = num %  j;
                if(modA == modB){
                    System.out.println("num "+num  +" / "+ i+" and num "+ num + " / " + j + " it's has mod the number " + modA+" "+modB);
                }
            }

        }
    }

    public static void obtenerModa(int[] arr){
        int modeNumber = 0;
        int maxCounter = 0;
        int currentCounter = 0;
        int maxElement = arr[0];
        int currentElement = arr[0];


        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i-1] != arr[i]){
                if(currentCounter > maxCounter){
                    maxCounter = currentCounter;
                    maxElement = currentElement;
                }

                currentCounter=0;
                currentElement= arr[i];
            }
            currentCounter++;
        }




    }

    public static void removeZero(int[] arr){
        int k = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    


}
