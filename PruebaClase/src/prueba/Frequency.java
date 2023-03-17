package prueba;

public class Frequency   
{  
     public static void main(String[] args) {  
        String str = "picture perfect";  
        int[] freq = new int[str.length()];  
        int i, j;  
          
        //Converts given string into character array  
        char cadena[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(cadena[i] == cadena[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    cadena[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(cadena[i] != ' ' && cadena[i] != '0')  
                System.out.println(cadena[i] + "-" + freq[i]);  
        }  
    }  
}  