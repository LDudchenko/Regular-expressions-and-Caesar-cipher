
/*Задание№15(Создайте программу, которая осуществляет шифрование /
расшифровка модифицированным методом Цезаря. В нем
ключом является лозунг, который многократно повторяется до
тех пор, чтобы достичь длины открытого текста, а
шифрование / расшифровка заключается в суммировании /
вычитании кодов символов открытого текста / криптотексте с
соответствующими кодами символов лозунга.
)*/
public class Task15 {
    public static void main(String[] args){
        char[] key=("hi").toCharArray();
        char[] text=("I learn Java programming!").toCharArray();
        Task15 ob = new Task15();
        char[]res_arr=ob.cezar_code(key,text);
        System.out.print("Crypted text: ");
        for(int k=0; k<res_arr.length; k++) {
            System.out.print(res_arr[k]);
        }
        System.out.println();
        char[]res2_arr=ob.cezar_decode(key,res_arr);
        System.out.print("Enrypted text: ");
        for(int k=0; k<res2_arr.length; k++) {
            System.out.print(res2_arr[k]);
        }
    }
    public char[] cezar_code(char[] key, char[] text){
        char[] ret_arr = new char[text.length];
        char[] key2= new char[text.length];
        int j=0;
        int i=0;
        while(i<text.length){
            key2[i]=key[j];
            j++;
            if(j==key.length){
                j=0;
            }
            i++;
        }
        int count=-1;
        for(int l=0; l<text.length;l++)
            for(int p=0; p<key2.length;p++){
                if(p==l){
                   if(Character.isUpperCase(text[l])){
                        count++;
                        ret_arr[count]=(char)(((text[l] + key2[p]) % 26) + 'A');
                    }
                   else if(Character.isDigit(text[l])){
                       count++;
                       ret_arr[count]=(char)(((text[l] + key2[p]) %10)+ '0');
                   }
                   else if( !Character.isLetterOrDigit(text[l]) ){
                       count++;
                       ret_arr[count]=(char)(((text[l] + key2[p]) % 16) + ' ');
                    }
                   else {
                        count++;
                        ret_arr[count] = (char)(((text[l] + key2[p]) % 26) + 'a');
                    }
                }
            }
        return ret_arr;
    }
    public char[] cezar_decode(char[] key, char[] text){
        char[] ret_arr = new char[text.length];
        char[] key2= new char[text.length];
        int j=0;
        int i=0;
        while(i<text.length){
            key2[i]=key[j];
            j++;
            if(j==key.length){
                j=0;
            }
            i++;
        }
        int count=-1;
        for(int l=0; l<text.length;l++)
            for(int p=0; p<key2.length;p++){
                if(p==l){
                    if(Character.isUpperCase(text[l])){
                        count++;
                        ret_arr[count]=(char)((((text[l] - key2[p])+52) % 26) + 'A');
                    }
                   else if(Character.isDigit(text[l])){
                        count++;
                        ret_arr[count]=(char)((((text[l] - key2[p])+84) % 10) + '0');
                    }
                    else if( !Character.isLetterOrDigit(text[l]) ){
                        count++;
                        ret_arr[count]=(char)((((text[l] - key2[p])+96) % 16) + ' ');
                    }
                    else {
                        count++;
                        ret_arr[count] = (char)((((text[p] - key2[l]) + 40) % 26) + 'a');
                    }
                }
            }
        return ret_arr;
    }

}
