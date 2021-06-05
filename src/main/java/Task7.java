/*Задание №7(Создайте программу для определения кода введенного
символа в 16-ном представлены в формате '\ uXXXX ".
Обеспечьте цикличность выполнения программы до ввода
символа пробел. Проверьте правильность работы программы,
воспользовавшись ею для получения кодов символов в любом
слове (например, "cat") и выведя на экран слово из
полученных кодов.)*/
public class Task7 {
    public static void main(String[] arg) throws java.io.IOException {
        System.out.print("Enter the symbol(quite to \" \"): ");
        char symbol = (char) System.in.read();
        Task7 ob = new Task7();
        while (symbol!=' '){
            System.out.print(ob.convert_to_Hex(symbol)+' ');
            symbol = (char) System.in.read();
        }
    }
    public String convert_to_Hex(char symbol) {
        String ret_arr = null;
            String ch = Integer.toHexString(symbol).toUpperCase();
            if(ch.toCharArray().length==1) {
                ret_arr="\\u000"+ ch;
            }
            else if(ch.toCharArray().length==2) {
                ret_arr="\\u00"+ch;
            }
            else if(ch.toCharArray().length==3) {
                ret_arr="\\u0"+ch;
            }
            else if(ch.toCharArray().length==4) {
                ret_arr="\\u"+ch;
            }
        return ret_arr;
    }
}
