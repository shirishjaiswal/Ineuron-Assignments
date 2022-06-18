class Telusko{
    public static void main(String[] args) {
        System.out.println("TELUSKO");
        for(int i=0; i<5; i++){
            for (int j=0; j<41; j++){
                if (j==5 || j==11 || j==17 || j==23 || j==29 || j==35){
                    System.out.print("  ");
                }
                else if (j==2 || j==6 || j== 12|| j==18 || j==22 || j==30 || j==36 || j==40){
                    System.out.print("* ");
                }
                else if (i==0){
                    if (j>=0 && j<=10 || j>=24 && j<=28 || j==34 || j>=34 && j<=39)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else if (i==1){
                    if (j==24 || j==33)
                    System.out.print("* ");
                    else 
                        System.out.print("  ");
                }
                else if (i==2){
                    if (j>=7 && j<=10 || j>=24 && j<=32)
                    System.out.print("* ");
                    else 
                        System.out.print("  ");
                }
                else if (i==3){
                    if (j==28 || j==33)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                else if (i==4){
                    if (j>=7 && j<=28 || j>=34 && j<=39)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                
                }
                System.out.println();
            }
        }
    }