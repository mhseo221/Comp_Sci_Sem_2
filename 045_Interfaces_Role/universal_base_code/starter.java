import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter{
    public static void main(String args[]) {
        Role [] a = new Role[3];
        a[0] = new Wizard();
        a[1] = new Warrior();
        a[2] = new Ranger();
        for(int i =0; i<a.length; i++){
            a[i].setName();
        }
    }
}
