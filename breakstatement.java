// public class breakstatement {
//     public static void main(String[] args) {
//         for(int i = 10; i<=20;i++){
//             System.out.println(i);
//             if(i==15)
//             {
//                 break;
//             }
//         }
//     }
// }





public class breakstatement {
    public static void main(String[] args) {
        for(int i = 10; i<=20;i++){
            System.out.println(i);
            if(i==15)
            {
                System.out.println("bad");
                continue;
            }
        }
    }
}