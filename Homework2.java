import java.util.Scanner;

class Homework2{
  Homework2(){
    int problem;
    Scanner input = new Scanner( System.in );
    while(true){
      System.out.println("Introduceti nr problemei din tema:");
      problem = input.nextInt();

      switch (problem){
        case 1: { one(); break; }
        case 2: { two(); break; }
        case 3: { three(); break; }
        case 4: { four(); break; }
        case 5: { five(); break; }
        case 6: { six(); break; }
        default: System.out.println("def");
      }
    }
  }

  public void one(){
    int n;
    double up=0, down=0, b, a=0;//numarator/numitor, buffer
    Scanner input = new Scanner( System.in );

    n = input.nextInt();

    for(int i=0; i<n*2;i++){
      b = input.nextDouble();

      if(i%2==0){
        a = b;
      }
      else{
        up+= a*b;
        down+= b;
      }
    }

    System.out.println(up/down);
  }

  public void two(){
    int i=0;
    double n, sum=0, b;
    Scanner input = new Scanner( System.in );
    n = input.nextDouble();
    while(i<n){
      b = input.nextDouble();
      sum+=1/b;
      i++;
    }
    System.out.println( n/sum );
  }

  public void three(){
    double[] v= new double[3];
    double max=-111111, sum=0;
    int i=0;
    Scanner input = new Scanner( System.in );

    for(int j=0;j<3;j++){
      v[j] = input.nextDouble();
      if(v[j]>max){
        i=j;
        max = v[j];
      }
    }

    for (int j=0;j<3 ;j++ ) {
      if(j!=i){
        sum+=v[j]*v[j];
      }
    }
    if(max*max == sum)
      System.out.println("Numerele sunt pitagoreice");
    else
      System.out.println("Numerele nu sunt pitagoreice");
  }

  public void four(){
    Scanner input = new Scanner( System.in );
    int n;
    n = input.nextInt();
    double sum=0, it=1;
    for( int i=0; i<n ; i++, it+=2){
      if(i%2==0)
        sum+=1/it;
      else
        sum-=1/it;
    }
    System.out.println(4*sum);
  }

  public void five(){
    Scanner input = new Scanner( System.in );
    int n;
    long a, b, t ;
    a = b = 1;
    n = input.nextInt();
    for(int i = 0; i<=n ; i++){
      if(i==0)
        System.out.println(i);
      else
        if(i<3)
          System.out.println(1);
        else{
          t = a+b;
          System.out.println(t);
          a=b;
          b=t;
        }
    }
  }

  public void six(){
    Scanner input = new Scanner( System.in );
    int nr, base;
    nr = input.nextInt();
    base = input.nextInt();
    System.out.println( Integer.toString(nr, base) );
  }

  public static void main(String[] args) {
    Homework2 ob = new Homework2();

  }
}