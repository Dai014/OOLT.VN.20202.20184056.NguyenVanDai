package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.AbstractItemFactory;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class CDFactory implements AbstractItemFactory {
    @Override
    public Media createItemFromConsole() {
        CompactDisc cd = new CompactDisc();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap title: "); cd.setTitle(sc.nextLine());
        System.out.println("Nhap Category: "); cd.setCategory(sc.nextLine());
        System.out.println("Nhap Cost: "); cd.setCost(sc.nextFloat());
        sc.nextLine();
        System.out.println("Nhap director: "); cd.setDirector(sc.nextLine());
        System.out.println("Nhap artist: "); cd.setArtist(sc.nextLine());
        System.out.print("Nhap so luong bai: "); int number = sc.nextInt();

        ArrayList<Track> tracks = new ArrayList<>();

        for(int i = 0; i < number; i++){
            sc.nextLine();
            System.out.println(" Nhap title: "); String titletrask = sc.nextLine();
            System.out.println("Nhap length of trask: "); int length = sc.nextInt();
            Track track = new Track(titletrask, length);
            tracks.add(track);
        }
        cd.getLength(tracks);
        System.out.println("Do you want to play?\n1.Yes  2.No");
        System.out.print("You choose: ");
        int chon = sc.nextInt();
        sc.nextLine();
        boolean check = true;
        do{
            switch(chon){
                case 1:
                    cd.play();
                    check = false;
                    break;
                case 2:
                    check = false;
                    break;
                default:
                    System.out.println("Enter incorrectly, re-enter");
                    break;
            }
        }while(check);
        return cd;
    }
}
