//By Yam Jam
import java.util.Random;
public class Main{
	public static void main(String[] args) {





		System.out.println("Welcome.");
		System.out.println("To a smol hangman game.");
		System.out.println(" ");


        char pw[] = new char[20];
		String str[] = new String[]{"galaxy","structure","refrigerator","turtle","ostrich","caramel","chocolate","kangaroo","umbrella",
		"caterpillar","elephant","penguin","robot","ribbon","alien","skunk","jackal","donkey","shark","leopard","jaguar",
		"badger","raccoon","eagle","monkey","beaver"};
		
		char uc[] = new char[50]; //used character
		int nuc = 0; //number of used characters

		Random rand = new Random();
        int a = rand.nextInt(str.length);

        int qq = 0;
        int t = 7;

        boolean dead = false;
        boolean win = false;
        String ref = str[a];


        for(int i = 0;i<str[a].length();i++){
            pw[i] = '_';
        }
        System.out.println(pw);


        while (dead == false && win == false){

        char x = (System.console().readLine()).charAt(0);


        int w = (str[a].length());

        boolean check = false;
        for (int p=0;p<w;p++){
            char y = str[a].charAt(p);
            if (x == y){
            qq++;

                pw[p] = x;
                check = true;
            }
            else{


            }

        }
        System.out.println(pw);

        System.out.println(" ");

        boolean checkChar = false; //checks if we used the input already
        if(check == true){

            }
            else{
                for(int i = 0;i<nuc;i++){
                if(uc[i]==x){
                    checkChar = true;
                    }
                }
                
                t = t-1;
                
                if(checkChar==true){
                    t++;
                    System.out.println("You already tried this letter.");
                }
                else{
                    uc[nuc] = x;
                    nuc++;
                }

                }

            if(checkChar==false){
            System.out.println("You have "+t+" lives left.");
            }
            
            if (qq == str[a].length()){
            win = true;
            System.out.println(" ");
            System.out.println("Congrats! You won the game of smol hangman!! Now go brag to your friends.");
            System.out.println(" ");
            System.out.println("WORD: "+str[a]);
            System.out.println("You had "+t+" lives left.");
            }

            if (t == 0){
            dead = true;
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Oof. Better luck next time!");
        }

        }
	}






	}
