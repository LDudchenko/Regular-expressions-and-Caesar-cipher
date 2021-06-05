import java.util.regex.Pattern;
/*Задание №21(Анализ типов аргументов, задаваемых при запуске программы.
Если аргумент является целым двоичным числом (шаблон:
одна и более цифр 0 и 1), то тип аргумента "Binary", иначе
"String". Программа выводит количество заданных аргументов
и, для каждого аргумента, его тип и значение.)*/
public class Task21 {
    public static void main(String[] args){
        System.out.printf("Total number of arguments: %d\n", args.length);
        Task21 ob =  new Task21();
        String[] result = ob.binary_or_string(args);
        for(int i=0; i<args.length; i++){
            System.out.print(result[i]+": "+args[i]+" ");
        }
    }
    public String[] binary_or_string(String[] args){
        String[] ret_arr = new String[args.length];
        int count=-1;
        for(int i=0; i<args.length;i++) {
            if(Pattern.matches("^[01]+$",args[i])==true){
                count++;
                ret_arr[count]="Binary";
            }
            else{
                count++;
                ret_arr[count]="String";
            }
        }
        return ret_arr;
    }
}
