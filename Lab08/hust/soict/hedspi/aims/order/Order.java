package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.Track;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    private String dateOrdered;
//    public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED+1];
    public static int limitOrder = 5;
    private static int count = 0;
    Scanner sc = new Scanner(System.in);

    public static synchronized Order getInstance(){
        if(count < limitOrder){
            Order anOrder = new Order();
            count ++;
            return anOrder;
        }
        return null;
    }
    public Media getALuckyItem (){
        Random generator = new Random();
        int count = itemsOrdered.size();
        System.out.println(count);
        int ranItem = generator.nextInt(count) + 1;
        System.out.println(ranItem);
        itemsOrdered.get(ranItem).setCost(0f);
        return itemsOrdered.get(ranItem);
    }

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        this.dateOrdered = formatter.format(date);
    }

    public void addMedia(Media media) {
        if(itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Đã được thêm vào Order");
        }
        else {
            System.out.println("The list is already full!");
        }
    }

    public void addMedia(ArrayList<Media> medias ) {
        for (int i = 0; i < medias.size(); i++){
            addMedia(medias.get(i));
        }
    }
    public void addMediabyid(int id,ArrayList<Media> medias ){
        int count = 0;
        for(int i = 0; i < medias.size(); i++){
            if(medias.get(i).getId() == id){
                addMedia(medias.get(i));
                count ++;
                break;
            }
        }
        if(count == 0) System.out.println("Does not exist");
    }

    public void removeMedia(Media media) {
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
        }
        else {
            System.out.println(media.getTitle() + "is not in the list!");
        }
    }
    public void removeMedia(ArrayList<Media> medias){medias.clear();}

    public void removeMediabyid(ArrayList<Media> mediasOrdered, int id) {
        int count = 0;
        for (int i = 0; i < mediasOrdered.size(); i++) {
            if (mediasOrdered.get(i).getId() == id) {
                mediasOrdered.remove(i);
                count++;
                System.out.println("Đã xóa");

            }
        }
        if (count == 0) {
            System.out.println("id không tồn tại");
        }
    }
    public float totalCost() {
        float total = 0;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public void show(ArrayList <Media> itemsOrdered){
        System.out.println("-----------------------------------");
        for (int i =0; i < itemsOrdered.size(); i++){
            System.out.println(i + 1 + "." + itemsOrdered.get(i).showInfo());
        }
        System.out.println("-----------------------------------");

    }
    //số lượng món hàng có id = id
    public int checkid(ArrayList <Media> itemsOrdered,int id){
        int count = 0;
        for(int i=0; i<itemsOrdered.size(); i++){
            if(itemsOrdered.get(i).getId() == id){
                count++;
            }
        }
        return count;
    }


    public Order() {
        setDateOrdered();
    }

}
