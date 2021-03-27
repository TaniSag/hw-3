public class ATM {
    public int countBanknotes(int sum) {
        int count = 0;
        int result = sum;

        while (result  >= 500){
            result-=500;
            count++;
        }

        while(result >=200 ){
            result -= 200;
            count++;
        }

        while(result >= 100 ){
            result -= 100;
            count++;
        }

        while(result  >= 50 ){
            result -= 50;
            count++;
        }

        while(result  >= 20 ){
            result -= 20;
            count++;
        }

        while(result  >= 10 ){
            result -= 10;
            count++;
        }

        while(result  >= 5 ){
            result -= 5;
            count++;
        }

        while(result  >= 2 ){
            result -= 2;
            count++;
        }

        while(result  >= 1 ){
            result -= 1;
            count++;
        }

        return count;
    }
    }



