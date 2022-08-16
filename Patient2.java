package doctor1;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class Patient2 {
    public static  void main(String[] args) {
        List<Doctor2> d = new ArrayList<Doctor2>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.REMOVE");                   // list interface methods
            System.out.println("5.SET");
            System.out.println("6.CONTAINS");
            System.out.println("7.SORT");
            System.out.println("8.GET");
            System.out.println("9.SIZE");
            System.out.println("10.IS-EMPTY");
            System.out.println("11.RETAIN-All");
            System.out.println("12.INDEX-OF");
            System.out.println("13.SUB-LIST");
            System.out.println("14.TO-ARRAY");
            System.out.println("Enter Your Choice:");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter pno:");
                    int pno = s.nextInt();
                    System.out.print("Enter pname");
                    String pname = s1.nextLine();
                    System.out.print("Enter pdisease");
                    String pdisease = s1.nextLine();
                    d.add(new Doctor2(pno, pname, pdisease));
                    break;
                case 2:
                    System.out.println("--------------------------");
                    Iterator<Doctor2> i = d.iterator();
                    while (i.hasNext()) {
                        Doctor2 e = i.next();
                        System.out.println(e);

                    }
                    System.out.println("---------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter pno to search:");
                    int pnum = s.nextInt();
                    i = d.iterator();
                    while (i.hasNext()) {
                        Doctor2 d1 = i.next();
                        if (d1.getPno() == pnum) {
                            System.out.println(d1);
                            found = true;
                            if (!found) {
                                System.out.println("Record not found");
                            }
                        }
                    }
                    System.out.println("--------------------------");

                    break;
                case 4:
                    found = false;
                    System.out.println("Enter pno to Delete:");
                    pnum = s.nextInt();
                    System.out.println("-----------------------");
                    i = d.iterator();
                    while (i.hasNext()) {
                        Doctor2 d1 = i.next();
                        if (d1.getPno() == pnum) {
                            i.remove();                                        //remove method(for deleting elements)
                            found = true;
                            if (!found) {
                                System.out.println("Record not found");
                            } else {
                                System.out.println("Record is Deleted Successfully!");
                            }
                        }
                    }
                    System.out.println("--------------------------");

                    break;
                case 5:
                    found = false;
                    System.out.println("Enter pno to Update:");
                    pnum = s.nextInt();
                    System.out.println("--------------------------");
                    ListIterator<Doctor2> li = d.listIterator();
                    while (li.hasNext()) {
                        Doctor2 d1 = li.next();
                        if (d1.getPno() == pnum) {
                            System.out.println("Enter new Name:");
                            pname = s1.nextLine();
                            pno = s.nextInt();
                            pdisease = s.nextLine();
                            li.set(new Doctor2(pno, pname, pdisease));         //set method(Update the data)
                            found = true;

                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Updated Sucessfully");
                    }
                    break;
                case 6:

                    System.out.println(s.nextLine());
                    System.out.println("enter contains element");
                    System.out.println(s.nextLine().contains("s"));          //contains method(returns true or false based on containing data)
                    break;

                case 7:
                    System.out.println("enter ele in arraylist");
                    List<Integer> l = new ArrayList<>();
                    l.add(s.nextInt());
                    l.add(s.nextInt());
                    l.add(s.nextInt());

                    List<Integer> t = l.stream().sorted().collect(Collectors.toList());      //sort method (for sorting elements)
                    System.out.println(t);
                    break;
                case 8:
                    List<Doctor2> list = new LinkedList<>();
                    Doctor2 d1 = new Doctor2(12, "josna", "cold");
                    list.add(d1);
                    Doctor2 d2 = list.get(0);                                              // get method(for retrieving elements)
                    System.out.println(d2);
                    break;


                case 9:
                    List<Doctor2> s3= new LinkedList<>();
                    s3.add(new Doctor2(12,"pravali","fever"));
                    s3.add(new Doctor2(13,"josuu","cold"));
                    s3.add(new Doctor2(14,"jyothi","cough"));
                    System.out.println("total patients:" +s3.size());                     //size method(for checking the size)
                    for(Doctor2 val:s3) {
                        System.out.println(val);

                        break;




                    }
                case 10:
                    List<Character> c= new LinkedList<Character>();
                    c.add(null);
                    Boolean b=c.isEmpty();                                                      //is-empty method(for checking the list)
                    if(b){
                        System.out.println("Enter elements in this list it is empty");

                    }
                    else{
                        System.out.println("Elements are already present in this list:" +b);
                    }

                    break;
                case 11:
                    Collection<Character> collection=new ConcurrentLinkedQueue<Character>();
                    char i1;
                    for(i1='a'; i1 <= 'z'; i1++) {
                        collection.add(i1);
                    }
                    System.out.println("collection:" +collection);

                    List<Character> list1= new ArrayList<Character>();
                    list1.add('j');
                    list1.add('o');
                    list1.add('s');
                    list1.add('n');
                    list1.add('a');                                               // retains-all method returns only elements present inside the collection
                    collection.retainAll(list1);
                    System.out.println("name:" +collection);


                    break;
                case 12:
                    List<Integer> list2=new LinkedList<>();
                    list2.add(12);
                    list2.add(13);
                    list2.add(14);
                    int value=list2.indexOf(13);                                      //indexOf method returns index of paticular element
                    System.out.println("element stored at index" +0+":"+value);
                    break;
                case 13:
                    List<Character> list3=new LinkedList<>();
                    for(char c1='a';c1<='z';c1++){
                        list3.add(c1);
                    }
                    System.out.println("total alphabets:" +list3.size());          //sublist method returns the elements from from index and toindex
                    System.out.println("list:" +list3.subList(1,23));
                    break;
                case 14:
                    List<Character> list4=new LinkedList<>();
                    for(char i2='a';i2<='z';i2++){
                        list4.add(i2);
                    }
                    System.out.println("Alphabets:");
                    Object[] a= list4.toArray();              // To-ARRAY Method returns the array that contains the all elements in list in proper order
                    System.out.println();
                    for(int i3=0;i3<a.length;i3++){
                        System.out.println(i3++ +":" +a[i3]);
                    }
                    break;


            }

        }while (ch!=0);
    }
}




