package stringBuffer;
public class StringBufferTest01 {
    public static void main(String[] args) {
       /* String s="";
        for(int i=0;i<100;i++){
            s+=i;
            System.out.println(s);
    }*/
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("d");
        stringBuffer.append("asdfsa111");
        stringBuffer.append(101);
        stringBuffer.append(true);
        stringBuffer.append("    ");
        stringBuffer.append(100L);
        System.out.println(stringBuffer);                              //abdasdfsa111101true    100
        StringBuffer sb=new StringBuffer(100);
        sb.append("hello");
        sb.append("world");
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb);     //helloworldhellokitty
    }
}
