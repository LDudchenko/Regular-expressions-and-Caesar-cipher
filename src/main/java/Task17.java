import java.util.regex.Pattern;
/*Задание №17(Анализ типов аргументов, задаваемых при запуске программы.
Если аргумент является десятичным числом с целой и дробной
частью (шаблон: состоит из одной или нескольких цифр,
одной десятичной точки, которая может быть в начале, в
середине или в конце числа, и, кроме того, первым символом
числа может быть знак "+" или "-"), то тип аргумента
"Decimal", иначе "String". Программа выводит количество
заданных аргументов и, для каждого аргумента, его тип и
значение.
)*/
public class Task17 {
    public static void main(String[] args){
        System.out.printf("Total number of arguments: %d\n", args.length);
        Task17 ob =  new Task17();
        String[] result = ob.decimal_or_string(args);
        for(int i=0; i<args.length; i++){
            System.out.print(result[i]+": "+args[i]+" ");
        }
    }
        public String[] decimal_or_string(String[] args){
        String[] ret_arr = new String[args.length];
        int count=-1;
            for(int i=0; i<args.length;i++) {
                if(Pattern.matches("^[-+]?(\\d+(\\.\\d*)?|\\.\\d+)$", args[i])){
                    count++;
                    ret_arr[count]="Decimal";
                }
                else{
                    count++;
                    ret_arr[count]="String";
                }
            }
            return ret_arr;
        }
}
