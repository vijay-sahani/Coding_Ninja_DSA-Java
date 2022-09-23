package Lecture3_Recursion1.Assignment;

public class Q5_TowerOfHanoi {
    public static void towerOfHanoi(int disks,char source,char auxiliary,char destination){
        if (disks>0){
            if (disks==1){
                System.out.println(source+" Moved to "+destination);
                return ;
            }
            towerOfHanoi(disks-1,source,destination,auxiliary);// move to 1 disk to auxiliary space
            System.out.println(source+" Moved to "+destination);
            towerOfHanoi(disks-1,auxiliary,source,destination);// now move the disk from aux to dest space
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(2,'a','b','c');// Time Complexity 2^disks-1
    }
}

