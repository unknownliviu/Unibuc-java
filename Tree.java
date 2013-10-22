import java.util.Scanner;

class Node{
  private
    int val;
    Node left, right;
  Node(int v){
    val = v;
    left = null;
    right = null;
  }
  public void set_left_son(int v, boolean valid){
    if(valid)
      this.left= new Node(v);
  }
  public void set_right_son(int v, boolean valid){
    if(valid)
      this.right= new Node(v);
  }
}

class Tree{
  private
  Node root;
  int n;
  int[] vect = new int[1000];
  int[] left = new int[1000];
  int[] right = new int[1000];
    

  Tree(){
    read_vector();
    //root = new Node(vect[i]);
  }

  void read_vector(){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    if(n>1000 || n<1){
      System.out.println("number too big|small");
      return;
    }

    for (int i=1;i<=n ;i++ )
      vect[i]= sc.nextInt();

    for (int i=1;i<=n ;i++ )
      left[i]= sc.nextInt();
    
    for (int i=1;i<=n ;i++ )
      right[i]= sc.nextInt();    

  }

  public void rsd(int i){
    if(i==0)
      return;
    System.out.println(vect[i]);
    rsd(left[i]);
    rsd(right[i]);
  }
  public static void main(String[] args) {
    System.out.println("helo");
    Tree a= new Tree();
    a.rsd(1);
    //a.read_vector();
  }
}