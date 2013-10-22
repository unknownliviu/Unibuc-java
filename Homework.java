import java.util.Scanner;

class Homework{

  private int n, k;
  private int[] vect = new int[100];

  Homework(){
    System.out.println("Buna, citeste n, k \n"+
      "urmate de n intregi!\n");
    Set_vect();//apelez aici setterul
  }

  public void Set_vect(){

    Scanner input = new Scanner( System.in );
    
    this.n = input.nextInt();
    this.k = input.nextInt();

    if(n<0 || n>100 || k>n || k<0){
      System.out.println("Ai gresit!\n"+
        "Citeste din nou n si k, te rog.");
      Set_vect();
      return;
    }

    for(int i=0; i<n; i++){
      this.vect[i] = input.nextInt();
    }
  }

  public void Get_vect(){
    String row = new String("");
    System.out.println("Vectorul este: ");
    
    for(int i=0; i<n; i++)
      row+=vect[i]+" ";

    System.out.println(row);
  }

  public void Get_k(){
    System.out.println("Al "+k+"-lea element: ");
    System.out.println(vect[k-1]);
  }

  public static void main(String[] args) {
    Homework object = new Homework();
    //object.Get_vect(); 
    object.Get_k(); 
  }
}