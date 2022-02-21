# dsa-practice
Do not modify input data, its bad practice.
Create function for repeatative task.

length of int => (int) (Math.log10(number) + 1) => 123=>3
chatAt to int => "123".charAt(0)-'0' => 1

XOR PROPERTY<br>
A^1= invert of A<br>
A^0=A<br>
A'^A=0<br>
Print hashmap for debuging or use debugger<br>
System.out.println(Arrays.asList(map));<br>
Started on 12 feb 2022

15 feb 2022 => 100 total questions <br>
Easy   Medium  Hard<br>
77/546 22/1159 1/468<br>

Convert arraylist to int[]<br>
public static int[] convertIntegers(List<Integer> integers)
{
    int[] ret = new int[integers.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = integers.get(i).intValue();
    }
    return ret;
}
