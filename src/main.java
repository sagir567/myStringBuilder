public class main {



    public static void main(String[] args){

    myStringBuilder usb = new myStringBuilder();
    usb.append("to be or not to be") ;
    System.out.println(usb) ;
    usb.replace(3, 5, "eat") ;
    System.out.println(usb) ;
    usb.replace(17, 19, "eat") ;
    System.out.println(usb) ;
    usb.reverse();
    System.out.println(usb) ;

    usb.undo();
    System.out.println(usb);
    usb.undo();
    System.out.println(usb);
    usb.undo ();
    System.out.println(usb) ;
    }
}
