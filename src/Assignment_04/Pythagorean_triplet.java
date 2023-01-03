package Assignment_04;

public class Pythagorean_triplet {

    public static void main(String[] args) {
        int a=3,b=4,c=5;
        int a_sqr=a*a,b_sqr=b*b,c_sqr=c*c;
        if(a_sqr+b_sqr==c_sqr){
            System.out.println("Pythagorean");
        }
        else {
            System.out.println("Not a pythogrean");
        }
    }

}
